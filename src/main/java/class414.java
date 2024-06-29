import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class414 extends class694 {

    @OriginalMember(owner = "client!jea", name = "H", descriptor = "I")
    private int field5856 = 4;

    @OriginalMember(owner = "client!jea", name = "P", descriptor = "I")
    private int field5863 = 4;

    @OriginalMember(owner = "client!jea", name = "I", descriptor = "Z")
    public static boolean field5857 = true;

    @OriginalMember(owner = "client!jea", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field5862 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!jea", name = "F", descriptor = "Lfc;")
    public static class235 field5854 = new class235(34, -1);

    @OriginalMember(owner = "client!jea", name = "G", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!jea", name = "K", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!jea", name = "L", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!jea", name = "M", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!jea", name = "N", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!jea", name = "Q", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field5859;
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (arg0 <= 112) {
            field5858 = -85;
        }
        if (super.field9751.field6674) {
            int var4 = class465.field6544 / this.field5856;
            int var5 = class250.field3529 / this.field5863;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method3809(0, class250.field3529 * var6 / var5, (byte) 35);
            } else {
                var7 = this.method3809(0, 0, (byte) 35);
            }
            for (int var8 = 0; ~class465.field6544 < ~var8; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class465.field6544 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILva;)V")
    public static final void method2359(int arg0, class457 arg1) {
        arg1.field6446 = 0;
        ++field5860;
        if (~arg1.field6464 != 0) {
            class131 var2 = class301.field4465.method2763(arg1.field6464, 31696);
            if (var2 != null && var2.field1806 != null) {
                label395: {
                    ++arg1.field6472;
                    if (arg1.field6426 < var2.field1806.length && ~arg1.field6472 < ~var2.field1810[arg1.field6426]) {
                        ++arg1.field6402;
                        ++arg1.field6426;
                        arg1.field6472 = 1;
                        class99.method769(class253.field3576 == arg1, arg1.field509, arg1.field520, var2, arg1.field514, arg0 ^ -51, arg1.field6426);
                    }
                    if (var2.field1806.length <= arg1.field6426) {
                        arg1.field6426 = 0;
                        arg1.field6472 = 0;
                        if (arg1.field6428) {
                            arg1.field6464 = arg1.method2636((byte) 71).method1892(false);
                            if (~arg1.field6464 == 0) {
                                arg1.field6428 = false;
                                break label395;
                            }
                            var2 = class301.field4465.method2763(arg1.field6464, arg0 ^ -31697);
                        }
                        class99.method769(class253.field3576 == arg1, arg1.field509, arg1.field520, var2, arg1.field514, 50, arg1.field6426);
                    }
                    arg1.field6402 = arg1.field6426 + 1;
                    if (~arg1.field6402 <= ~var2.field1806.length) {
                        arg1.field6402 = 0;
                    }
                }
            } else {
                arg1.field6464 = -1;
                arg1.field6428 = false;
            }
        }
        if (arg1.field6417 != arg0 && ~arg1.field6424 >= ~class239.field3440) {
            class586 var3 = class569.field7652.method2128(arg1.field6417, arg0);
            int var4 = var3.field8185;
            if (~var4 == 0) {
                arg1.field6417 = -1;
            } else {
                label397: {
                    class131 var5 = class301.field4465.method2763(var4, 31696);
                    if (var3.field8178) {
                        if (~var5.field1804 != -4) {
                            if (var5.field1804 == 1 && ~arg1.field6484 < -1 && ~arg1.field6470 >= ~class239.field3440 && arg1.field6434 < class239.field3440) {
                                arg1.field6424 = class239.field3440 + 1;
                                break label397;
                            }
                        } else if (~arg1.field6484 < -1 && arg1.field6470 <= class239.field3440 && arg1.field6434 < class239.field3440) {
                            arg1.field6417 = -1;
                            break label397;
                        }
                    }
                    if (var5 != null && var5.field1806 != null) {
                        if (~arg1.field6423 > -1) {
                            arg1.field6423 = 0;
                            class99.method769(class253.field3576 == arg1, arg1.field509, arg1.field520, var5, arg1.field514, 50, 0);
                        }
                        ++arg1.field6447;
                        if (~var5.field1806.length < ~arg1.field6423 && ~var5.field1810[arg1.field6423] > ~arg1.field6447) {
                            arg1.field6447 = 1;
                            ++arg1.field6423;
                            class99.method769(class253.field3576 == arg1, arg1.field509, arg1.field520, var5, arg1.field514, 50, arg1.field6423);
                        }
                        if (~arg1.field6423 <= ~var5.field1806.length) {
                            if (!var3.field8178) {
                                arg1.field6417 = -1;
                            } else {
                                ++arg1.field6390;
                                arg1.field6423 -= var5.field1800;
                                if (arg1.field6390 < var5.field1805) {
                                    if (~arg1.field6423 <= -1 && ~arg1.field6423 > ~var5.field1806.length) {
                                        class99.method769(class253.field3576 == arg1, arg1.field509, arg1.field520, var5, arg1.field514, 50, arg1.field6423);
                                    } else {
                                        arg1.field6417 = -1;
                                    }
                                } else {
                                    arg1.field6417 = -1;
                                }
                            }
                        }
                        arg1.field6392 = arg1.field6423 + 1;
                        if (~var5.field1806.length >= ~arg1.field6392) {
                            if (!var3.field8178) {
                                arg1.field6392 = -1;
                            } else {
                                arg1.field6392 -= var5.field1800;
                                if (arg1.field6390 + 1 < var5.field1805) {
                                    if (arg1.field6392 < 0 || ~var5.field1806.length >= ~arg1.field6392) {
                                        arg1.field6392 = -1;
                                    }
                                } else {
                                    arg1.field6392 = -1;
                                }
                            }
                        }
                    } else {
                        arg1.field6417 = -1;
                    }
                }
            }
        }
        if (arg1.field6443 != -1 && class239.field3440 >= arg1.field6460) {
            class586 var6 = class569.field7652.method2128(arg1.field6443, -1);
            int var7 = var6.field8185;
            if (~var7 == 0) {
                arg1.field6443 = -1;
            } else {
                label400: {
                    class131 var8 = class301.field4465.method2763(var7, 31696);
                    if (var6.field8178) {
                        if (var8.field1804 != 3) {
                            if (~var8.field1804 == -2 && ~arg1.field6484 < -1 && ~arg1.field6470 >= ~class239.field3440 && arg1.field6434 < class239.field3440) {
                                arg1.field6460 = class239.field3440 - -1;
                                break label400;
                            }
                        } else if (~arg1.field6484 < -1 && ~class239.field3440 <= ~arg1.field6470 && class239.field3440 > arg1.field6434) {
                            arg1.field6443 = -1;
                            break label400;
                        }
                    }
                    if (var8 != null && var8.field1806 != null) {
                        if (~arg1.field6445 > -1) {
                            arg1.field6445 = 0;
                            class99.method769(class253.field3576 == arg1, arg1.field509, arg1.field520, var8, arg1.field514, 50, 0);
                        }
                        ++arg1.field6448;
                        if (~arg1.field6445 > ~var8.field1806.length && arg1.field6448 > var8.field1810[arg1.field6445]) {
                            ++arg1.field6445;
                            arg1.field6448 = 1;
                            class99.method769(class253.field3576 == arg1, arg1.field509, arg1.field520, var8, arg1.field514, 50, arg1.field6445);
                        }
                        if (arg1.field6445 >= var8.field1806.length) {
                            if (var6.field8178) {
                                arg1.field6445 -= var8.field1800;
                                ++arg1.field6381;
                                if (~var8.field1805 < ~arg1.field6381) {
                                    if (arg1.field6445 >= 0 && ~var8.field1806.length < ~arg1.field6445) {
                                        class99.method769(class253.field3576 == arg1, arg1.field509, arg1.field520, var8, arg1.field514, 50, arg1.field6445);
                                    } else {
                                        arg1.field6443 = -1;
                                    }
                                } else {
                                    arg1.field6443 = -1;
                                }
                            } else {
                                arg1.field6443 = -1;
                            }
                        }
                        arg1.field6432 = arg1.field6445 + 1;
                        if (var8.field1806.length <= arg1.field6432) {
                            if (!var6.field8178) {
                                arg1.field6432 = -1;
                            } else {
                                arg1.field6432 -= var8.field1800;
                                if (~var8.field1805 >= ~(arg1.field6381 + 1)) {
                                    arg1.field6432 = -1;
                                } else if (arg1.field6432 < 0 || arg1.field6432 >= var8.field1806.length) {
                                    arg1.field6432 = -1;
                                }
                            }
                        }
                    } else {
                        arg1.field6443 = -1;
                    }
                }
            }
        }
        if (arg1.field6398 != -1 && arg1.field6427 <= 1) {
            class131 var9 = class301.field4465.method2763(arg1.field6398, 31696);
            if (~var9.field1804 == -4) {
                if (arg1.field6484 > 0 && ~class239.field3440 <= ~arg1.field6470 && arg1.field6434 < class239.field3440) {
                    arg1.field6398 = -1;
                }
            } else if (var9.field1804 == 1 && arg1.field6484 > 0 && ~class239.field3440 <= ~arg1.field6470 && arg1.field6434 < class239.field3440) {
                arg1.field6427 = 2;
            }
        }
        if (arg1.field6398 != -1 && arg1.field6427 == 0) {
            class131 var10 = class301.field4465.method2763(arg1.field6398, arg0 + 31697);
            if (var10 != null && var10.field1806 != null) {
                ++arg1.field6413;
                if (~arg1.field6450 > ~var10.field1806.length && arg1.field6413 > var10.field1810[arg1.field6450]) {
                    ++arg1.field6450;
                    arg1.field6413 = 1;
                    class99.method769(class253.field3576 == arg1, arg1.field509, arg1.field520, var10, arg1.field514, 50, arg1.field6450);
                }
                if (arg1.field6450 >= var10.field1806.length) {
                    arg1.field6450 -= var10.field1800;
                    ++arg1.field6444;
                    if (var10.field1805 <= arg1.field6444) {
                        arg1.field6398 = -1;
                    } else if (arg1.field6450 >= 0 && arg1.field6450 < var10.field1806.length) {
                        class99.method769(class253.field3576 == arg1, arg1.field509, arg1.field520, var10, arg1.field514, 50, arg1.field6450);
                    } else {
                        arg1.field6398 = -1;
                    }
                }
                arg1.field6393 = arg1.field6450 - -1;
                if (~arg1.field6393 <= ~var10.field1806.length) {
                    arg1.field6393 -= var10.field1800;
                    if (~var10.field1805 < ~(arg1.field6444 + 1)) {
                        if (~arg1.field6393 > -1 || arg1.field6393 >= var10.field1806.length) {
                            arg1.field6393 = -1;
                        }
                    } else {
                        arg1.field6393 = -1;
                    }
                }
                arg1.field6446 = var10.field1813;
            } else {
                arg1.field6398 = -1;
            }
        }
        if (arg1.field6427 > 0) {
            --arg1.field6427;
        }
        for (int var11 = 0; var11 < arg1.field6400.length; ++var11) {
            class535 var12 = arg1.field6400[var11];
            if (var12 != null) {
                if (var12.field7283 > 0) {
                    --var12.field7283;
                } else {
                    class131 var13 = class301.field4465.method2763(var12.field7288, 31696);
                    if (var13 != null && var13.field1806 != null) {
                        ++var12.field7284;
                        if (var12.field7287 < var13.field1806.length && var13.field1810[var12.field7287] < var12.field7284) {
                            ++var12.field7287;
                            var12.field7284 = 1;
                            class99.method769(class253.field3576 == arg1, arg1.field509, arg1.field520, var13, arg1.field514, 50, var12.field7287);
                        }
                        if (~var12.field7287 <= ~var13.field1806.length) {
                            ++var12.field7280;
                            var12.field7287 -= var13.field1800;
                            if (var12.field7280 >= var13.field1805) {
                                arg1.field6400[var11] = null;
                            } else if (~var12.field7287 <= -1 && var12.field7287 < var13.field1806.length) {
                                class99.method769(class253.field3576 == arg1, arg1.field509, arg1.field520, var13, arg1.field514, 50, var12.field7287);
                            } else {
                                arg1.field6400[var11] = null;
                            }
                        }
                        var12.field7278 = var12.field7287 + 1;
                        if (var13.field1806.length <= var12.field7278) {
                            var12.field7278 -= var13.field1800;
                            if (var12.field7280 + 1 < var13.field1805) {
                                if (~var12.field7278 > -1 || ~var12.field7278 <= ~var13.field1806.length) {
                                    var12.field7278 = -1;
                                }
                            } else {
                                var12.field7278 = -1;
                            }
                        }
                    } else {
                        arg1.field6400[var11] = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILjr;B)V")
    public final void method19(int arg0, class96 arg1, byte arg2) {
        int var4 = -26 / ((58 - arg2) / 63);
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field5863 = arg1.method718(83);
            }
        } else {
            this.field5856 = arg1.method718(84);
        }
        ++field5864;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IB)V")
    public static final void method2360(int arg0, byte arg1) {
        ++field5861;
        class679 var2 = class669.method3708(4, arg0, 1403048928);
        if (arg1 != -58) {
            method2361(123);
        }
        var2.method3749(-112);
    }

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "(I)V")
    public static void method2361(int arg0) {
        field5862 = null;
        if (arg0 > -82) {
            field5857 = true;
        }
        field5854 = null;
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field5855;
        int[][] var3 = super.field9740.method3483(arg1, true);
        if (super.field9740.field8738) {
            int var4 = class465.field6544 / this.field5856;
            int var5 = class250.field3529 / this.field5863;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method3812(class250.field3529 * var6 / var5, 0, -14032);
            } else {
                var7 = this.method3812(0, 0, -14032);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class465.field6544; ++var14) {
                int var16;
                if (~var4 < -1) {
                    int var15 = var14 % var4;
                    var16 = class465.field6544 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        if (arg0 != -22151) {
            method2361(99);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "()V")
    public class414() {
        super(1, false);
    }
}
