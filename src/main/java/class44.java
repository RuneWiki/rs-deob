import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class44 extends class398 {

    @OriginalMember(owner = "client!be", name = "U", descriptor = "I")
    private int field626 = 4096;

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "I")
    private int field631 = 3216;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "I")
    private int field618 = 3216;

    @OriginalMember(owner = "client!be", name = "V", descriptor = "[I")
    private int[] field627 = new int[3];

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "[I")
    public static int[] field630 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!be", name = "W", descriptor = "Ljava/lang/String;")
    public static String field628 = "Loading defaults - ";

    @OriginalMember(owner = "client!be", name = "X", descriptor = "[[I")
    public static int[][] field629 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!be", name = "M", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!be", name = "P", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!be", name = "R", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!be", name = "ab", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!be", name = "bb", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field617;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lnj;II)V", line = 3)
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (arg2 == -13132) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        this.field618 = arg0.method1343(255);
                    }
                } else {
                    this.field631 = arg0.method1343(255);
                }
            } else {
                this.field626 = arg0.method1343(arg2 + 13387);
            }
            ++field623;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[I", line = 48)
    public final int[] method95(int arg0, int arg1) {
        ++field621;
        int[] var3 = super.field5927.method305(arg0, (byte) 91);
        if (arg1 != 0) {
            this.method321(true);
        }
        if (super.field5927.field591) {
            int var4 = class448.field6570 * this.field626 >> 12;
            int[] var5 = this.method2558(0, 29295, arg0 - 1 & class411.field6070);
            int[] var6 = this.method2558(0, 29295, arg0);
            int[] var7 = this.method2558(0, 29295, arg0 + 1 & class411.field6070);
            for (int var8 = 0; class140.field1922 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 + -1 & class242.field3233] + -var6[class242.field3233 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class72.field1039[var11 - -((var12 + 1) * var12 >> 1)];
                int var14 = var10 * var13 >> 8;
                int var15 = var13 * 4096 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field627[1] * var16 >> 12;
                int var18 = this.field627[0] * var14 >> 12;
                int var19 = this.field627[2] * var15 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZZ)V", line = 125)
    public static final void method316(boolean arg0, boolean arg1) {
        ++field632;
        if (arg1) {
            class265.field3845 = arg0;
            class317.field4643 = !class11.method79((byte) -21);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIII)V", line = 137)
    public static final void method317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field625;
        int var6 = class304.method2068(class379.field5521, arg5, -102, class125.field1751);
        int var7 = class304.method2068(class379.field5521, arg4, -104, class125.field1751);
        if (arg0 == -7209) {
            int var8 = class304.method2068(class87.field1227, arg3, -119, class299.field4382);
            int var9 = class304.method2068(class87.field1227, arg1, -122, class299.field4382);
            for (int var10 = var6; var7 >= var10; ++var10) {
                class207.method1221((byte) -128, var8, var9, class384.field5560[var10], arg2);
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V", line = 164)
    public final void method209(int arg0) {
        if (arg0 == 16) {
            this.method321(true);
            ++field622;
        }
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V", line = 182)
    public static void method318(int arg0) {
        field617 = null;
        if (arg0 != -1) {
            field628 = null;
        }
        field629 = null;
        field628 = null;
        field630 = null;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(II)Lfa;", line = 198)
    public static final class398 method319(int arg0, int arg1) {
        if (arg0 != 13563) {
            return null;
        } else {
            ++field620;
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (arg1 != 2) {
                        if (arg1 != 3) {
                            if (~arg1 != -5) {
                                if (~arg1 != -6) {
                                    if (arg1 != 6) {
                                        if (~arg1 != -8) {
                                            if (~arg1 != -9) {
                                                if (~arg1 != -10) {
                                                    if (~arg1 != -11) {
                                                        if (arg1 != 11) {
                                                            if (~arg1 != -13) {
                                                                if (arg1 != 13) {
                                                                    if (~arg1 != -15) {
                                                                        if (~arg1 != -16) {
                                                                            if (~arg1 != -17) {
                                                                                if (~arg1 != -18) {
                                                                                    if (arg1 != 18) {
                                                                                        if (~arg1 != -20) {
                                                                                            if (arg1 != 20) {
                                                                                                if (~arg1 != -22) {
                                                                                                    if (arg1 != 22) {
                                                                                                        if (~arg1 != -24) {
                                                                                                            if (arg1 != 24) {
                                                                                                                if (~arg1 != -26) {
                                                                                                                    if (~arg1 != -27) {
                                                                                                                        if (arg1 != 27) {
                                                                                                                            if (arg1 != 28) {
                                                                                                                                if (arg1 != 29) {
                                                                                                                                    if (~arg1 != -31) {
                                                                                                                                        if (~arg1 != -32) {
                                                                                                                                            if (~arg1 != -33) {
                                                                                                                                                if (arg1 != 33) {
                                                                                                                                                    if (arg1 != 34) {
                                                                                                                                                        if (arg1 != 35) {
                                                                                                                                                            if (~arg1 != -37) {
                                                                                                                                                                if (arg1 != 37) {
                                                                                                                                                                    if (arg1 != 38) {
                                                                                                                                                                        return arg1 == 39 ? new class384() : null;
                                                                                                                                                                    } else {
                                                                                                                                                                        return new class118();
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    return new class167();
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return new class218();
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return new class428();
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return new class385();
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return new class161();
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return new class44();
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return new class232();
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return new class146();
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return new class181();
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return new class124();
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return new class149();
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return new class323();
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return new class148();
                                                                                                                }
                                                                                                            } else {
                                                                                                                return new class15();
                                                                                                            }
                                                                                                        } else {
                                                                                                            return new class257();
                                                                                                        }
                                                                                                    } else {
                                                                                                        return new class329();
                                                                                                    }
                                                                                                } else {
                                                                                                    return new class94();
                                                                                                }
                                                                                            } else {
                                                                                                return new class103();
                                                                                            }
                                                                                        } else {
                                                                                            return new class331();
                                                                                        }
                                                                                    } else {
                                                                                        return new class16();
                                                                                    }
                                                                                } else {
                                                                                    return new class244();
                                                                                }
                                                                            } else {
                                                                                return new class364();
                                                                            }
                                                                        } else {
                                                                            return new class165();
                                                                        }
                                                                    } else {
                                                                        return new class138();
                                                                    }
                                                                } else {
                                                                    return new class234();
                                                                }
                                                            } else {
                                                                return new class184();
                                                            }
                                                        } else {
                                                            return new class355();
                                                        }
                                                    } else {
                                                        return new class31();
                                                    }
                                                } else {
                                                    return new class404();
                                                }
                                            } else {
                                                return new class69();
                                            }
                                        } else {
                                            return new class117();
                                        }
                                    } else {
                                        return new class198();
                                    }
                                } else {
                                    return new class447();
                                }
                            } else {
                                return new class250();
                            }
                        } else {
                            return new class419();
                        }
                    } else {
                        return new class88();
                    }
                } else {
                    return new class125();
                }
            } else {
                return new class229();
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V", line = 521)
    public class44() {
        super(1, true);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILnd;)V", line = 524)
    public static final void method320(int arg0, class413 arg1) {
        if (arg0 != 18128) {
            method320(-6, (class413) null);
        }
        ++field619;
        arg1.field6077 = null;
        if (class393.field5628 < 20) {
            class435.field6390.method1003(2166, arg1);
            ++class393.field5628;
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(Z)V", line = 554)
    private final void method321(boolean arg0) {
        ++field633;
        double var2 = Math.cos((double) ((float) this.field618 / 4096.0F));
        this.field627[0] = (int) (4096.0D * Math.sin((double) ((float) this.field631 / 4096.0F)) * var2);
        this.field627[1] = (int) (var2 * Math.cos((double) ((float) this.field631 / 4096.0F)) * 4096.0D);
        this.field627[2] = (int) (4096.0D * Math.sin((double) ((float) this.field618 / 4096.0F)));
        int var4 = this.field627[0] * this.field627[0] >> 12;
        int var5 = this.field627[1] * this.field627[1] >> 12;
        int var6 = this.field627[2] * this.field627[2] >> 12;
        if (!arg0) {
            this.field627 = null;
        }
        int var7 = (int) (Math.sqrt((double) (var4 + var6 - -var5 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field627[2] = (this.field627[2] << 12) / var7;
            this.field627[1] = (this.field627[1] << 12) / var7;
            this.field627[0] = (this.field627[0] << 12) / var7;
        }
    }
}
