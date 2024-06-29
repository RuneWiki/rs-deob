import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class156 extends class134 {

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public static int field2325 = 0;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "[I")
    public static int[] field2322 = new int[4096];

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2331 = "Started 3d Library";

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "Lnf;")
    public static class162 field2326 = new class162(50);

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "[C")
    public static char[] field2332 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "Lag;")
    public static class192 field2333 = new class192(64);

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "[I")
    public static int[] field2334 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "[Z")
    public static boolean[] field2336 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2337 = "K";

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "B")
    public byte field2327;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "Ljava/lang/String;")
    public String field2321;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "Ljava/lang/String;")
    public String field2329;

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "[Lpj;")
    public static class265[] field2335;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "[[[I")
    public static int[][][] field2323;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "[[[I")
    public static int[][][] field2328;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)I")
    public static final int method1126(int arg0, byte arg1) {
        field2320++;
        int var2 = 44 / ((arg1 + 12) / 55);
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IB)V")
    public static final void method1127(int arg0, byte arg1) {
        field2319++;
        class150.field2219.method1166((byte) 23, arg0);
        if (arg1 != -55) {
            field2322 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lkc;I)V")
    public static final void method1128(class296 arg0, int arg1) {
        field2330++;
        if (arg0.field4667 == 0) {
            return;
        }
        class241 var2 = arg0.method1982((byte) -56);
        if (arg0.field4702 != -1 && arg0.field4702 < 32768) {
            class161 var3 = class116.field1781[arg0.field4702];
            if (var3 != null) {
                int var4 = arg0.field4725 - var3.field4725;
                int var5 = arg0.field4709 - var3.field4709;
                if (var4 != 0 || var5 != 0) {
                    arg0.field4696 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        int var6 = -104 / ((32 - arg1) / 33);
        if (arg0.field4702 >= 32768) {
            int var7 = arg0.field4702 - 32768;
            if (class107.field1677 == var7) {
                var7 = 2047;
            }
            class136 var8 = class233.field3682[var7];
            if (var8 != null) {
                int var9 = arg0.field4725 - var8.field4725;
                int var10 = arg0.field4709 - var8.field4709;
                if (var9 != 0 || var10 != 0) {
                    arg0.field4696 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field4677 != 0 || arg0.field4739 != 0) && (arg0.field4743 == 0 || arg0.field4745 > 0)) {
            int var11 = arg0.field4725 - (arg0.field4677 - (class138.field2072 + class138.field2072)) * 64;
            int var12 = arg0.field4709 - (arg0.field4739 - class159.field2379 - class159.field2379) * 64;
            if (var11 != 0 || var12 != 0) {
                arg0.field4696 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            }
            arg0.field4677 = 0;
            arg0.field4739 = 0;
        }
        int var13 = arg0.field4696 - arg0.field4719 & 0x7FF;
        if (var13 == 0) {
            arg0.field4728 = 0;
            arg0.field4722 = 0;
        } else if (var2.field3852 == 0) {
            arg0.field4728++;
            if (var13 > 1024) {
                arg0.field4719 -= arg0.field4667;
                boolean var14 = true;
                if (arg0.field4667 > var13 || (2048 - arg0.field4667) < var13) {
                    var14 = false;
                    arg0.field4719 = arg0.field4696;
                }
                if (arg0.field4728 > 25 || var14) {
                    arg0.field4736 = var2.field3851;
                    if (arg0.field4743 <= 0) {
                        if (var2.field3845 != -1) {
                            arg0.field4736 = var2.field3845;
                        }
                    } else if (arg0.field4670[arg0.field4743 - 1] == 2) {
                        if (var2.field3859 != -1) {
                            arg0.field4736 = var2.field3859;
                        } else if (var2.field3844 != -1) {
                            arg0.field4736 = var2.field3844;
                        }
                    } else if (arg0.field4670[arg0.field4743 - 1] == 0) {
                        if (var2.field3838 != -1) {
                            arg0.field4736 = var2.field3838;
                        } else if (var2.field3835 != -1) {
                            arg0.field4736 = var2.field3835;
                        }
                    } else if (var2.field3856 != -1) {
                        arg0.field4736 = var2.field3856;
                    }
                }
            } else {
                boolean var15 = true;
                arg0.field4719 += arg0.field4667;
                if (var13 < arg0.field4667 || 2048 - arg0.field4667 < var13) {
                    arg0.field4719 = arg0.field4696;
                    var15 = false;
                }
                if (arg0.field4728 > 25 || var15) {
                    arg0.field4736 = var2.field3851;
                    if (arg0.field4743 > 0) {
                        if (arg0.field4670[arg0.field4743 - 1] == 2) {
                            if (var2.field3832 != -1) {
                                arg0.field4736 = var2.field3832;
                            } else if (var2.field3844 != -1) {
                                arg0.field4736 = var2.field3844;
                            }
                        } else if (arg0.field4670[arg0.field4743 - 1] == 0) {
                            if (var2.field3836 != -1) {
                                arg0.field4736 = var2.field3836;
                            } else if (var2.field3835 != -1) {
                                arg0.field4736 = var2.field3835;
                            }
                        } else if (var2.field3854 != -1) {
                            arg0.field4736 = var2.field3854;
                        }
                    } else if (var2.field3868 != -1) {
                        arg0.field4736 = var2.field3868;
                    }
                }
            }
            arg0.field4719 &= 0x7FF;
        } else {
            arg0.field4736 = -1;
            int var16 = arg0.field4696 << 5;
            if (arg0.field4694 != var16) {
                arg0.field4759 = 0;
                arg0.field4694 = var16;
                int var17 = var16 - arg0.field4708 & 0xFFFF;
                int var18 = arg0.field4722 * arg0.field4722 / (var2.field3852 * 2);
                if (arg0.field4722 > 0 && var17 >= var18 && (var17 - var18) < 32768) {
                    arg0.field4684 = var17 / 2;
                    int var19 = var2.field3850 * var2.field3850 / (var2.field3852 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    arg0.field4768 = true;
                    if (var19 < arg0.field4684) {
                        arg0.field4684 = var17 - var19;
                    }
                } else if (arg0.field4722 < 0 && (65536 - var17) >= var18 && 65536 - var18 - var17 < 32768) {
                    arg0.field4768 = true;
                    arg0.field4684 = (65536 - var17) / 2;
                    int var20 = var2.field3850 * var2.field3850 / (var2.field3852 * 2);
                    if (var20 > 32767) {
                        var20 = 32767;
                    }
                    if (arg0.field4684 > var20) {
                        arg0.field4684 = 65536 - var17 - var20;
                    }
                } else {
                    arg0.field4768 = false;
                }
            }
            if (arg0.field4722 == 0) {
                int var21 = arg0.field4694 - arg0.field4708 & 0xFFFF;
                if (var2.field3852 <= var21) {
                    arg0.field4759 = 0;
                    arg0.field4768 = true;
                    int var22 = var2.field3850 * var2.field3850 / (var2.field3852 * 2);
                    if (var22 > 32767) {
                        var22 = 32767;
                    }
                    if (var21 < 32768) {
                        arg0.field4722 = var2.field3852;
                        arg0.field4684 = var21 / 2;
                        if (var22 < arg0.field4684) {
                            arg0.field4684 = var21 - var22;
                        }
                    } else {
                        arg0.field4722 = -var2.field3852;
                        arg0.field4684 = (65536 - var21) / 2;
                        if (var22 < arg0.field4684) {
                            arg0.field4684 = 65536 - var22 - var21;
                        }
                    }
                } else {
                    arg0.field4708 = arg0.field4694;
                }
            } else if (arg0.field4722 > 0) {
                if (arg0.field4684 <= arg0.field4759) {
                    arg0.field4768 = false;
                }
                if (!arg0.field4768) {
                    arg0.field4722 -= var2.field3852;
                    if (arg0.field4722 < 0) {
                        arg0.field4722 = 0;
                    }
                } else if (arg0.field4722 < var2.field3850) {
                    arg0.field4722 += var2.field3852;
                }
            } else {
                if (arg0.field4759 >= arg0.field4684) {
                    arg0.field4768 = false;
                }
                if (!arg0.field4768) {
                    arg0.field4722 += var2.field3852;
                    if (arg0.field4722 > 0) {
                        arg0.field4722 = 0;
                    }
                } else if ((-var2.field3850) < arg0.field4722) {
                    arg0.field4722 -= var2.field3852;
                }
            }
            arg0.field4708 += arg0.field4722;
            if (arg0.field4722 > 0) {
                arg0.field4759 += arg0.field4722;
            } else {
                arg0.field4759 -= arg0.field4722;
            }
            arg0.field4708 &= 0xFFFF;
            arg0.field4719 = arg0.field4708 >> 5;
            if (arg0.field4722 >= 0) {
                if (arg0.field4743 > 0) {
                    if (arg0.field4670[arg0.field4743 - 1] == 2) {
                        if (var2.field3832 != -1) {
                            arg0.field4736 = var2.field3832;
                        } else if (var2.field3844 != -1) {
                            arg0.field4736 = var2.field3844;
                        }
                    } else if (arg0.field4670[arg0.field4743 - 1] == 0) {
                        if (var2.field3836 != -1) {
                            arg0.field4736 = var2.field3836;
                        } else if (var2.field3835 != -1) {
                            arg0.field4736 = var2.field3835;
                        }
                    }
                }
                if (arg0.field4736 == -1) {
                    if (var2.field3854 != -1) {
                        arg0.field4736 = var2.field3854;
                    } else if (var2.field3868 != -1) {
                        arg0.field4736 = var2.field3868;
                    }
                }
            } else {
                if (arg0.field4743 > 0) {
                    if (arg0.field4670[arg0.field4743 - 1] == 2) {
                        if (var2.field3859 != -1) {
                            arg0.field4736 = var2.field3859;
                        } else if (var2.field3844 != -1) {
                            arg0.field4736 = var2.field3844;
                        }
                    } else if (arg0.field4670[arg0.field4743 - 1] == 0) {
                        if (var2.field3838 != -1) {
                            arg0.field4736 = var2.field3838;
                        } else if (var2.field3835 != -1) {
                            arg0.field4736 = var2.field3835;
                        }
                    }
                }
                if (arg0.field4736 == -1) {
                    if (var2.field3856 != -1) {
                        arg0.field4736 = var2.field3856;
                    } else if (var2.field3845 != -1) {
                        arg0.field4736 = var2.field3845;
                    }
                }
            }
            if (arg0.field4736 == -1) {
                arg0.field4736 = var2.field3851;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)Loj;")
    public static final class163 method1129(int arg0, int arg1, int arg2) {
        class22 var3 = class149.field2210[arg0][arg1][arg2];
        return var3 == null ? null : var3.field375;
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(B)V")
    public static void method1130(byte arg0) {
        field2334 = null;
        field2326 = null;
        field2332 = null;
        int var1 = -75 / ((arg0 + 1) / 46);
        field2337 = null;
        field2322 = null;
        field2331 = null;
        field2335 = null;
        field2333 = null;
        field2323 = null;
        field2336 = null;
        field2328 = null;
    }
}
