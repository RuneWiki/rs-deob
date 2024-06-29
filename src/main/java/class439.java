import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class439 extends class431 {

    @OriginalMember(owner = "client!a", name = "k", descriptor = "[B")
    public byte[] field6446;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Lgu;")
    public class412 field6447;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V")
    public final void method2703() {
        if (this.field6447 != null) {
            return;
        }
        this.field6447 = new class412(16);
        int[] var1 = new int[16];
        int[] var2 = new int[16];
        var1[9] = var2[9] = 128;
        class67 var3 = new class67(this.field6446);
        int var4 = var3.method569();
        for (int var5 = 0; var5 < var4; var5++) {
            var3.method578(var5);
            var3.method565(var5);
            var3.method572(var5);
        }
        label53: do {
            while (true) {
                int var6 = var3.method563();
                int var7 = var3.field869[var6];
                while (var3.field869[var6] == var7) {
                    var3.method578(var6);
                    int var8 = var3.method573(var6);
                    if (var8 == 1) {
                        var3.method574();
                        var3.method572(var6);
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
                            class462 var19 = (class462) this.field6447.method2585((byte) 114, (long) var18);
                            if (var19 == null) {
                                var19 = new class462(new byte[128]);
                                this.field6447.method2591((long) var18, var19, (byte) -118);
                            }
                            var19.field6713[var16] = 1;
                        }
                    }
                    var3.method565(var6);
                    var3.method572(var6);
                }
            }
        } while (!var3.method564());
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V")
    public final void method2704() {
        this.field6447 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lul;II)La;")
    public static final class439 method2705(class406 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2536(arg1, 0, arg2);
        return var3 == null ? null : new class439(new class217(var3));
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lhp;)V")
    private class439(class217 arg0) {
        arg0.field3556 = arg0.field3572.length - 3;
        int var2 = arg0.method1515((byte) 122);
        int var3 = arg0.method1511(-52);
        int var4 = var2 * 10 + 14;
        arg0.field3556 = 0;
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
                int var78 = arg0.method1515((byte) 126);
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
        int var17 = arg0.field3556;
        int var18 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var19 = 0; var19 < var18; var19++) {
            arg0.method1526((byte) -87);
        }
        int var20 = arg0.field3556 + var16 - var17;
        int var21 = arg0.field3556;
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
            var34 = var34 + arg0.method1515((byte) 126) & 0x7F;
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
        int var37 = arg0.field3556;
        arg0.field3556 += var32;
        int var38 = arg0.field3556;
        arg0.field3556 += var11;
        int var39 = arg0.field3556;
        arg0.field3556 += var10;
        int var40 = arg0.field3556;
        arg0.field3556 += var9;
        int var41 = arg0.field3556;
        arg0.field3556 += var22;
        int var42 = arg0.field3556;
        arg0.field3556 += var24;
        int var43 = arg0.field3556;
        arg0.field3556 += var26;
        int var44 = arg0.field3556;
        arg0.field3556 += var7 + var8 + var11;
        int var45 = arg0.field3556;
        arg0.field3556 += var7;
        int var46 = arg0.field3556;
        arg0.field3556 += var33;
        int var47 = arg0.field3556;
        arg0.field3556 += var8;
        int var48 = arg0.field3556;
        arg0.field3556 += var23;
        int var49 = arg0.field3556;
        arg0.field3556 += var25;
        int var50 = arg0.field3556;
        arg0.field3556 += var27;
        int var51 = arg0.field3556;
        arg0.field3556 += var12;
        int var52 = arg0.field3556;
        arg0.field3556 += var9;
        int var53 = arg0.field3556;
        arg0.field3556 += var28;
        int var54 = arg0.field3556;
        arg0.field3556 += var29;
        int var55 = arg0.field3556;
        arg0.field3556 += var30;
        int var56 = arg0.field3556;
        arg0.field3556 += var31;
        int var57 = arg0.field3556;
        arg0.field3556 += var5 * 3;
        this.field6446 = new byte[var20];
        class217 var58 = new class217(this.field6446);
        var58.method1566(true, 1297377380);
        var58.method1566(true, 6);
        var58.method1542(var2 > 1 ? 1 : 0, -2756);
        var58.method1542(var2, -2756);
        var58.method1542(var3, -2756);
        arg0.field3556 = var17;
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
            var58.method1566(true, 1297379947);
            var58.field3556 += 4;
            int var69 = var58.field3556;
            int var70 = -1;
            while (true) {
                while (true) {
                    int var71 = arg0.method1526((byte) -88);
                    var58.method1517(-16384, var71);
                    int var72 = arg0.field3572[var36++] & 0xFF;
                    boolean var73 = var70 != var72;
                    var70 = var72 & 0xF;
                    if (var72 == 7) {
                        if (var73) {
                            var58.method1545(255, -115);
                        }
                        var58.method1545(47, -34);
                        var58.method1545(0, -106);
                        var58.method1502((byte) -14, var58.field3556 - var69);
                        continue label223;
                    }
                    if (var72 == 23) {
                        if (var73) {
                            var58.method1545(255, -109);
                        }
                        var58.method1545(81, -51);
                        var58.method1545(3, -105);
                        var58.method1545(arg0.field3572[var57++], -50);
                        var58.method1545(arg0.field3572[var57++], -56);
                        var58.method1545(arg0.field3572[var57++], -105);
                    } else {
                        var59 ^= var72 >> 4;
                        if (var70 == 0) {
                            if (var73) {
                                var58.method1545(var59 + 144, -110);
                            }
                            var60 += arg0.field3572[var44++];
                            var61 += arg0.field3572[var45++];
                            var58.method1545(var60 & 0x7F, -81);
                            var58.method1545(var61 & 0x7F, -106);
                        } else if (var70 == 1) {
                            if (var73) {
                                var58.method1545(var59 + 128, -81);
                            }
                            var60 += arg0.field3572[var44++];
                            var62 += arg0.field3572[var47++];
                            var58.method1545(var60 & 0x7F, -46);
                            var58.method1545(var62 & 0x7F, -41);
                        } else if (var70 == 2) {
                            if (var73) {
                                var58.method1545(var59 + 176, -95);
                            }
                            var67 = var67 + arg0.field3572[var21++] & 0x7F;
                            var58.method1545(var67, -91);
                            byte var74;
                            if (var67 == 0 || var67 == 32) {
                                var74 = arg0.field3572[var51++];
                            } else if (var67 == 1) {
                                var74 = arg0.field3572[var41++];
                            } else if (var67 == 33) {
                                var74 = arg0.field3572[var48++];
                            } else if (var67 == 7) {
                                var74 = arg0.field3572[var42++];
                            } else if (var67 == 39) {
                                var74 = arg0.field3572[var49++];
                            } else if (var67 == 10) {
                                var74 = arg0.field3572[var43++];
                            } else if (var67 == 42) {
                                var74 = arg0.field3572[var50++];
                            } else if (var67 == 99) {
                                var74 = arg0.field3572[var53++];
                            } else if (var67 == 98) {
                                var74 = arg0.field3572[var54++];
                            } else if (var67 == 101) {
                                var74 = arg0.field3572[var55++];
                            } else if (var67 == 100) {
                                var74 = arg0.field3572[var56++];
                            } else if (var67 == 64 || var67 == 65 || var67 == 120 || var67 == 121 || var67 == 123) {
                                var74 = arg0.field3572[var37++];
                            } else {
                                var74 = arg0.field3572[var46++];
                            }
                            int var75 = var66[var67] + var74;
                            var66[var67] = var75;
                            var58.method1545(var75 & 0x7F, -73);
                        } else if (var70 == 3) {
                            if (var73) {
                                var58.method1545(var59 + 224, -85);
                            }
                            int var76 = var63 + arg0.field3572[var52++];
                            var63 = var76 + (arg0.field3572[var40++] << 7);
                            var58.method1545(var63 & 0x7F, -50);
                            var58.method1545(var63 >> 7 & 0x7F, -36);
                        } else if (var70 == 4) {
                            if (var73) {
                                var58.method1545(var59 + 208, -59);
                            }
                            var64 += arg0.field3572[var39++];
                            var58.method1545(var64 & 0x7F, -75);
                        } else if (var70 == 5) {
                            if (var73) {
                                var58.method1545(var59 + 160, -59);
                            }
                            var60 += arg0.field3572[var44++];
                            var65 += arg0.field3572[var38++];
                            var58.method1545(var60 & 0x7F, -53);
                            var58.method1545(var65 & 0x7F, -45);
                        } else if (var70 == 6) {
                            if (var73) {
                                var58.method1545(var59 + 192, -59);
                            }
                            var58.method1545(arg0.field3572[var51++], -124);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }
}
