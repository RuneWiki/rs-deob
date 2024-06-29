import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class274 extends class147 {

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "[B")
    public byte[] field4576;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "Lsc;")
    public class259 field4575;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()V", line = 3)
    public final void method1939() {
        this.field4575 = null;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "()V", line = 9)
    public final void method1940() {
        if (this.field4575 != null) {
            return;
        }
        this.field4575 = new class259(16);
        int[] var1 = new int[16];
        int[] var2 = new int[16];
        var1[9] = var2[9] = 128;
        class162 var3 = new class162(this.field4576);
        int var4 = var3.method1099();
        for (int var5 = 0; var5 < var4; var5++) {
            var3.method1101(var5);
            var3.method1102(var5);
            var3.method1106(var5);
        }
        label52: do {
            while (true) {
                int var6 = var3.method1107();
                int var7 = var3.field2517[var6];
                while (var3.field2517[var6] == var7) {
                    var3.method1101(var6);
                    int var8 = var3.method1100(var6);
                    if (var8 == 1) {
                        var3.method1109();
                        var3.method1106(var6);
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
                            class202 var19 = (class202) this.field4575.method1827((long) var18, 0);
                            if (var19 == null) {
                                var19 = new class202(new byte[128]);
                                this.field4575.method1826(1, var19, (long) var18);
                            }
                            var19.field3143[var16] = 1;
                        }
                    }
                    var3.method1102(var6);
                    var3.method1106(var6);
                }
            }
        } while (!var3.method1096());
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lve;II)Lrf;", line = 118)
    public static final class274 method1941(class266 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1889(arg1, (byte) -122, arg2);
        return var3 == null ? null : new class274(new class82(var3));
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lwa;)V", line = 126)
    private class274(class82 arg0) {
        arg0.field1301 = arg0.field1280.length - 3;
        int var2 = arg0.method642((byte) -34);
        int var3 = arg0.method576(1);
        int var4 = var2 * 10 + 14;
        arg0.field1301 = 0;
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
                int var15 = arg0.method642((byte) -118);
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
        int var19 = arg0.field1301;
        int var20 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var21 = 0; var21 < var20; var21++) {
            arg0.method580((byte) 127);
        }
        int var22 = arg0.field1301 + var18 - var19;
        int var23 = arg0.field1301;
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
            var36 = var36 + arg0.method642((byte) -80) & 0x7F;
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
        int var39 = arg0.field1301;
        arg0.field1301 += var34;
        int var40 = arg0.field1301;
        arg0.field1301 += var11;
        int var41 = arg0.field1301;
        arg0.field1301 += var10;
        int var42 = arg0.field1301;
        arg0.field1301 += var9;
        int var43 = arg0.field1301;
        arg0.field1301 += var24;
        int var44 = arg0.field1301;
        arg0.field1301 += var26;
        int var45 = arg0.field1301;
        arg0.field1301 += var28;
        int var46 = arg0.field1301;
        arg0.field1301 += var7 + var8 + var11;
        int var47 = arg0.field1301;
        arg0.field1301 += var7;
        int var48 = arg0.field1301;
        arg0.field1301 += var35;
        int var49 = arg0.field1301;
        arg0.field1301 += var8;
        int var50 = arg0.field1301;
        arg0.field1301 += var25;
        int var51 = arg0.field1301;
        arg0.field1301 += var27;
        int var52 = arg0.field1301;
        arg0.field1301 += var29;
        int var53 = arg0.field1301;
        arg0.field1301 += var12;
        int var54 = arg0.field1301;
        arg0.field1301 += var9;
        int var55 = arg0.field1301;
        arg0.field1301 += var30;
        int var56 = arg0.field1301;
        arg0.field1301 += var31;
        int var57 = arg0.field1301;
        arg0.field1301 += var32;
        int var58 = arg0.field1301;
        arg0.field1301 += var33;
        int var59 = arg0.field1301;
        arg0.field1301 += var5 * 3;
        this.field4576 = new byte[var22];
        class82 var60 = new class82(this.field4576);
        var60.method577(-121, 1297377380);
        var60.method577(-128, 6);
        var60.method643(-20037, var2 > 1 ? 1 : 0);
        var60.method643(-20037, var2);
        var60.method643(-20037, var3);
        arg0.field1301 = var19;
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
            var60.method577(-125, 1297379947);
            var60.field1301 += 4;
            int var71 = var60.field1301;
            int var72 = -1;
            while (true) {
                while (true) {
                    int var73 = arg0.method580((byte) 113);
                    var60.method610(17038, var73);
                    int var74 = arg0.field1280[var38++] & 0xFF;
                    boolean var75 = var72 != var74;
                    var72 = var74 & 0xF;
                    if (var74 == 7) {
                        if (var75) {
                            var60.method591((byte) -121, 255);
                        }
                        var60.method591((byte) -45, 47);
                        var60.method591((byte) -72, 0);
                        var60.method581(83, var60.field1301 - var71);
                        continue label223;
                    }
                    if (var74 == 23) {
                        if (var75) {
                            var60.method591((byte) -49, 255);
                        }
                        var60.method591((byte) -54, 81);
                        var60.method591((byte) -16, 3);
                        var60.method591((byte) -126, arg0.field1280[var59++]);
                        var60.method591((byte) -99, arg0.field1280[var59++]);
                        var60.method591((byte) -76, arg0.field1280[var59++]);
                    } else {
                        var61 ^= var74 >> 4;
                        if (var72 == 0) {
                            if (var75) {
                                var60.method591((byte) -60, var61 + 144);
                            }
                            var62 += arg0.field1280[var46++];
                            var63 += arg0.field1280[var47++];
                            var60.method591((byte) -98, var62 & 0x7F);
                            var60.method591((byte) -112, var63 & 0x7F);
                        } else if (var72 == 1) {
                            if (var75) {
                                var60.method591((byte) -55, var61 + 128);
                            }
                            var62 += arg0.field1280[var46++];
                            var64 += arg0.field1280[var49++];
                            var60.method591((byte) -76, var62 & 0x7F);
                            var60.method591((byte) -57, var64 & 0x7F);
                        } else if (var72 == 2) {
                            if (var75) {
                                var60.method591((byte) -81, var61 + 176);
                            }
                            var69 = var69 + arg0.field1280[var23++] & 0x7F;
                            var60.method591((byte) -17, var69);
                            byte var76;
                            if (var69 == 0 || var69 == 32) {
                                var76 = arg0.field1280[var53++];
                            } else if (var69 == 1) {
                                var76 = arg0.field1280[var43++];
                            } else if (var69 == 33) {
                                var76 = arg0.field1280[var50++];
                            } else if (var69 == 7) {
                                var76 = arg0.field1280[var44++];
                            } else if (var69 == 39) {
                                var76 = arg0.field1280[var51++];
                            } else if (var69 == 10) {
                                var76 = arg0.field1280[var45++];
                            } else if (var69 == 42) {
                                var76 = arg0.field1280[var52++];
                            } else if (var69 == 99) {
                                var76 = arg0.field1280[var55++];
                            } else if (var69 == 98) {
                                var76 = arg0.field1280[var56++];
                            } else if (var69 == 101) {
                                var76 = arg0.field1280[var57++];
                            } else if (var69 == 100) {
                                var76 = arg0.field1280[var58++];
                            } else if (var69 == 64 || var69 == 65 || var69 == 120 || var69 == 121 || var69 == 123) {
                                var76 = arg0.field1280[var39++];
                            } else {
                                var76 = arg0.field1280[var48++];
                            }
                            int var77 = var68[var69] + var76;
                            var68[var69] = var77;
                            var60.method591((byte) -13, var77 & 0x7F);
                        } else if (var72 == 3) {
                            if (var75) {
                                var60.method591((byte) -59, var61 + 224);
                            }
                            int var78 = var65 + arg0.field1280[var54++];
                            var65 = var78 + (arg0.field1280[var42++] << 7);
                            var60.method591((byte) -48, var65 & 0x7F);
                            var60.method591((byte) -33, var65 >> 7 & 0x7F);
                        } else if (var72 == 4) {
                            if (var75) {
                                var60.method591((byte) -33, var61 + 208);
                            }
                            var66 += arg0.field1280[var41++];
                            var60.method591((byte) -35, var66 & 0x7F);
                        } else if (var72 == 5) {
                            if (var75) {
                                var60.method591((byte) -24, var61 + 160);
                            }
                            var62 += arg0.field1280[var46++];
                            var67 += arg0.field1280[var40++];
                            var60.method591((byte) -106, var62 & 0x7F);
                            var60.method591((byte) -83, var67 & 0x7F);
                        } else if (var72 == 6) {
                            if (var75) {
                                var60.method591((byte) -45, var61 + 192);
                            }
                            var60.method591((byte) -89, arg0.field1280[var53++]);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }
}
