import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("s")
public class class166 extends class71 {

    @OriginalMember(owner = "s", name = "n", descriptor = "[B")
    public byte[] field3106;

    @OriginalMember(owner = "s", name = "o", descriptor = "Leh;")
    public class49 field3107;

    @OriginalMember(owner = "s", name = "a", descriptor = "()V")
    public final void method1117() {
        this.field3107 = null;
    }

    @OriginalMember(owner = "s", name = "<init>", descriptor = "(Lja;)V")
    private class166(class86 arg0) {
        arg0.field1773 = arg0.field1808.length - 3;
        int var2 = arg0.method598((byte) 81);
        int var3 = arg0.method569(true);
        int var4 = var2 * 10 + 14;
        arg0.field1773 = 0;
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
                int var78 = arg0.method598((byte) 109);
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
        int var17 = arg0.field1773;
        int var18 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var19 = 0; var19 < var18; var19++) {
            arg0.method555(105);
        }
        int var20 = arg0.field1773 + var16 - var17;
        int var21 = arg0.field1773;
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
            var34 = var34 + arg0.method598((byte) 110) & 0x7F;
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
        int var37 = arg0.field1773;
        arg0.field1773 += var32;
        int var38 = arg0.field1773;
        arg0.field1773 += var11;
        int var39 = arg0.field1773;
        arg0.field1773 += var10;
        int var40 = arg0.field1773;
        arg0.field1773 += var9;
        int var41 = arg0.field1773;
        arg0.field1773 += var22;
        int var42 = arg0.field1773;
        arg0.field1773 += var24;
        int var43 = arg0.field1773;
        arg0.field1773 += var26;
        int var44 = arg0.field1773;
        arg0.field1773 += var7 + var8 + var11;
        int var45 = arg0.field1773;
        arg0.field1773 += var7;
        int var46 = arg0.field1773;
        arg0.field1773 += var33;
        int var47 = arg0.field1773;
        arg0.field1773 += var8;
        int var48 = arg0.field1773;
        arg0.field1773 += var23;
        int var49 = arg0.field1773;
        arg0.field1773 += var25;
        int var50 = arg0.field1773;
        arg0.field1773 += var27;
        int var51 = arg0.field1773;
        arg0.field1773 += var12;
        int var52 = arg0.field1773;
        arg0.field1773 += var9;
        int var53 = arg0.field1773;
        arg0.field1773 += var28;
        int var54 = arg0.field1773;
        arg0.field1773 += var29;
        int var55 = arg0.field1773;
        arg0.field1773 += var30;
        int var56 = arg0.field1773;
        arg0.field1773 += var31;
        int var57 = arg0.field1773;
        arg0.field1773 += var5 * 3;
        this.field3106 = new byte[var20];
        class86 var58 = new class86(this.field3106);
        var58.method588((byte) 111, 1297377380);
        var58.method588((byte) 121, 6);
        var58.method557(9698, var2 > 1 ? 1 : 0);
        var58.method557(9698, var2);
        var58.method557(9698, var3);
        arg0.field1773 = var17;
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
            var58.method588((byte) 118, 1297379947);
            var58.field1773 += 4;
            int var69 = var58.field1773;
            int var70 = -1;
            while (true) {
                while (true) {
                    int var71 = arg0.method555(111);
                    var58.method581(-1124959588, var71);
                    int var72 = arg0.field1808[var36++] & 0xFF;
                    boolean var73 = var70 != var72;
                    var70 = var72 & 0xF;
                    if (var72 == 7) {
                        if (var73) {
                            var58.method568(-13488, 255);
                        }
                        var58.method568(-13488, 47);
                        var58.method568(-13488, 0);
                        var58.method605((byte) 105, var58.field1773 - var69);
                        continue label223;
                    }
                    if (var72 == 23) {
                        if (var73) {
                            var58.method568(-13488, 255);
                        }
                        var58.method568(-13488, 81);
                        var58.method568(-13488, 3);
                        var58.method568(-13488, arg0.field1808[var57++]);
                        var58.method568(-13488, arg0.field1808[var57++]);
                        var58.method568(-13488, arg0.field1808[var57++]);
                    } else {
                        var59 ^= var72 >> 4;
                        if (var70 == 0) {
                            if (var73) {
                                var58.method568(-13488, var59 + 144);
                            }
                            var60 += arg0.field1808[var44++];
                            var61 += arg0.field1808[var45++];
                            var58.method568(-13488, var60 & 0x7F);
                            var58.method568(-13488, var61 & 0x7F);
                        } else if (var70 == 1) {
                            if (var73) {
                                var58.method568(-13488, var59 + 128);
                            }
                            var60 += arg0.field1808[var44++];
                            var62 += arg0.field1808[var47++];
                            var58.method568(-13488, var60 & 0x7F);
                            var58.method568(-13488, var62 & 0x7F);
                        } else if (var70 == 2) {
                            if (var73) {
                                var58.method568(-13488, var59 + 176);
                            }
                            var67 = var67 + arg0.field1808[var21++] & 0x7F;
                            var58.method568(-13488, var67);
                            byte var74;
                            if (var67 == 0 || var67 == 32) {
                                var74 = arg0.field1808[var51++];
                            } else if (var67 == 1) {
                                var74 = arg0.field1808[var41++];
                            } else if (var67 == 33) {
                                var74 = arg0.field1808[var48++];
                            } else if (var67 == 7) {
                                var74 = arg0.field1808[var42++];
                            } else if (var67 == 39) {
                                var74 = arg0.field1808[var49++];
                            } else if (var67 == 10) {
                                var74 = arg0.field1808[var43++];
                            } else if (var67 == 42) {
                                var74 = arg0.field1808[var50++];
                            } else if (var67 == 99) {
                                var74 = arg0.field1808[var53++];
                            } else if (var67 == 98) {
                                var74 = arg0.field1808[var54++];
                            } else if (var67 == 101) {
                                var74 = arg0.field1808[var55++];
                            } else if (var67 == 100) {
                                var74 = arg0.field1808[var56++];
                            } else if (var67 == 64 || var67 == 65 || var67 == 120 || var67 == 121 || var67 == 123) {
                                var74 = arg0.field1808[var37++];
                            } else {
                                var74 = arg0.field1808[var46++];
                            }
                            int var75 = var66[var67] + var74;
                            var66[var67] = var75;
                            var58.method568(-13488, var75 & 0x7F);
                        } else if (var70 == 3) {
                            if (var73) {
                                var58.method568(-13488, var59 + 224);
                            }
                            int var76 = var63 + arg0.field1808[var52++];
                            var63 = var76 + (arg0.field1808[var40++] << 7);
                            var58.method568(-13488, var63 & 0x7F);
                            var58.method568(-13488, var63 >> 7 & 0x7F);
                        } else if (var70 == 4) {
                            if (var73) {
                                var58.method568(-13488, var59 + 208);
                            }
                            var64 += arg0.field1808[var39++];
                            var58.method568(-13488, var64 & 0x7F);
                        } else if (var70 == 5) {
                            if (var73) {
                                var58.method568(-13488, var59 + 160);
                            }
                            var60 += arg0.field1808[var44++];
                            var65 += arg0.field1808[var38++];
                            var58.method568(-13488, var60 & 0x7F);
                            var58.method568(-13488, var65 & 0x7F);
                        } else if (var70 == 6) {
                            if (var73) {
                                var58.method568(-13488, var59 + 192);
                            }
                            var58.method568(-13488, arg0.field1808[var51++]);
                        } else {
                            throw new RuntimeException();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "s", name = "b", descriptor = "()V")
    public final void method1118() {
        if (this.field3107 != null) {
            return;
        }
        this.field3107 = new class49(16);
        int[] var1 = new int[16];
        int[] var2 = new int[16];
        var1[9] = var2[9] = 128;
        class154 var3 = new class154(this.field3106);
        int var4 = var3.method1058();
        for (int var5 = 0; var5 < var4; var5++) {
            var3.method1059(var5);
            var3.method1055(var5);
            var3.method1060(var5);
        }
        label53: do {
            while (true) {
                int var6 = var3.method1057();
                int var7 = var3.field2926[var6];
                while (var3.field2926[var6] == var7) {
                    var3.method1059(var6);
                    int var8 = var3.method1052(var6);
                    if (var8 == 1) {
                        var3.method1062();
                        var3.method1060(var6);
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
                            class36 var19 = (class36) this.field3107.method337((long) var18, (byte) -119);
                            if (var19 == null) {
                                var19 = new class36(new byte[128]);
                                this.field3107.method339((long) var18, false, var19);
                            }
                            var19.field795[var16] = 1;
                        }
                    }
                    var3.method1055(var6);
                    var3.method1060(var6);
                }
            }
        } while (!var3.method1066());
    }

    @OriginalMember(owner = "s", name = "a", descriptor = "(Lbg;II)Ls;")
    public static final class166 method1119(class18 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method147(0, arg2, arg1);
        return var3 == null ? null : new class166(new class86(var3));
    }
}
