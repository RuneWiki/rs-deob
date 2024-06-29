import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class234 extends class656 {

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "[B")
    public byte[] field3308;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Ldu;")
    public class360 field3307;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "()V")
    public final void method1477() {
        if (this.field3307 != null) {
            return;
        }
        this.field3307 = new class360(16);
        int[] var1 = new int[16];
        int[] var2 = new int[16];
        var1[9] = var2[9] = 128;
        class482 var3 = new class482(this.field3308);
        int var4 = var3.method2718();
        for (int var5 = 0; var5 < var4; var5++) {
            var3.method2725(var5);
            var3.method2720(var5);
            var3.method2715(var5);
        }
        label53: do {
            while (true) {
                int var6 = var3.method2714();
                int var7 = var3.field6590[var6];
                while (var3.field6590[var6] == var7) {
                    var3.method2725(var6);
                    int var8 = var3.method2713(var6);
                    if (var8 == 1) {
                        var3.method2723();
                        var3.method2715(var6);
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
                            class505 var19 = (class505) this.field3307.method2135((long) var18, (byte) 31);
                            if (var19 == null) {
                                var19 = new class505(new byte[128]);
                                this.field3307.method2143(-1, var19, (long) var18);
                            }
                            var19.field6755[var16] = 1;
                        }
                    }
                    var3.method2720(var6);
                    var3.method2715(var6);
                }
            }
        } while (!var3.method2722());
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lwu;II)Lue;")
    public static final class234 method1478(class376 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2218((byte) 120, arg1, arg2);
        return var3 == null ? null : new class234(new class677(var3));
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "()V")
    public final void method1479() {
        this.field3307 = null;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lee;)V")
    private class234(class677 arg0) {
        arg0.field9419 = arg0.field9399.length - 3;
        int var2 = arg0.method3821((byte) -97);
        int var3 = arg0.method3807(-1);
        int var4 = var2 * 10 + 14;
        arg0.field9419 = 0;
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
                int var78 = arg0.method3821((byte) -73);
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
        int var17 = arg0.field9419;
        int var18 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var19 = 0; var19 < var18; var19++) {
            arg0.method3776(-125749561);
        }
        int var20 = arg0.field9419 + var16 - var17;
        int var21 = arg0.field9419;
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
            var34 = var34 + arg0.method3821((byte) 120) & 0x7F;
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
        int var37 = arg0.field9419;
        arg0.field9419 += var32;
        int var38 = arg0.field9419;
        arg0.field9419 += var11;
        int var39 = arg0.field9419;
        arg0.field9419 += var10;
        int var40 = arg0.field9419;
        arg0.field9419 += var9;
        int var41 = arg0.field9419;
        arg0.field9419 += var22;
        int var42 = arg0.field9419;
        arg0.field9419 += var24;
        int var43 = arg0.field9419;
        arg0.field9419 += var26;
        int var44 = arg0.field9419;
        arg0.field9419 += var7 + var8 + var11;
        int var45 = arg0.field9419;
        arg0.field9419 += var7;
        int var46 = arg0.field9419;
        arg0.field9419 += var33;
        int var47 = arg0.field9419;
        arg0.field9419 += var8;
        int var48 = arg0.field9419;
        arg0.field9419 += var23;
        int var49 = arg0.field9419;
        arg0.field9419 += var25;
        int var50 = arg0.field9419;
        arg0.field9419 += var27;
        int var51 = arg0.field9419;
        arg0.field9419 += var12;
        int var52 = arg0.field9419;
        arg0.field9419 += var9;
        int var53 = arg0.field9419;
        arg0.field9419 += var28;
        int var54 = arg0.field9419;
        arg0.field9419 += var29;
        int var55 = arg0.field9419;
        arg0.field9419 += var30;
        int var56 = arg0.field9419;
        arg0.field9419 += var31;
        int var57 = arg0.field9419;
        arg0.field9419 += var5 * 3;
        this.field3308 = new byte[var20];
        class677 var58 = new class677(this.field3308);
        var58.method3798(27695, 1297377380);
        var58.method3798(27695, 6);
        var58.method3831(1182, var2 > 1 ? 1 : 0);
        var58.method3831(1182, var2);
        var58.method3831(1182, var3);
        arg0.field9419 = var17;
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
            var58.method3798(27695, 1297379947);
            var58.field9419 += 4;
            int var69 = var58.field9419;
            int var70 = -1;
            while (true) {
                while (true) {
                    int var71 = arg0.method3776(-125749561);
                    var58.method3792((byte) -64, var71);
                    int var72 = arg0.field9399[var36++] & 0xFF;
                    boolean var73 = var70 != var72;
                    var70 = var72 & 0xF;
                    if (var72 == 7) {
                        if (var73) {
                            var58.method3823(-28, 255);
                        }
                        var58.method3823(-47, 47);
                        var58.method3823(-65, 0);
                        var58.method3773(var58.field9419 - var69, -2069575864);
                        continue label223;
                    }
                    if (var72 == 23) {
                        if (var73) {
                            var58.method3823(-113, 255);
                        }
                        var58.method3823(-109, 81);
                        var58.method3823(-76, 3);
                        var58.method3823(-68, arg0.field9399[var57++]);
                        var58.method3823(-97, arg0.field9399[var57++]);
                        var58.method3823(-23, arg0.field9399[var57++]);
                    } else {
                        var59 ^= var72 >> 4;
                        if (var70 == 0) {
                            if (var73) {
                                var58.method3823(-32, var59 + 144);
                            }
                            var60 += arg0.field9399[var44++];
                            var61 += arg0.field9399[var45++];
                            var58.method3823(-52, var60 & 0x7F);
                            var58.method3823(-31, var61 & 0x7F);
                        } else if (var70 == 1) {
                            if (var73) {
                                var58.method3823(-39, var59 + 128);
                            }
                            var60 += arg0.field9399[var44++];
                            var62 += arg0.field9399[var47++];
                            var58.method3823(-23, var60 & 0x7F);
                            var58.method3823(-59, var62 & 0x7F);
                        } else if (var70 == 2) {
                            if (var73) {
                                var58.method3823(-47, var59 + 176);
                            }
                            var67 = var67 + arg0.field9399[var21++] & 0x7F;
                            var58.method3823(-106, var67);
                            byte var74;
                            if (var67 == 0 || var67 == 32) {
                                var74 = arg0.field9399[var51++];
                            } else if (var67 == 1) {
                                var74 = arg0.field9399[var41++];
                            } else if (var67 == 33) {
                                var74 = arg0.field9399[var48++];
                            } else if (var67 == 7) {
                                var74 = arg0.field9399[var42++];
                            } else if (var67 == 39) {
                                var74 = arg0.field9399[var49++];
                            } else if (var67 == 10) {
                                var74 = arg0.field9399[var43++];
                            } else if (var67 == 42) {
                                var74 = arg0.field9399[var50++];
                            } else if (var67 == 99) {
                                var74 = arg0.field9399[var53++];
                            } else if (var67 == 98) {
                                var74 = arg0.field9399[var54++];
                            } else if (var67 == 101) {
                                var74 = arg0.field9399[var55++];
                            } else if (var67 == 100) {
                                var74 = arg0.field9399[var56++];
                            } else if (var67 == 64 || var67 == 65 || var67 == 120 || var67 == 121 || var67 == 123) {
                                var74 = arg0.field9399[var37++];
                            } else {
                                var74 = arg0.field9399[var46++];
                            }
                            int var75 = var66[var67] + var74;
                            var66[var67] = var75;
                            var58.method3823(-119, var75 & 0x7F);
                        } else if (var70 == 3) {
                            if (var73) {
                                var58.method3823(-119, var59 + 224);
                            }
                            int var76 = var63 + arg0.field9399[var52++];
                            var63 = var76 + (arg0.field9399[var40++] << 7);
                            var58.method3823(-41, var63 & 0x7F);
                            var58.method3823(-67, var63 >> 7 & 0x7F);
                        } else if (var70 == 4) {
                            if (var73) {
                                var58.method3823(-26, var59 + 208);
                            }
                            var64 += arg0.field9399[var39++];
                            var58.method3823(-46, var64 & 0x7F);
                        } else if (var70 == 5) {
                            if (var73) {
                                var58.method3823(-114, var59 + 160);
                            }
                            var60 += arg0.field9399[var44++];
                            var65 += arg0.field9399[var38++];
                            var58.method3823(-108, var60 & 0x7F);
                            var58.method3823(-36, var65 & 0x7F);
                        } else if (var70 == 6) {
                            if (var73) {
                                var58.method3823(-51, var59 + 192);
                            }
                            var58.method3823(-125, arg0.field9399[var51++]);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }
}
