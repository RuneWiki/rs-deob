import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class332 extends class71 {

    @OriginalMember(owner = "client!si", name = "t", descriptor = "[B")
    public byte[] field5162;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "Lol;")
    public class246 field5161;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lkb;II)Lsi;", line = 5)
    public static final class332 method2292(class39 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method250(true, arg1, arg2);
        return var3 == null ? null : new class332(new class192(var3));
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "()V", line = 12)
    public final void method2293() {
        if (this.field5161 != null) {
            return;
        }
        this.field5161 = new class246(16);
        int[] var1 = new int[16];
        int[] var2 = new int[16];
        var1[9] = var2[9] = 128;
        class316 var3 = new class316(this.field5162);
        int var4 = var3.method2209();
        for (int var5 = 0; var5 < var4; var5++) {
            var3.method2197(var5);
            var3.method2207(var5);
            var3.method2204(var5);
        }
        label52: do {
            while (true) {
                int var6 = var3.method2201();
                int var7 = var3.field4921[var6];
                while (var3.field4921[var6] == var7) {
                    var3.method2197(var6);
                    int var8 = var3.method2205(var6);
                    if (var8 == 1) {
                        var3.method2203();
                        var3.method2204(var6);
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
                            class35 var19 = (class35) this.field5161.method1743((long) var18, (byte) -94);
                            if (var19 == null) {
                                var19 = new class35(new byte[128]);
                                this.field5161.method1750(var19, (byte) 124, (long) var18);
                            }
                            var19.field461[var16] = 1;
                        }
                    }
                    var3.method2207(var6);
                    var3.method2204(var6);
                }
            }
        } while (!var3.method2206());
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "()V", line = 118)
    public final void method2294() {
        this.field5161 = null;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lim;)V", line = 126)
    private class332(class192 arg0) {
        arg0.field3129 = arg0.field3128.length - 3;
        int var2 = arg0.method1399(-1172389784);
        int var3 = arg0.method1396(-126);
        int var4 = var2 * 10 + 14;
        arg0.field3129 = 0;
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
                int var15 = arg0.method1399(-1172389784);
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
        int var19 = arg0.field3129;
        int var20 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var21 = 0; var21 < var20; var21++) {
            arg0.method1366((byte) -127);
        }
        int var22 = arg0.field3129 + var18 - var19;
        int var23 = arg0.field3129;
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
            var36 = var36 + arg0.method1399(-1172389784) & 0x7F;
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
        int var39 = arg0.field3129;
        arg0.field3129 += var34;
        int var40 = arg0.field3129;
        arg0.field3129 += var11;
        int var41 = arg0.field3129;
        arg0.field3129 += var10;
        int var42 = arg0.field3129;
        arg0.field3129 += var9;
        int var43 = arg0.field3129;
        arg0.field3129 += var24;
        int var44 = arg0.field3129;
        arg0.field3129 += var26;
        int var45 = arg0.field3129;
        arg0.field3129 += var28;
        int var46 = arg0.field3129;
        arg0.field3129 += var7 + var8 + var11;
        int var47 = arg0.field3129;
        arg0.field3129 += var7;
        int var48 = arg0.field3129;
        arg0.field3129 += var35;
        int var49 = arg0.field3129;
        arg0.field3129 += var8;
        int var50 = arg0.field3129;
        arg0.field3129 += var25;
        int var51 = arg0.field3129;
        arg0.field3129 += var27;
        int var52 = arg0.field3129;
        arg0.field3129 += var29;
        int var53 = arg0.field3129;
        arg0.field3129 += var12;
        int var54 = arg0.field3129;
        arg0.field3129 += var9;
        int var55 = arg0.field3129;
        arg0.field3129 += var30;
        int var56 = arg0.field3129;
        arg0.field3129 += var31;
        int var57 = arg0.field3129;
        arg0.field3129 += var32;
        int var58 = arg0.field3129;
        arg0.field3129 += var33;
        int var59 = arg0.field3129;
        arg0.field3129 += var5 * 3;
        this.field5162 = new byte[var22];
        class192 var60 = new class192(this.field5162);
        var60.method1350(1297377380, -59);
        var60.method1350(6, -116);
        var60.method1368(var2 > 1 ? 1 : 0, 4796);
        var60.method1368(var2, 4796);
        var60.method1368(var3, 4796);
        arg0.field3129 = var19;
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
            var60.method1350(1297379947, -65);
            var60.field3129 += 4;
            int var71 = var60.field3129;
            int var72 = -1;
            while (true) {
                while (true) {
                    int var73 = arg0.method1366((byte) -125);
                    var60.method1351(27325, var73);
                    int var74 = arg0.field3128[var38++] & 0xFF;
                    boolean var75 = var72 != var74;
                    var72 = var74 & 0xF;
                    if (var74 == 7) {
                        if (var75) {
                            var60.method1365(-32769, 255);
                        }
                        var60.method1365(-32769, 47);
                        var60.method1365(-32769, 0);
                        var60.method1356(var60.field3129 - var71, 255);
                        continue label223;
                    }
                    if (var74 == 23) {
                        if (var75) {
                            var60.method1365(-32769, 255);
                        }
                        var60.method1365(-32769, 81);
                        var60.method1365(-32769, 3);
                        var60.method1365(-32769, arg0.field3128[var59++]);
                        var60.method1365(-32769, arg0.field3128[var59++]);
                        var60.method1365(-32769, arg0.field3128[var59++]);
                    } else {
                        var61 ^= var74 >> 4;
                        if (var72 == 0) {
                            if (var75) {
                                var60.method1365(-32769, var61 + 144);
                            }
                            var62 += arg0.field3128[var46++];
                            var63 += arg0.field3128[var47++];
                            var60.method1365(-32769, var62 & 0x7F);
                            var60.method1365(-32769, var63 & 0x7F);
                        } else if (var72 == 1) {
                            if (var75) {
                                var60.method1365(-32769, var61 + 128);
                            }
                            var62 += arg0.field3128[var46++];
                            var64 += arg0.field3128[var49++];
                            var60.method1365(-32769, var62 & 0x7F);
                            var60.method1365(-32769, var64 & 0x7F);
                        } else if (var72 == 2) {
                            if (var75) {
                                var60.method1365(-32769, var61 + 176);
                            }
                            var69 = var69 + arg0.field3128[var23++] & 0x7F;
                            var60.method1365(-32769, var69);
                            byte var76;
                            if (var69 == 0 || var69 == 32) {
                                var76 = arg0.field3128[var53++];
                            } else if (var69 == 1) {
                                var76 = arg0.field3128[var43++];
                            } else if (var69 == 33) {
                                var76 = arg0.field3128[var50++];
                            } else if (var69 == 7) {
                                var76 = arg0.field3128[var44++];
                            } else if (var69 == 39) {
                                var76 = arg0.field3128[var51++];
                            } else if (var69 == 10) {
                                var76 = arg0.field3128[var45++];
                            } else if (var69 == 42) {
                                var76 = arg0.field3128[var52++];
                            } else if (var69 == 99) {
                                var76 = arg0.field3128[var55++];
                            } else if (var69 == 98) {
                                var76 = arg0.field3128[var56++];
                            } else if (var69 == 101) {
                                var76 = arg0.field3128[var57++];
                            } else if (var69 == 100) {
                                var76 = arg0.field3128[var58++];
                            } else if (var69 == 64 || var69 == 65 || var69 == 120 || var69 == 121 || var69 == 123) {
                                var76 = arg0.field3128[var39++];
                            } else {
                                var76 = arg0.field3128[var48++];
                            }
                            int var77 = var68[var69] + var76;
                            var68[var69] = var77;
                            var60.method1365(-32769, var77 & 0x7F);
                        } else if (var72 == 3) {
                            if (var75) {
                                var60.method1365(-32769, var61 + 224);
                            }
                            int var78 = var65 + arg0.field3128[var54++];
                            var65 = var78 + (arg0.field3128[var42++] << 7);
                            var60.method1365(-32769, var65 & 0x7F);
                            var60.method1365(-32769, var65 >> 7 & 0x7F);
                        } else if (var72 == 4) {
                            if (var75) {
                                var60.method1365(-32769, var61 + 208);
                            }
                            var66 += arg0.field3128[var41++];
                            var60.method1365(-32769, var66 & 0x7F);
                        } else if (var72 == 5) {
                            if (var75) {
                                var60.method1365(-32769, var61 + 160);
                            }
                            var62 += arg0.field3128[var46++];
                            var67 += arg0.field3128[var40++];
                            var60.method1365(-32769, var62 & 0x7F);
                            var60.method1365(-32769, var67 & 0x7F);
                        } else if (var72 == 6) {
                            if (var75) {
                                var60.method1365(-32769, var61 + 192);
                            }
                            var60.method1365(-32769, arg0.field3128[var53++]);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }
}
