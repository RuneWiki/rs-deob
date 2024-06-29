import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class7 extends class59 {

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "[B")
    public byte[] field97;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "Lfl;")
    public class86 field96;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()V", line = 3)
    public final void method27() {
        if (this.field96 != null) {
            return;
        }
        this.field96 = new class86(16);
        int[] var1 = new int[16];
        int[] var2 = new int[16];
        var1[9] = var2[9] = 128;
        class84 var3 = new class84(this.field97);
        int var4 = var3.method601();
        for (int var5 = 0; var5 < var4; var5++) {
            var3.method597(var5);
            var3.method604(var5);
            var3.method596(var5);
        }
        label52: do {
            while (true) {
                int var6 = var3.method590();
                int var7 = var3.field1215[var6];
                while (var3.field1215[var6] == var7) {
                    var3.method597(var6);
                    int var8 = var3.method593(var6);
                    if (var8 == 1) {
                        var3.method603();
                        var3.method596(var6);
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
                            class140 var19 = (class140) this.field96.method617((long) var18, false);
                            if (var19 == null) {
                                var19 = new class140(new byte[128]);
                                this.field96.method610(122, var19, (long) var18);
                            }
                            var19.field2152[var16] = 1;
                        }
                    }
                    var3.method604(var6);
                    var3.method596(var6);
                }
            }
        } while (!var3.method592());
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "()V", line = 109)
    public final void method28() {
        this.field96 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lmh;II)Ldc;", line = 116)
    public static final class7 method29(class65 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method454(arg1, 0, arg2);
        return var3 == null ? null : new class7(new class112(var3));
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Llb;)V", line = 126)
    private class7(class112 arg0) {
        arg0.field1640 = arg0.field1607.length - 3;
        int var2 = arg0.method792(2);
        int var3 = arg0.method759((byte) -59);
        int var4 = var2 * 10 + 14;
        arg0.field1640 = 0;
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
                int var15 = arg0.method792(2);
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
        int var19 = arg0.field1640;
        int var20 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var21 = 0; var21 < var20; var21++) {
            arg0.method772((byte) -44);
        }
        int var22 = arg0.field1640 + var18 - var19;
        int var23 = arg0.field1640;
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
            var36 = var36 + arg0.method792(2) & 0x7F;
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
        int var39 = arg0.field1640;
        arg0.field1640 += var34;
        int var40 = arg0.field1640;
        arg0.field1640 += var11;
        int var41 = arg0.field1640;
        arg0.field1640 += var10;
        int var42 = arg0.field1640;
        arg0.field1640 += var9;
        int var43 = arg0.field1640;
        arg0.field1640 += var24;
        int var44 = arg0.field1640;
        arg0.field1640 += var26;
        int var45 = arg0.field1640;
        arg0.field1640 += var28;
        int var46 = arg0.field1640;
        arg0.field1640 += var7 + var8 + var11;
        int var47 = arg0.field1640;
        arg0.field1640 += var7;
        int var48 = arg0.field1640;
        arg0.field1640 += var35;
        int var49 = arg0.field1640;
        arg0.field1640 += var8;
        int var50 = arg0.field1640;
        arg0.field1640 += var25;
        int var51 = arg0.field1640;
        arg0.field1640 += var27;
        int var52 = arg0.field1640;
        arg0.field1640 += var29;
        int var53 = arg0.field1640;
        arg0.field1640 += var12;
        int var54 = arg0.field1640;
        arg0.field1640 += var9;
        int var55 = arg0.field1640;
        arg0.field1640 += var30;
        int var56 = arg0.field1640;
        arg0.field1640 += var31;
        int var57 = arg0.field1640;
        arg0.field1640 += var32;
        int var58 = arg0.field1640;
        arg0.field1640 += var33;
        int var59 = arg0.field1640;
        arg0.field1640 += var5 * 3;
        this.field97 = new byte[var22];
        class112 var60 = new class112(this.field97);
        var60.method787(853918096, 1297377380);
        var60.method787(853918096, 6);
        var60.method778(var2 > 1 ? 1 : 0, (byte) -4);
        var60.method778(var2, (byte) -4);
        var60.method778(var3, (byte) -4);
        arg0.field1640 = var19;
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
            var60.method787(853918096, 1297379947);
            var60.field1640 += 4;
            int var71 = var60.field1640;
            int var72 = -1;
            while (true) {
                while (true) {
                    int var73 = arg0.method772((byte) -42);
                    var60.method791(var73, (byte) 112);
                    int var74 = arg0.field1607[var38++] & 0xFF;
                    boolean var75 = var72 != var74;
                    var72 = var74 & 0xF;
                    if (var74 == 7) {
                        if (var75) {
                            var60.method797(255, -22096);
                        }
                        var60.method797(47, -22096);
                        var60.method797(0, -22096);
                        var60.method802(-113, var60.field1640 - var71);
                        continue label223;
                    }
                    if (var74 == 23) {
                        if (var75) {
                            var60.method797(255, -22096);
                        }
                        var60.method797(81, -22096);
                        var60.method797(3, -22096);
                        var60.method797(arg0.field1607[var59++], -22096);
                        var60.method797(arg0.field1607[var59++], -22096);
                        var60.method797(arg0.field1607[var59++], -22096);
                    } else {
                        var61 ^= var74 >> 4;
                        if (var72 == 0) {
                            if (var75) {
                                var60.method797(var61 + 144, -22096);
                            }
                            var62 += arg0.field1607[var46++];
                            var63 += arg0.field1607[var47++];
                            var60.method797(var62 & 0x7F, -22096);
                            var60.method797(var63 & 0x7F, -22096);
                        } else if (var72 == 1) {
                            if (var75) {
                                var60.method797(var61 + 128, -22096);
                            }
                            var62 += arg0.field1607[var46++];
                            var64 += arg0.field1607[var49++];
                            var60.method797(var62 & 0x7F, -22096);
                            var60.method797(var64 & 0x7F, -22096);
                        } else if (var72 == 2) {
                            if (var75) {
                                var60.method797(var61 + 176, -22096);
                            }
                            var69 = var69 + arg0.field1607[var23++] & 0x7F;
                            var60.method797(var69, -22096);
                            byte var76;
                            if (var69 == 0 || var69 == 32) {
                                var76 = arg0.field1607[var53++];
                            } else if (var69 == 1) {
                                var76 = arg0.field1607[var43++];
                            } else if (var69 == 33) {
                                var76 = arg0.field1607[var50++];
                            } else if (var69 == 7) {
                                var76 = arg0.field1607[var44++];
                            } else if (var69 == 39) {
                                var76 = arg0.field1607[var51++];
                            } else if (var69 == 10) {
                                var76 = arg0.field1607[var45++];
                            } else if (var69 == 42) {
                                var76 = arg0.field1607[var52++];
                            } else if (var69 == 99) {
                                var76 = arg0.field1607[var55++];
                            } else if (var69 == 98) {
                                var76 = arg0.field1607[var56++];
                            } else if (var69 == 101) {
                                var76 = arg0.field1607[var57++];
                            } else if (var69 == 100) {
                                var76 = arg0.field1607[var58++];
                            } else if (var69 == 64 || var69 == 65 || var69 == 120 || var69 == 121 || var69 == 123) {
                                var76 = arg0.field1607[var39++];
                            } else {
                                var76 = arg0.field1607[var48++];
                            }
                            int var77 = var68[var69] + var76;
                            var68[var69] = var77;
                            var60.method797(var77 & 0x7F, -22096);
                        } else if (var72 == 3) {
                            if (var75) {
                                var60.method797(var61 + 224, -22096);
                            }
                            int var78 = var65 + arg0.field1607[var54++];
                            var65 = var78 + (arg0.field1607[var42++] << 7);
                            var60.method797(var65 & 0x7F, -22096);
                            var60.method797(var65 >> 7 & 0x7F, -22096);
                        } else if (var72 == 4) {
                            if (var75) {
                                var60.method797(var61 + 208, -22096);
                            }
                            var66 += arg0.field1607[var41++];
                            var60.method797(var66 & 0x7F, -22096);
                        } else if (var72 == 5) {
                            if (var75) {
                                var60.method797(var61 + 160, -22096);
                            }
                            var62 += arg0.field1607[var46++];
                            var67 += arg0.field1607[var40++];
                            var60.method797(var62 & 0x7F, -22096);
                            var60.method797(var67 & 0x7F, -22096);
                        } else if (var72 == 6) {
                            if (var75) {
                                var60.method797(var61 + 192, -22096);
                            }
                            var60.method797(arg0.field1607[var53++], -22096);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }
}
