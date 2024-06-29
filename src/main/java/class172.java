import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class172 extends class217 {

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "[B")
    public byte[] field2552;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "Lhj;")
    public class29 field2553;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()V", line = 5)
    public final void method1256() {
        this.field2553 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Llb;II)Lrd;", line = 12)
    public static final class172 method1257(class211 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1507(arg2, (byte) 21, arg1);
        return var3 == null ? null : new class172(new class35(var3));
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "()V", line = 19)
    public final void method1258() {
        if (this.field2553 != null) {
            return;
        }
        this.field2553 = new class29(16);
        int[] var1 = new int[16];
        int[] var2 = new int[16];
        var1[9] = var2[9] = 128;
        class127 var3 = new class127(this.field2552);
        int var4 = var3.method973();
        for (int var5 = 0; var5 < var4; var5++) {
            var3.method972(var5);
            var3.method971(var5);
            var3.method963(var5);
        }
        label52: do {
            while (true) {
                int var6 = var3.method960();
                int var7 = var3.field2007[var6];
                while (var3.field2007[var6] == var7) {
                    var3.method972(var6);
                    int var8 = var3.method962(var6);
                    if (var8 == 1) {
                        var3.method968();
                        var3.method963(var6);
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
                            class161 var19 = (class161) this.field2553.method203(1710, (long) var18);
                            if (var19 == null) {
                                var19 = new class161(new byte[128]);
                                this.field2553.method208(var19, (long) var18, 0);
                            }
                            var19.field2396[var16] = 1;
                        }
                    }
                    var3.method971(var6);
                    var3.method963(var6);
                }
            }
        } while (!var3.method966());
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lhb;)V", line = 126)
    private class172(class35 arg0) {
        arg0.field455 = arg0.field437.length - 3;
        int var2 = arg0.method273(65280);
        int var3 = arg0.method300(-1394191632);
        int var4 = var2 * 10 + 14;
        arg0.field455 = 0;
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
                int var15 = arg0.method273(65280);
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
        int var19 = arg0.field455;
        int var20 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var21 = 0; var21 < var20; var21++) {
            arg0.method238((byte) 60);
        }
        int var22 = arg0.field455 + var18 - var19;
        int var23 = arg0.field455;
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
            var36 = var36 + arg0.method273(65280) & 0x7F;
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
        int var39 = arg0.field455;
        arg0.field455 += var34;
        int var40 = arg0.field455;
        arg0.field455 += var11;
        int var41 = arg0.field455;
        arg0.field455 += var10;
        int var42 = arg0.field455;
        arg0.field455 += var9;
        int var43 = arg0.field455;
        arg0.field455 += var24;
        int var44 = arg0.field455;
        arg0.field455 += var26;
        int var45 = arg0.field455;
        arg0.field455 += var28;
        int var46 = arg0.field455;
        arg0.field455 += var7 + var8 + var11;
        int var47 = arg0.field455;
        arg0.field455 += var7;
        int var48 = arg0.field455;
        arg0.field455 += var35;
        int var49 = arg0.field455;
        arg0.field455 += var8;
        int var50 = arg0.field455;
        arg0.field455 += var25;
        int var51 = arg0.field455;
        arg0.field455 += var27;
        int var52 = arg0.field455;
        arg0.field455 += var29;
        int var53 = arg0.field455;
        arg0.field455 += var12;
        int var54 = arg0.field455;
        arg0.field455 += var9;
        int var55 = arg0.field455;
        arg0.field455 += var30;
        int var56 = arg0.field455;
        arg0.field455 += var31;
        int var57 = arg0.field455;
        arg0.field455 += var32;
        int var58 = arg0.field455;
        arg0.field455 += var33;
        int var59 = arg0.field455;
        arg0.field455 += var5 * 3;
        this.field2552 = new byte[var22];
        class35 var60 = new class35(this.field2552);
        var60.method259(-15195, 1297377380);
        var60.method259(-15195, 6);
        var60.method263(var2 > 1 ? 1 : 0, (byte) 94);
        var60.method263(var2, (byte) 89);
        var60.method263(var3, (byte) 92);
        arg0.field455 = var19;
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
            var60.method259(-15195, 1297379947);
            var60.field455 += 4;
            int var71 = var60.field455;
            int var72 = -1;
            while (true) {
                while (true) {
                    int var73 = arg0.method238((byte) 73);
                    var60.method250(var73, -20071);
                    int var74 = arg0.field437[var38++] & 0xFF;
                    boolean var75 = var72 != var74;
                    var72 = var74 & 0xF;
                    if (var74 == 7) {
                        if (var75) {
                            var60.method262((byte) 81, 255);
                        }
                        var60.method262((byte) 81, 47);
                        var60.method262((byte) 81, 0);
                        var60.method264(var60.field455 - var71, false);
                        continue label223;
                    }
                    if (var74 == 23) {
                        if (var75) {
                            var60.method262((byte) 81, 255);
                        }
                        var60.method262((byte) 81, 81);
                        var60.method262((byte) 81, 3);
                        var60.method262((byte) 81, arg0.field437[var59++]);
                        var60.method262((byte) 81, arg0.field437[var59++]);
                        var60.method262((byte) 81, arg0.field437[var59++]);
                    } else {
                        var61 ^= var74 >> 4;
                        if (var72 == 0) {
                            if (var75) {
                                var60.method262((byte) 81, var61 + 144);
                            }
                            var62 += arg0.field437[var46++];
                            var63 += arg0.field437[var47++];
                            var60.method262((byte) 81, var62 & 0x7F);
                            var60.method262((byte) 81, var63 & 0x7F);
                        } else if (var72 == 1) {
                            if (var75) {
                                var60.method262((byte) 81, var61 + 128);
                            }
                            var62 += arg0.field437[var46++];
                            var64 += arg0.field437[var49++];
                            var60.method262((byte) 81, var62 & 0x7F);
                            var60.method262((byte) 81, var64 & 0x7F);
                        } else if (var72 == 2) {
                            if (var75) {
                                var60.method262((byte) 81, var61 + 176);
                            }
                            var69 = var69 + arg0.field437[var23++] & 0x7F;
                            var60.method262((byte) 81, var69);
                            byte var76;
                            if (var69 == 0 || var69 == 32) {
                                var76 = arg0.field437[var53++];
                            } else if (var69 == 1) {
                                var76 = arg0.field437[var43++];
                            } else if (var69 == 33) {
                                var76 = arg0.field437[var50++];
                            } else if (var69 == 7) {
                                var76 = arg0.field437[var44++];
                            } else if (var69 == 39) {
                                var76 = arg0.field437[var51++];
                            } else if (var69 == 10) {
                                var76 = arg0.field437[var45++];
                            } else if (var69 == 42) {
                                var76 = arg0.field437[var52++];
                            } else if (var69 == 99) {
                                var76 = arg0.field437[var55++];
                            } else if (var69 == 98) {
                                var76 = arg0.field437[var56++];
                            } else if (var69 == 101) {
                                var76 = arg0.field437[var57++];
                            } else if (var69 == 100) {
                                var76 = arg0.field437[var58++];
                            } else if (var69 == 64 || var69 == 65 || var69 == 120 || var69 == 121 || var69 == 123) {
                                var76 = arg0.field437[var39++];
                            } else {
                                var76 = arg0.field437[var48++];
                            }
                            int var77 = var68[var69] + var76;
                            var68[var69] = var77;
                            var60.method262((byte) 81, var77 & 0x7F);
                        } else if (var72 == 3) {
                            if (var75) {
                                var60.method262((byte) 81, var61 + 224);
                            }
                            int var78 = var65 + arg0.field437[var54++];
                            var65 = var78 + (arg0.field437[var42++] << 7);
                            var60.method262((byte) 81, var65 & 0x7F);
                            var60.method262((byte) 81, var65 >> 7 & 0x7F);
                        } else if (var72 == 4) {
                            if (var75) {
                                var60.method262((byte) 81, var61 + 208);
                            }
                            var66 += arg0.field437[var41++];
                            var60.method262((byte) 81, var66 & 0x7F);
                        } else if (var72 == 5) {
                            if (var75) {
                                var60.method262((byte) 81, var61 + 160);
                            }
                            var62 += arg0.field437[var46++];
                            var67 += arg0.field437[var40++];
                            var60.method262((byte) 81, var62 & 0x7F);
                            var60.method262((byte) 81, var67 & 0x7F);
                        } else if (var72 == 6) {
                            if (var75) {
                                var60.method262((byte) 81, var61 + 192);
                            }
                            var60.method262((byte) 81, arg0.field437[var53++]);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }
}
