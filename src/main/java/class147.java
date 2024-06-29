import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class147 extends class288 {

    @OriginalMember(owner = "client!df", name = "H", descriptor = "I")
    private int field2365 = 0;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "I")
    private int field2370 = 0;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "I")
    private int field2378 = 0;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "J")
    public static long field2377 = 0L;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "I")
    public static int field2382 = 0;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "Leg;")
    public static class272 field2366 = new class272(4);

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    private int field2364;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    private int field2367;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    private int field2371;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "I")
    private int field2373;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    private int field2375;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!df", name = "X", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "I")
    private int field2381;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "Lic;")
    public static class104 field2361;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "Ljj;")
    public static class134 field2362;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIZ)V")
    private final void method1001(int arg0, int arg1, int arg2, boolean arg3) {
        int var5 = arg0 <= arg2 ? arg2 : arg0;
        if (arg3) {
            int var6 = ~arg0 <= ~arg2 ? arg2 : arg0;
            int var7 = ~arg1 <= ~var6 ? var6 : arg1;
            int var8 = var5 >= arg1 ? var5 : arg1;
            ++field2376;
            this.field2375 = (var7 - -var8) / 2;
            int var9 = -var7 + var8;
            if (~var9 < -1) {
                int var10 = (-arg2 + var8 << 12) / var9;
                int var11 = (-arg0 + var8 << 12) / var9;
                int var12 = (-arg1 + var8 << 12) / var9;
                if (arg0 != var8) {
                    if (arg2 != var8) {
                        this.field2373 = ~arg0 != ~var7 ? -var11 + 20480 : var10 + 12288;
                    } else {
                        this.field2373 = arg1 == var7 ? var11 + 4096 : -var12 + 12288;
                    }
                } else {
                    this.field2373 = arg2 == var7 ? var12 + 20480 : -var10 + 4096;
                }
                this.field2373 /= 6;
            } else {
                this.field2373 = 0;
            }
            if (~this.field2375 < -1 && this.field2375 < 4096) {
                this.field2371 = (var9 << 12) / (this.field2375 > 2048 ? -(this.field2375 * 2) + 8192 : this.field2375 * 2);
            } else {
                this.field2371 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIBI)V")
    private final void method1002(int arg0, int arg1, byte arg2, int arg3) {
        int var5 = ~arg1 < -2049 ? -(arg0 * arg1 >> 12) + arg1 + arg0 : (arg0 + 4096) * arg1 >> 12;
        if (~var5 >= -1) {
            this.field2381 = this.field2367 = this.field2364 = arg1;
        } else {
            int var6 = arg3 * 6;
            int var7 = arg1 + arg1 + -var5;
            int var8 = var6 >> 12;
            int var9 = var6 - (var8 << 12);
            int var10 = (var5 - var7 << 12) / var5;
            int var12 = var10 * var5 >> 12;
            int var13 = var9 * var12 >> 12;
            int var14 = var7 - -var13;
            int var15 = var5 - var13;
            if (var8 != 0) {
                if (var8 != 1) {
                    if (~var8 != -3) {
                        if (~var8 != -4) {
                            if (var8 != 4) {
                                if (var8 == 5) {
                                    this.field2364 = var15;
                                    this.field2367 = var7;
                                    this.field2381 = var5;
                                }
                            } else {
                                this.field2381 = var14;
                                this.field2367 = var7;
                                this.field2364 = var5;
                            }
                        } else {
                            this.field2364 = var5;
                            this.field2367 = var15;
                            this.field2381 = var7;
                        }
                    } else {
                        this.field2381 = var7;
                        this.field2364 = var14;
                        this.field2367 = var5;
                    }
                } else {
                    this.field2381 = var15;
                    this.field2364 = var7;
                    this.field2367 = var5;
                }
            } else {
                this.field2367 = var14;
                this.field2364 = var7;
                this.field2381 = var5;
            }
        }
        ++field2372;
        if (arg2 >= -74) {
            field2382 = 19;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lil;I)V")
    public static final void method1003(class49 arg0, int arg1) {
        ++field2379;
        if (~arg0.field611 != arg1) {
            class177 var2 = arg0.method375(0);
            if (~arg0.field603 != 0 && arg0.field603 < 32768) {
                class275 var3 = class198.field3193[arg0.field603];
                if (var3 != null) {
                    int var4 = -var3.field614 + arg0.field614;
                    int var5 = -var3.field613 + arg0.field613;
                    if (var4 != 0 || ~var5 != -1) {
                        arg0.field691 = 2047 & (int) (325.949D * Math.atan2((double) var4, (double) var5));
                    }
                }
            }
            if (~arg0.field603 <= -32769) {
                int var6 = arg0.field603 - 32768;
                if (class80.field1121 == var6) {
                    var6 = 2047;
                }
                class235 var7 = class260.field4141[var6];
                if (var7 != null) {
                    int var8 = -var7.field614 + arg0.field614;
                    int var9 = -var7.field613 + arg0.field613;
                    if (var8 != 0 || ~var9 != -1) {
                        arg0.field691 = 2047 & (int) (Math.atan2((double) var8, (double) var9) * 325.949D);
                    }
                }
            }
            if ((~arg0.field620 != -1 || ~arg0.field636 != -1) && (~arg0.field644 == -1 || ~arg0.field683 < -1)) {
                int var10 = -((-class296.field4685 + arg0.field620 - class296.field4685) * 64) + arg0.field614;
                int var11 = -((-class93.field1321 + arg0.field636 + -class93.field1321) * 64) + arg0.field613;
                if (~var10 != -1 || var11 != 0) {
                    arg0.field691 = (int) (325.949D * Math.atan2((double) var10, (double) var11)) & 2047;
                }
                arg0.field636 = 0;
                arg0.field620 = 0;
            }
            int var12 = -arg0.field657 + arg0.field691 & 2047;
            if (var12 == 0) {
                arg0.field705 = 0;
                arg0.field645 = 0;
            } else {
                if (var2.field2860 != 0) {
                    arg0.field659 = -1;
                    int var13 = arg0.field691 << 5;
                    if (arg0.field655 != var13) {
                        arg0.field696 = 0;
                        arg0.field655 = var13;
                        int var14 = var13 - arg0.field687 & 65535;
                        int var15 = arg0.field705 * arg0.field705 / (var2.field2860 * 2);
                        if (arg0.field705 > 0 && ~var14 <= ~var15 && -var15 + var14 < 32768) {
                            arg0.field604 = var14 / 2;
                            arg0.field684 = true;
                            int var16 = var2.field2855 * var2.field2855 / (var2.field2860 * 2);
                            if (~var16 < -32768) {
                                var16 = 32767;
                            }
                            if (var16 < arg0.field604) {
                                arg0.field604 = -var16 + var14;
                            }
                        } else if (~arg0.field705 > -1 && ~var15 >= ~(-var14 + 65536) && ~(-var14 + 65536 + -var15) > -32769) {
                            arg0.field684 = true;
                            arg0.field604 = (-var14 + 65536) / 2;
                            int var17 = var2.field2855 * var2.field2855 / (var2.field2860 * 2);
                            if (var17 > 32767) {
                                var17 = 32767;
                            }
                            if (~var17 > ~arg0.field604) {
                                arg0.field604 = -var14 + 65536 + -var17;
                            }
                        } else {
                            arg0.field684 = false;
                        }
                    }
                    if (~arg0.field705 == -1) {
                        int var18 = 65535 & -arg0.field687 + arg0.field655;
                        if (~var18 <= ~var2.field2860) {
                            int var19 = var2.field2855 * var2.field2855 / (var2.field2860 * 2);
                            if (var19 > 32767) {
                                var19 = 32767;
                            }
                            arg0.field684 = true;
                            if (~var18 > -32769) {
                                arg0.field604 = var18 / 2;
                                if (arg0.field604 > var19) {
                                    arg0.field604 = var18 - var19;
                                }
                                arg0.field705 = var2.field2860;
                            } else {
                                arg0.field604 = (65536 - var18) / 2;
                                if (~arg0.field604 < ~var19) {
                                    arg0.field604 = 65536 - var18 - var19;
                                }
                                arg0.field705 = -var2.field2860;
                            }
                            arg0.field696 = 0;
                        } else {
                            arg0.field687 = arg0.field655;
                        }
                    } else if (arg0.field705 > 0) {
                        if (arg0.field696 >= arg0.field604) {
                            arg0.field684 = false;
                        }
                        if (arg0.field684) {
                            if (~var2.field2855 < ~arg0.field705) {
                                arg0.field705 += var2.field2860;
                            }
                        } else {
                            arg0.field705 -= var2.field2860;
                            if (~arg0.field705 > -1) {
                                arg0.field705 = 0;
                            }
                        }
                    } else {
                        if (~arg0.field696 <= ~arg0.field604) {
                            arg0.field684 = false;
                        }
                        if (!arg0.field684) {
                            arg0.field705 += var2.field2860;
                            if (arg0.field705 > 0) {
                                arg0.field705 = 0;
                            }
                        } else if (~arg0.field705 < ~(-var2.field2855)) {
                            arg0.field705 -= var2.field2860;
                        }
                    }
                    arg0.field687 += arg0.field705;
                    arg0.field687 &= 65535;
                    arg0.field657 = arg0.field687 >> 5;
                    if (~arg0.field705 >= -1) {
                        arg0.field696 -= arg0.field705;
                    } else {
                        arg0.field696 += arg0.field705;
                    }
                    if (~arg0.field705 <= -1) {
                        if (arg0.field644 > 0) {
                            if (arg0.field689[arg0.field644 + -1] != 2) {
                                if (~arg0.field689[arg0.field644 - 1] == -1) {
                                    if (~var2.field2857 != 0) {
                                        arg0.field659 = var2.field2857;
                                    } else if (var2.field2858 != -1) {
                                        arg0.field659 = var2.field2858;
                                    }
                                }
                            } else if (~var2.field2839 == 0) {
                                if (~var2.field2831 != 0) {
                                    arg0.field659 = var2.field2831;
                                }
                            } else {
                                arg0.field659 = var2.field2839;
                            }
                        }
                        if (arg0.field659 == -1) {
                            if (var2.field2843 == -1) {
                                if (var2.field2850 != -1) {
                                    arg0.field659 = var2.field2850;
                                }
                            } else {
                                arg0.field659 = var2.field2843;
                            }
                        }
                    } else {
                        if (arg0.field644 > 0) {
                            if (arg0.field689[arg0.field644 + -1] != 2) {
                                if (~arg0.field689[arg0.field644 + -1] == -1) {
                                    if (~var2.field2836 != 0) {
                                        arg0.field659 = var2.field2836;
                                    } else if (~var2.field2858 != 0) {
                                        arg0.field659 = var2.field2858;
                                    }
                                }
                            } else if (var2.field2833 == -1) {
                                if (~var2.field2831 != 0) {
                                    arg0.field659 = var2.field2831;
                                }
                            } else {
                                arg0.field659 = var2.field2833;
                            }
                        }
                        if (arg0.field659 == -1) {
                            if (var2.field2851 == -1) {
                                if (~var2.field2844 != 0) {
                                    arg0.field659 = var2.field2844;
                                }
                            } else {
                                arg0.field659 = var2.field2851;
                            }
                        }
                    }
                    if (~arg0.field659 == 0) {
                        arg0.field659 = var2.field2874;
                        return;
                    }
                } else {
                    ++arg0.field645;
                    if (var12 <= 1024) {
                        arg0.field657 += arg0.field611;
                        boolean var20 = true;
                        if (~arg0.field611 < ~var12 || var12 > 2048 - arg0.field611) {
                            arg0.field657 = arg0.field691;
                            var20 = false;
                        }
                        if (arg0.field645 > 25 || var20) {
                            arg0.field659 = var2.field2874;
                            if (arg0.field644 <= 0) {
                                if (var2.field2850 != -1) {
                                    arg0.field659 = var2.field2850;
                                }
                            } else if (~arg0.field689[arg0.field644 + -1] != -3) {
                                if (arg0.field689[arg0.field644 + -1] != 0) {
                                    if (var2.field2843 != -1) {
                                        arg0.field659 = var2.field2843;
                                    }
                                } else if (var2.field2857 != -1) {
                                    arg0.field659 = var2.field2857;
                                } else if (var2.field2858 != -1) {
                                    arg0.field659 = var2.field2858;
                                }
                            } else if (var2.field2839 == -1) {
                                if (~var2.field2831 != 0) {
                                    arg0.field659 = var2.field2831;
                                }
                            } else {
                                arg0.field659 = var2.field2839;
                            }
                        }
                    } else {
                        arg0.field657 -= arg0.field611;
                        boolean var21 = true;
                        if (var12 < arg0.field611 || var12 > 2048 - arg0.field611) {
                            var21 = false;
                            arg0.field657 = arg0.field691;
                        }
                        if (arg0.field645 > 25 || var21) {
                            arg0.field659 = var2.field2874;
                            if (~arg0.field644 >= -1) {
                                if (~var2.field2844 != 0) {
                                    arg0.field659 = var2.field2844;
                                }
                            } else if (~arg0.field689[arg0.field644 + -1] != -3) {
                                if (~arg0.field689[arg0.field644 - 1] != -1) {
                                    if (~var2.field2851 != 0) {
                                        arg0.field659 = var2.field2851;
                                    }
                                } else if (~var2.field2836 == 0) {
                                    if (~var2.field2858 != 0) {
                                        arg0.field659 = var2.field2858;
                                    }
                                } else {
                                    arg0.field659 = var2.field2836;
                                }
                            } else if (~var2.field2833 != 0) {
                                arg0.field659 = var2.field2833;
                            } else if (var2.field2831 != -1) {
                                arg0.field659 = var2.field2831;
                            }
                        }
                    }
                    arg0.field657 &= 2047;
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIILli;IJZ)Z")
    public static final boolean method1004(int arg0, int arg1, int arg2, int arg3, int arg4, class197 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        } else {
            int var10 = arg1 - arg4;
            int var11 = arg2 - arg4;
            int var12 = arg1 + arg4;
            int var13 = arg2 + arg4;
            if (arg8) {
                if (arg6 > 640 && arg6 < 1408) {
                    var13 += 128;
                }
                if (arg6 > 1152 && arg6 < 1920) {
                    var12 += 128;
                }
                if (arg6 > 1664 || arg6 < 384) {
                    var11 -= 128;
                }
                if (arg6 > 128 && arg6 < 896) {
                    var10 -= 128;
                }
            }
            int var14 = var10 / 128;
            int var15 = var11 / 128;
            int var16 = var12 / 128;
            int var17 = var13 / 128;
            return class258.method1695(arg0, var14, var15, var16 - var14 + 1, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method1005(long arg0, byte arg1) {
        ++field2368;
        class25.field304.setTime(new Date(arg0));
        int var3 = class25.field304.get(7);
        int var4 = class25.field304.get(5);
        int var5 = class25.field304.get(2);
        int var6 = class25.field304.get(1);
        int var7 = class25.field304.get(11);
        int var8 = class25.field304.get(12);
        int var9 = class25.field304.get(13);
        if (arg1 != 53) {
            method1005(-120L, (byte) -53);
        }
        return class232.field3692[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class217.field3474[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    public class147() {
        super(1, false);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILfi;IIB)V")
    public static final void method1006(int arg0, class235 arg1, int arg2, int arg3, byte arg4) {
        ++field2363;
        if (class197.field3179 != arg1) {
            if (~class202.field3248 > -401) {
                String var5;
                if (~arg1.field3747 != -1) {
                    var5 = arg1.method1552((byte) -110) + " (" + class280.field4475 + arg1.field3747 + ")";
                } else {
                    boolean var6 = true;
                    if (~class197.field3179.field3739 != 0 && ~arg1.field3739 != 0) {
                        int var7 = ~arg1.field3760 > ~class197.field3179.field3760 ? class197.field3179.field3760 : arg1.field3760;
                        int var8 = ~class197.field3179.field3739 > ~arg1.field3739 ? class197.field3179.field3739 : arg1.field3739;
                        int var9 = var7 * 10 / 100 + 5 + var8;
                        int var10 = -arg1.field3760 + class197.field3179.field3760;
                        if (var10 < 0) {
                            var10 = -var10;
                        }
                        if (var10 > var9) {
                            var6 = false;
                        }
                    }
                    String var11 = class189.field3026 == 1 ? class62.field865 : class173.field2800;
                    if (arg1.field3740 > arg1.field3760) {
                        var5 = arg1.method1552((byte) -126) + (!var6 ? "<col=ffffff>" : class6.method37(-3, class197.field3179.field3760, arg1.field3760)) + " (" + var11 + arg1.field3760 + "+" + (-arg1.field3760 + arg1.field3740) + ")";
                    } else {
                        var5 = arg1.method1552((byte) -102) + (!var6 ? "<col=ffffff>" : class6.method37(-3, class197.field3179.field3760, arg1.field3760)) + " (" + var11 + arg1.field3760 + ")";
                    }
                }
                if (class262.field4151 != 1) {
                    if (!class290.field4632) {
                        for (int var12 = 7; var12 >= 0; --var12) {
                            if (class220.field3513[var12] != null) {
                                ++class207.field3342;
                                short var13 = 0;
                                if (class189.field3026 == 0 && class220.field3513[var12].equalsIgnoreCase(class144.field2333)) {
                                    if (arg1.field3760 > class197.field3179.field3760) {
                                        var13 = 2000;
                                    }
                                    if (class197.field3179.field3749 != 0 && ~arg1.field3749 != -1) {
                                        if (~class197.field3179.field3749 == ~arg1.field3749) {
                                            var13 = 2000;
                                        } else {
                                            var13 = 0;
                                        }
                                    }
                                } else if (class81.field1128[var12]) {
                                    var13 = 2000;
                                }
                                boolean var14 = false;
                                short var15 = class101.field1532[var12];
                                short var16 = (short) (var13 + var15);
                                class38.method301(arg3, class220.field3513[var12], "<col=ffffff>" + var5, var16, class230.field3649[var12], 43, (long) arg0, arg2);
                            }
                        }
                    } else if ((class125.field2098 & 8) != 0) {
                        class38.method301(arg3, class117.field1995, class21.field268 + " -> <col=ffffff>" + var5, (short) 58, class17.field201, 52, (long) arg0, arg2);
                        ++class168.field2728;
                    }
                } else {
                    class38.method301(arg3, class46.field556, class74.field1010 + " -> <col=ffffff>" + var5, (short) 40, class38.field466, 118, (long) arg0, arg2);
                    ++class179.field2902;
                }
                for (int var17 = 0; ~class202.field3248 < ~var17; ++var17) {
                    if (~class23.field291[var17] == -8) {
                        class162.field2633[var17] = "<col=ffffff>" + var5;
                        break;
                    }
                }
                if (arg4 >= -70) {
                    method1006(-114, (class235) null, -2, -84, (byte) -99);
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
    public static void method1007(int arg0) {
        field2366 = null;
        field2362 = null;
        field2361 = null;
        if (arg0 != 32767) {
            field2362 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(JI)V")
    public static final void method1008(long arg0, int arg1) {
        ++field2369;
        if (arg0 != 0L) {
            ++class21.field258;
            class83.field1148.method1238(6, -136478397);
            class83.field1148.method1762(arg0, (byte) -82);
            int var3 = 67 % ((arg1 - -24) / 36);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)[[I")
    public final int[][] method34(int arg0, int arg1) {
        ++field2380;
        if (arg0 != 1) {
            this.method1001(-14, -72, 6, false);
        }
        int[][] var3 = super.field4598.method812(arg1, arg0 + 65534);
        if (super.field4598.field1954) {
            int[][] var4 = this.method1930(0, arg1, (byte) 106);
            int[] var5 = var4[0];
            int[] var6 = var3[1];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; class186.field2986 > var11; ++var11) {
                this.method1001(var5[var11], var9[var11], var7[var11], true);
                this.field2371 += this.field2365;
                this.field2375 += this.field2378;
                this.field2373 += this.field2370;
                if (~this.field2371 > -1) {
                    this.field2371 = 0;
                }
                if (~this.field2375 > -1) {
                    this.field2375 = 0;
                }
                if (~this.field2371 < -4097) {
                    this.field2371 = 4096;
                }
                while (~this.field2373 > -1) {
                    this.field2373 += 4096;
                }
                if (~this.field2375 < -4097) {
                    this.field2375 = 4096;
                }
                while (~this.field2373 < -4097) {
                    this.field2373 -= 4096;
                }
                this.method1002(this.field2371, this.field2375, (byte) -103, this.field2373);
                var8[var11] = this.field2381;
                var6[var11] = this.field2367;
                var10[var11] = this.field2364;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        ++field2374;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field2378 = (arg0.method1767(16711680) << 12) / 100;
                }
            } else {
                this.field2365 = (arg0.method1767(arg1 + 16711699) << 12) / 100;
            }
        } else {
            this.field2370 = arg0.method1756(-96);
        }
        if (arg1 != -19) {
            method1007(34);
        }
    }
}
