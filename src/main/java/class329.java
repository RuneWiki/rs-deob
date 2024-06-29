import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class329 extends class5 {

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "[B")
    public byte[] field5065;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "Lii;")
    public class250 field5064;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "()V", line = 5)
    public final void method2292() {
        if (this.field5064 != null) {
            return;
        }
        this.field5064 = new class250(16);
        int[] var1 = new int[16];
        int[] var2 = new int[16];
        var1[9] = var2[9] = 128;
        class22 var3 = new class22(this.field5065);
        int var4 = var3.method177();
        for (int var5 = 0; var5 < var4; var5++) {
            var3.method180(var5);
            var3.method179(var5);
            var3.method183(var5);
        }
        label52: do {
            while (true) {
                int var6 = var3.method186();
                int var7 = var3.field253[var6];
                while (var3.field253[var6] == var7) {
                    var3.method180(var6);
                    int var8 = var3.method181(var6);
                    if (var8 == 1) {
                        var3.method188();
                        var3.method183(var6);
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
                            class338 var19 = (class338) this.field5064.method1716(-1, (long) var18);
                            if (var19 == null) {
                                var19 = new class338(new byte[128]);
                                this.field5064.method1708((long) var18, (byte) -79, var19);
                            }
                            var19.field5252[var16] = 1;
                        }
                    }
                    var3.method179(var6);
                    var3.method183(var6);
                }
            }
        } while (!var3.method175());
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljd;II)Lrl;", line = 113)
    public static final class329 method2293(class95 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method696(arg2, (byte) 110, arg1);
        return var3 == null ? null : new class329(new class254(var3));
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "()V", line = 121)
    public final void method2294() {
        this.field5064 = null;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lwm;)V", line = 126)
    private class329(class254 arg0) {
        arg0.field3866 = arg0.field3840.length - 3;
        int var2 = arg0.method1774((byte) -106);
        int var3 = arg0.method1755(false);
        int var4 = var2 * 10 + 14;
        arg0.field3866 = 0;
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
                int var15 = arg0.method1774((byte) 25);
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
        int var19 = arg0.field3866;
        int var20 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var21 = 0; var21 < var20; var21++) {
            arg0.method1764((byte) -55);
        }
        int var22 = arg0.field3866 + var18 - var19;
        int var23 = arg0.field3866;
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
            var36 = var36 + arg0.method1774((byte) -99) & 0x7F;
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
        int var39 = arg0.field3866;
        arg0.field3866 += var34;
        int var40 = arg0.field3866;
        arg0.field3866 += var11;
        int var41 = arg0.field3866;
        arg0.field3866 += var10;
        int var42 = arg0.field3866;
        arg0.field3866 += var9;
        int var43 = arg0.field3866;
        arg0.field3866 += var24;
        int var44 = arg0.field3866;
        arg0.field3866 += var26;
        int var45 = arg0.field3866;
        arg0.field3866 += var28;
        int var46 = arg0.field3866;
        arg0.field3866 += var7 + var8 + var11;
        int var47 = arg0.field3866;
        arg0.field3866 += var7;
        int var48 = arg0.field3866;
        arg0.field3866 += var35;
        int var49 = arg0.field3866;
        arg0.field3866 += var8;
        int var50 = arg0.field3866;
        arg0.field3866 += var25;
        int var51 = arg0.field3866;
        arg0.field3866 += var27;
        int var52 = arg0.field3866;
        arg0.field3866 += var29;
        int var53 = arg0.field3866;
        arg0.field3866 += var12;
        int var54 = arg0.field3866;
        arg0.field3866 += var9;
        int var55 = arg0.field3866;
        arg0.field3866 += var30;
        int var56 = arg0.field3866;
        arg0.field3866 += var31;
        int var57 = arg0.field3866;
        arg0.field3866 += var32;
        int var58 = arg0.field3866;
        arg0.field3866 += var33;
        int var59 = arg0.field3866;
        arg0.field3866 += var5 * 3;
        this.field5065 = new byte[var22];
        class254 var60 = new class254(this.field5065);
        var60.method1773(1297377380, false);
        var60.method1773(6, false);
        var60.method1744(true, var2 > 1 ? 1 : 0);
        var60.method1744(true, var2);
        var60.method1744(true, var3);
        arg0.field3866 = var19;
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
            var60.method1773(1297379947, false);
            var60.field3866 += 4;
            int var71 = var60.field3866;
            int var72 = -1;
            while (true) {
                while (true) {
                    int var73 = arg0.method1764((byte) -55);
                    var60.method1761(var73, -125);
                    int var74 = arg0.field3840[var38++] & 0xFF;
                    boolean var75 = var72 != var74;
                    var72 = var74 & 0xF;
                    if (var74 == 7) {
                        if (var75) {
                            var60.method1752(255, -95);
                        }
                        var60.method1752(47, -124);
                        var60.method1752(0, -92);
                        var60.method1788(var60.field3866 - var71, 0);
                        continue label223;
                    }
                    if (var74 == 23) {
                        if (var75) {
                            var60.method1752(255, -121);
                        }
                        var60.method1752(81, -120);
                        var60.method1752(3, -88);
                        var60.method1752(arg0.field3840[var59++], -91);
                        var60.method1752(arg0.field3840[var59++], -124);
                        var60.method1752(arg0.field3840[var59++], -92);
                    } else {
                        var61 ^= var74 >> 4;
                        if (var72 == 0) {
                            if (var75) {
                                var60.method1752(var61 + 144, -120);
                            }
                            var62 += arg0.field3840[var46++];
                            var63 += arg0.field3840[var47++];
                            var60.method1752(var62 & 0x7F, -112);
                            var60.method1752(var63 & 0x7F, -115);
                        } else if (var72 == 1) {
                            if (var75) {
                                var60.method1752(var61 + 128, -101);
                            }
                            var62 += arg0.field3840[var46++];
                            var64 += arg0.field3840[var49++];
                            var60.method1752(var62 & 0x7F, -98);
                            var60.method1752(var64 & 0x7F, -82);
                        } else if (var72 == 2) {
                            if (var75) {
                                var60.method1752(var61 + 176, -82);
                            }
                            var69 = var69 + arg0.field3840[var23++] & 0x7F;
                            var60.method1752(var69, -119);
                            byte var76;
                            if (var69 == 0 || var69 == 32) {
                                var76 = arg0.field3840[var53++];
                            } else if (var69 == 1) {
                                var76 = arg0.field3840[var43++];
                            } else if (var69 == 33) {
                                var76 = arg0.field3840[var50++];
                            } else if (var69 == 7) {
                                var76 = arg0.field3840[var44++];
                            } else if (var69 == 39) {
                                var76 = arg0.field3840[var51++];
                            } else if (var69 == 10) {
                                var76 = arg0.field3840[var45++];
                            } else if (var69 == 42) {
                                var76 = arg0.field3840[var52++];
                            } else if (var69 == 99) {
                                var76 = arg0.field3840[var55++];
                            } else if (var69 == 98) {
                                var76 = arg0.field3840[var56++];
                            } else if (var69 == 101) {
                                var76 = arg0.field3840[var57++];
                            } else if (var69 == 100) {
                                var76 = arg0.field3840[var58++];
                            } else if (var69 == 64 || var69 == 65 || var69 == 120 || var69 == 121 || var69 == 123) {
                                var76 = arg0.field3840[var39++];
                            } else {
                                var76 = arg0.field3840[var48++];
                            }
                            int var77 = var68[var69] + var76;
                            var68[var69] = var77;
                            var60.method1752(var77 & 0x7F, -88);
                        } else if (var72 == 3) {
                            if (var75) {
                                var60.method1752(var61 + 224, -104);
                            }
                            int var78 = var65 + arg0.field3840[var54++];
                            var65 = var78 + (arg0.field3840[var42++] << 7);
                            var60.method1752(var65 & 0x7F, -91);
                            var60.method1752(var65 >> 7 & 0x7F, -110);
                        } else if (var72 == 4) {
                            if (var75) {
                                var60.method1752(var61 + 208, -97);
                            }
                            var66 += arg0.field3840[var41++];
                            var60.method1752(var66 & 0x7F, -89);
                        } else if (var72 == 5) {
                            if (var75) {
                                var60.method1752(var61 + 160, -99);
                            }
                            var62 += arg0.field3840[var46++];
                            var67 += arg0.field3840[var40++];
                            var60.method1752(var62 & 0x7F, -78);
                            var60.method1752(var67 & 0x7F, -122);
                        } else if (var72 == 6) {
                            if (var75) {
                                var60.method1752(var61 + 192, -86);
                            }
                            var60.method1752(arg0.field3840[var53++], -79);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }
}
