import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class74 extends class24 {

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "[B")
    public byte[] field985;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "Lkb;")
    public class80 field984;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V", line = 3)
    public final void method415() {
        this.field984 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ldk;II)Lqa;", line = 11)
    public static final class74 method416(class241 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1647(arg1, (byte) 122, arg2);
        return var3 == null ? null : new class74(new class153(var3));
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lj;)V", line = 20)
    private class74(class153 arg0) {
        arg0.field2367 = arg0.field2359.length - 3;
        int var2 = arg0.method1042((byte) -14);
        int var3 = arg0.method1069(76);
        int var4 = var2 * 10 + 14;
        arg0.field2367 = 0;
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
                int var15 = arg0.method1042((byte) -22);
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
        int var19 = arg0.field2367;
        int var20 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var21 = 0; var21 < var20; var21++) {
            arg0.method1082(-125);
        }
        int var22 = arg0.field2367 + var18 - var19;
        int var23 = arg0.field2367;
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
            var36 = var36 + arg0.method1042((byte) -120) & 0x7F;
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
        int var39 = arg0.field2367;
        arg0.field2367 += var34;
        int var40 = arg0.field2367;
        arg0.field2367 += var11;
        int var41 = arg0.field2367;
        arg0.field2367 += var10;
        int var42 = arg0.field2367;
        arg0.field2367 += var9;
        int var43 = arg0.field2367;
        arg0.field2367 += var24;
        int var44 = arg0.field2367;
        arg0.field2367 += var26;
        int var45 = arg0.field2367;
        arg0.field2367 += var28;
        int var46 = arg0.field2367;
        arg0.field2367 += var7 + var8 + var11;
        int var47 = arg0.field2367;
        arg0.field2367 += var7;
        int var48 = arg0.field2367;
        arg0.field2367 += var35;
        int var49 = arg0.field2367;
        arg0.field2367 += var8;
        int var50 = arg0.field2367;
        arg0.field2367 += var25;
        int var51 = arg0.field2367;
        arg0.field2367 += var27;
        int var52 = arg0.field2367;
        arg0.field2367 += var29;
        int var53 = arg0.field2367;
        arg0.field2367 += var12;
        int var54 = arg0.field2367;
        arg0.field2367 += var9;
        int var55 = arg0.field2367;
        arg0.field2367 += var30;
        int var56 = arg0.field2367;
        arg0.field2367 += var31;
        int var57 = arg0.field2367;
        arg0.field2367 += var32;
        int var58 = arg0.field2367;
        arg0.field2367 += var33;
        int var59 = arg0.field2367;
        arg0.field2367 += var5 * 3;
        this.field985 = new byte[var22];
        class153 var60 = new class153(this.field985);
        var60.method1045(1297377380, (byte) 20);
        var60.method1045(6, (byte) 85);
        var60.method1047(93, var2 > 1 ? 1 : 0);
        var60.method1047(-94, var2);
        var60.method1047(113, var3);
        arg0.field2367 = var19;
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
            var60.method1045(1297379947, (byte) 42);
            var60.field2367 += 4;
            int var71 = var60.field2367;
            int var72 = -1;
            while (true) {
                while (true) {
                    int var73 = arg0.method1082(-68);
                    var60.method1058(395196840, var73);
                    int var74 = arg0.field2359[var38++] & 0xFF;
                    boolean var75 = var72 != var74;
                    var72 = var74 & 0xF;
                    if (var74 == 7) {
                        if (var75) {
                            var60.method1095(255, -108);
                        }
                        var60.method1095(47, -63);
                        var60.method1095(0, -73);
                        var60.method1084(var60.field2367 - var71, -463196376);
                        continue label223;
                    }
                    if (var74 == 23) {
                        if (var75) {
                            var60.method1095(255, -36);
                        }
                        var60.method1095(81, -107);
                        var60.method1095(3, -120);
                        var60.method1095(arg0.field2359[var59++], -63);
                        var60.method1095(arg0.field2359[var59++], -47);
                        var60.method1095(arg0.field2359[var59++], -57);
                    } else {
                        var61 ^= var74 >> 4;
                        if (var72 == 0) {
                            if (var75) {
                                var60.method1095(var61 + 144, -99);
                            }
                            var62 += arg0.field2359[var46++];
                            var63 += arg0.field2359[var47++];
                            var60.method1095(var62 & 0x7F, -116);
                            var60.method1095(var63 & 0x7F, -71);
                        } else if (var72 == 1) {
                            if (var75) {
                                var60.method1095(var61 + 128, -101);
                            }
                            var62 += arg0.field2359[var46++];
                            var64 += arg0.field2359[var49++];
                            var60.method1095(var62 & 0x7F, -49);
                            var60.method1095(var64 & 0x7F, -58);
                        } else if (var72 == 2) {
                            if (var75) {
                                var60.method1095(var61 + 176, -110);
                            }
                            var69 = var69 + arg0.field2359[var23++] & 0x7F;
                            var60.method1095(var69, -98);
                            byte var76;
                            if (var69 == 0 || var69 == 32) {
                                var76 = arg0.field2359[var53++];
                            } else if (var69 == 1) {
                                var76 = arg0.field2359[var43++];
                            } else if (var69 == 33) {
                                var76 = arg0.field2359[var50++];
                            } else if (var69 == 7) {
                                var76 = arg0.field2359[var44++];
                            } else if (var69 == 39) {
                                var76 = arg0.field2359[var51++];
                            } else if (var69 == 10) {
                                var76 = arg0.field2359[var45++];
                            } else if (var69 == 42) {
                                var76 = arg0.field2359[var52++];
                            } else if (var69 == 99) {
                                var76 = arg0.field2359[var55++];
                            } else if (var69 == 98) {
                                var76 = arg0.field2359[var56++];
                            } else if (var69 == 101) {
                                var76 = arg0.field2359[var57++];
                            } else if (var69 == 100) {
                                var76 = arg0.field2359[var58++];
                            } else if (var69 == 64 || var69 == 65 || var69 == 120 || var69 == 121 || var69 == 123) {
                                var76 = arg0.field2359[var39++];
                            } else {
                                var76 = arg0.field2359[var48++];
                            }
                            int var77 = var68[var69] + var76;
                            var68[var69] = var77;
                            var60.method1095(var77 & 0x7F, -94);
                        } else if (var72 == 3) {
                            if (var75) {
                                var60.method1095(var61 + 224, -73);
                            }
                            int var78 = var65 + arg0.field2359[var54++];
                            var65 = var78 + (arg0.field2359[var42++] << 7);
                            var60.method1095(var65 & 0x7F, -99);
                            var60.method1095(var65 >> 7 & 0x7F, -108);
                        } else if (var72 == 4) {
                            if (var75) {
                                var60.method1095(var61 + 208, -46);
                            }
                            var66 += arg0.field2359[var41++];
                            var60.method1095(var66 & 0x7F, -103);
                        } else if (var72 == 5) {
                            if (var75) {
                                var60.method1095(var61 + 160, -89);
                            }
                            var62 += arg0.field2359[var46++];
                            var67 += arg0.field2359[var40++];
                            var60.method1095(var62 & 0x7F, -99);
                            var60.method1095(var67 & 0x7F, -35);
                        } else if (var72 == 6) {
                            if (var75) {
                                var60.method1095(var61 + 192, -77);
                            }
                            var60.method1095(arg0.field2359[var53++], -48);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V", line = 501)
    public final void method417() {
        if (this.field984 != null) {
            return;
        }
        this.field984 = new class80(16);
        int[] var1 = new int[16];
        int[] var2 = new int[16];
        var1[9] = var2[9] = 128;
        class84 var3 = new class84(this.field985);
        int var4 = var3.method567();
        for (int var5 = 0; var5 < var4; var5++) {
            var3.method562(var5);
            var3.method577(var5);
            var3.method569(var5);
        }
        label52: do {
            while (true) {
                int var6 = var3.method563();
                int var7 = var3.field1268[var6];
                while (var3.field1268[var6] == var7) {
                    var3.method562(var6);
                    int var8 = var3.method574(var6);
                    if (var8 == 1) {
                        var3.method576();
                        var3.method569(var6);
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
                            class200 var19 = (class200) this.field984.method493((long) var18, 122);
                            if (var19 == null) {
                                var19 = new class200(new byte[128]);
                                this.field984.method490(var19, (long) var18, true);
                            }
                            var19.field3297[var16] = 1;
                        }
                    }
                    var3.method577(var6);
                    var3.method569(var6);
                }
            }
        } while (!var3.method572());
    }
}
