import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class624 extends class627 {

    @OriginalMember(owner = "client!paa", name = "k", descriptor = "[B")
    public byte[] field8710;

    @OriginalMember(owner = "client!paa", name = "j", descriptor = "Lsga;")
    public class583 field8709;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "()V")
    public final void method3412() {
        if (this.field8709 != null) {
            return;
        }
        this.field8709 = new class583(16);
        int[] var1 = new int[16];
        int[] var2 = new int[16];
        var1[9] = var2[9] = 128;
        class740 var3 = new class740(this.field8710);
        int var4 = var3.method4147();
        for (int var5 = 0; var5 < var4; var5++) {
            var3.method4155(var5);
            var3.method4146(var5);
            var3.method4154(var5);
        }
        label53: do {
            while (true) {
                int var6 = var3.method4145();
                int var7 = var3.field10354[var6];
                while (var3.field10354[var6] == var7) {
                    var3.method4155(var6);
                    int var8 = var3.method4144(var6);
                    if (var8 == 1) {
                        var3.method4156();
                        var3.method4154(var6);
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
                            class6 var19 = (class6) this.field8709.method3248((long) var18, 0);
                            if (var19 == null) {
                                var19 = new class6(new byte[128]);
                                this.field8709.method3249((long) var18, var19, (byte) -67);
                            }
                            var19.field64[var16] = 1;
                        }
                    }
                    var3.method4146(var6);
                    var3.method4154(var6);
                }
            }
        } while (!var3.method4148());
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lkha;II)Lpaa;")
    public static final class624 method3413(class687 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method3810(arg1, -23360, arg2);
        return var3 == null ? null : new class624(new class179(var3));
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "()V")
    public final void method3414() {
        this.field8709 = null;
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Ltn;)V")
    private class624(class179 arg0) {
        arg0.field2354 = arg0.field2325.length - 3;
        int var2 = arg0.method1094(255);
        int var3 = arg0.method1107(false);
        int var4 = var2 * 10 + 14;
        arg0.field2354 = 0;
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
                int var78 = arg0.method1094(255);
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
        int var17 = arg0.field2354;
        int var18 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var19 = 0; var19 < var18; var19++) {
            arg0.method1120(-125);
        }
        int var20 = arg0.field2354 + var16 - var17;
        int var21 = arg0.field2354;
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
            var34 = var34 + arg0.method1094(255) & 0x7F;
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
        int var37 = arg0.field2354;
        arg0.field2354 += var32;
        int var38 = arg0.field2354;
        arg0.field2354 += var11;
        int var39 = arg0.field2354;
        arg0.field2354 += var10;
        int var40 = arg0.field2354;
        arg0.field2354 += var9;
        int var41 = arg0.field2354;
        arg0.field2354 += var22;
        int var42 = arg0.field2354;
        arg0.field2354 += var24;
        int var43 = arg0.field2354;
        arg0.field2354 += var26;
        int var44 = arg0.field2354;
        arg0.field2354 += var7 + var8 + var11;
        int var45 = arg0.field2354;
        arg0.field2354 += var7;
        int var46 = arg0.field2354;
        arg0.field2354 += var33;
        int var47 = arg0.field2354;
        arg0.field2354 += var8;
        int var48 = arg0.field2354;
        arg0.field2354 += var23;
        int var49 = arg0.field2354;
        arg0.field2354 += var25;
        int var50 = arg0.field2354;
        arg0.field2354 += var27;
        int var51 = arg0.field2354;
        arg0.field2354 += var12;
        int var52 = arg0.field2354;
        arg0.field2354 += var9;
        int var53 = arg0.field2354;
        arg0.field2354 += var28;
        int var54 = arg0.field2354;
        arg0.field2354 += var29;
        int var55 = arg0.field2354;
        arg0.field2354 += var30;
        int var56 = arg0.field2354;
        arg0.field2354 += var31;
        int var57 = arg0.field2354;
        arg0.field2354 += var5 * 3;
        this.field8710 = new byte[var20];
        class179 var58 = new class179(this.field8710);
        var58.method1112(1297377380, -120);
        var58.method1112(6, -121);
        var58.method1157(var2 > 1 ? 1 : 0, (byte) 123);
        var58.method1157(var2, (byte) 126);
        var58.method1157(var3, (byte) 113);
        arg0.field2354 = var17;
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
            var58.method1112(1297379947, -126);
            var58.field2354 += 4;
            int var69 = var58.field2354;
            int var70 = -1;
            while (true) {
                while (true) {
                    int var71 = arg0.method1120(-54);
                    var58.method1152(128, var71);
                    int var72 = arg0.field2325[var36++] & 0xFF;
                    boolean var73 = var70 != var72;
                    var70 = var72 & 0xF;
                    if (var72 == 7) {
                        if (var73) {
                            var58.method1141(255, -95);
                        }
                        var58.method1141(47, -60);
                        var58.method1141(0, -68);
                        var58.method1103((byte) -56, var58.field2354 - var69);
                        continue label223;
                    }
                    if (var72 == 23) {
                        if (var73) {
                            var58.method1141(255, -90);
                        }
                        var58.method1141(81, -74);
                        var58.method1141(3, -54);
                        var58.method1141(arg0.field2325[var57++], -73);
                        var58.method1141(arg0.field2325[var57++], -82);
                        var58.method1141(arg0.field2325[var57++], 66);
                    } else {
                        var59 ^= var72 >> 4;
                        if (var70 == 0) {
                            if (var73) {
                                var58.method1141(var59 + 144, -124);
                            }
                            var60 += arg0.field2325[var44++];
                            var61 += arg0.field2325[var45++];
                            var58.method1141(var60 & 0x7F, 67);
                            var58.method1141(var61 & 0x7F, -109);
                        } else if (var70 == 1) {
                            if (var73) {
                                var58.method1141(var59 + 128, -80);
                            }
                            var60 += arg0.field2325[var44++];
                            var62 += arg0.field2325[var47++];
                            var58.method1141(var60 & 0x7F, -79);
                            var58.method1141(var62 & 0x7F, -67);
                        } else if (var70 == 2) {
                            if (var73) {
                                var58.method1141(var59 + 176, 124);
                            }
                            var67 = var67 + arg0.field2325[var21++] & 0x7F;
                            var58.method1141(var67, -81);
                            byte var74;
                            if (var67 == 0 || var67 == 32) {
                                var74 = arg0.field2325[var51++];
                            } else if (var67 == 1) {
                                var74 = arg0.field2325[var41++];
                            } else if (var67 == 33) {
                                var74 = arg0.field2325[var48++];
                            } else if (var67 == 7) {
                                var74 = arg0.field2325[var42++];
                            } else if (var67 == 39) {
                                var74 = arg0.field2325[var49++];
                            } else if (var67 == 10) {
                                var74 = arg0.field2325[var43++];
                            } else if (var67 == 42) {
                                var74 = arg0.field2325[var50++];
                            } else if (var67 == 99) {
                                var74 = arg0.field2325[var53++];
                            } else if (var67 == 98) {
                                var74 = arg0.field2325[var54++];
                            } else if (var67 == 101) {
                                var74 = arg0.field2325[var55++];
                            } else if (var67 == 100) {
                                var74 = arg0.field2325[var56++];
                            } else if (var67 == 64 || var67 == 65 || var67 == 120 || var67 == 121 || var67 == 123) {
                                var74 = arg0.field2325[var37++];
                            } else {
                                var74 = arg0.field2325[var46++];
                            }
                            int var75 = var66[var67] + var74;
                            var66[var67] = var75;
                            var58.method1141(var75 & 0x7F, -51);
                        } else if (var70 == 3) {
                            if (var73) {
                                var58.method1141(var59 + 224, -99);
                            }
                            int var76 = var63 + arg0.field2325[var52++];
                            var63 = var76 + (arg0.field2325[var40++] << 7);
                            var58.method1141(var63 & 0x7F, -60);
                            var58.method1141(var63 >> 7 & 0x7F, 89);
                        } else if (var70 == 4) {
                            if (var73) {
                                var58.method1141(var59 + 208, 68);
                            }
                            var64 += arg0.field2325[var39++];
                            var58.method1141(var64 & 0x7F, 59);
                        } else if (var70 == 5) {
                            if (var73) {
                                var58.method1141(var59 + 160, -52);
                            }
                            var60 += arg0.field2325[var44++];
                            var65 += arg0.field2325[var38++];
                            var58.method1141(var60 & 0x7F, -117);
                            var58.method1141(var65 & 0x7F, -123);
                        } else if (var70 == 6) {
                            if (var73) {
                                var58.method1141(var59 + 192, 51);
                            }
                            var58.method1141(arg0.field2325[var51++], -65);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }
}
