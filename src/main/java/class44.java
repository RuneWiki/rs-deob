import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class44 extends class134 {

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "[Lak;")
    public static class146[] field612 = new class146[14];

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "Lfa;")
    public static class273 field604;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "Lh;")
    public static class294 field608;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
    public static final void method281(int arg0) {
        Container var1;
        if (class180.field2797 != null) {
            var1 = class180.field2797;
        } else if (class224.field3565 == null) {
            var1 = class259.field4254.field4211;
        } else {
            var1 = class224.field3565;
        }
        if (arg0 != -19545) {
            method281(-59);
        }
        field609++;
        class143.field2233 = var1.getSize().width;
        class131.field2013 = var1.getSize().height;
        if (class224.field3565 == var1) {
            Insets var2 = class224.field3565.getInsets();
            class131.field2013 -= var2.top + var2.bottom;
            class143.field2233 -= var2.right + var2.left;
        }
        if (class115.method725((byte) 116) >= 2) {
            class169.field2644 = class143.field2233;
            class35.field438 = 0;
            class187.field2896 = 0;
            class79.field1254 = class131.field2013;
        } else {
            class35.field438 = 0;
            class79.field1254 = 503;
            class169.field2644 = 765;
            class187.field2896 = (class143.field2233 - 765) / 2;
        }
        class113.field1701.setSize(class169.field2644, class79.field1254);
        if (class224.field3565 == var1) {
            Insets var3 = class224.field3565.getInsets();
            class113.field1701.setLocation(class187.field2896 + var3.left, class35.field438 + var3.top);
        } else {
            class113.field1701.setLocation(class187.field2896, class35.field438);
        }
        if (class160.field2523 != -1) {
            class219.method1533(true, -115);
        }
        class203.method1461(103);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(Z)V")
    public static void method282(boolean arg0) {
        field612 = null;
        if (arg0) {
            field608 = null;
            field604 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lpd;I)V")
    public static final void method283(class58 arg0, int arg1) {
        field605++;
        if (arg0.field841 == 0) {
            return;
        }
        class261 var2 = arg0.method361(arg1);
        if (arg0.field814 != -1 && arg0.field814 < 32768) {
            class35 var3 = class76.field1188[arg0.field814];
            if (var3 != null) {
                int var4 = arg0.field836 - var3.field836;
                int var5 = arg0.field850 - var3.field850;
                if (var4 != 0 || var5 != 0) {
                    arg0.field802 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field814 >= 32768) {
            int var6 = arg0.field814 - 32768;
            if (class31.field396 == var6) {
                var6 = 2047;
            }
            class208 var7 = class300.field4925[var6];
            if (var7 != null) {
                int var8 = arg0.field836 - var7.field836;
                int var9 = arg0.field850 - var7.field850;
                if (var8 != 0 || var9 != 0) {
                    arg0.field802 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field892 != 0 || arg0.field803 != 0) && (arg0.field862 == 0 || arg0.field878 > 0)) {
            int var10 = arg0.field836 - (arg0.field892 - (class101.field1517 + class101.field1517)) * 64;
            int var11 = arg0.field850 - ((arg0.field803 - class254.field4063 - class254.field4063) * 64);
            if (var10 != 0 || var11 != 0) {
                arg0.field802 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg0.field892 = 0;
            arg0.field803 = 0;
        }
        int var12 = arg0.field802 - arg0.field855 & 0x7FF;
        if (var12 == 0) {
            arg0.field844 = 0;
            arg0.field821 = 0;
        } else if (var2.field4300 == 0) {
            arg0.field821++;
            if (var12 > 1024) {
                arg0.field855 -= arg0.field841;
                boolean var13 = true;
                if (var12 < arg0.field841 || var12 > 2048 - arg0.field841) {
                    var13 = false;
                    arg0.field855 = arg0.field802;
                }
                if (arg0.field821 > 25 || var13) {
                    arg0.field857 = var2.field4276;
                    if (arg0.field862 > 0) {
                        if (arg0.field834[arg0.field862 - 1] == 2) {
                            if (var2.field4270 != -1) {
                                arg0.field857 = var2.field4270;
                            } else if (var2.field4299 != -1) {
                                arg0.field857 = var2.field4299;
                            }
                        } else if (arg0.field834[arg0.field862 - 1] == 0) {
                            if (var2.field4273 != -1) {
                                arg0.field857 = var2.field4273;
                            } else if (var2.field4308 != -1) {
                                arg0.field857 = var2.field4308;
                            }
                        } else if (var2.field4303 != -1) {
                            arg0.field857 = var2.field4303;
                        }
                    } else if (var2.field4274 != -1) {
                        arg0.field857 = var2.field4274;
                    }
                }
            } else {
                boolean var14 = true;
                arg0.field855 += arg0.field841;
                if (var12 < arg0.field841 || var12 > (2048 - arg0.field841)) {
                    arg0.field855 = arg0.field802;
                    var14 = false;
                }
                if (arg0.field821 > 25 || var14) {
                    arg0.field857 = var2.field4276;
                    if (arg0.field862 <= 0) {
                        if (var2.field4269 != -1) {
                            arg0.field857 = var2.field4269;
                        }
                    } else if (arg0.field834[arg0.field862 - 1] == 2) {
                        if (var2.field4271 != -1) {
                            arg0.field857 = var2.field4271;
                        } else if (var2.field4299 != -1) {
                            arg0.field857 = var2.field4299;
                        }
                    } else if (arg0.field834[arg0.field862 - 1] == 0) {
                        if (var2.field4285 != -1) {
                            arg0.field857 = var2.field4285;
                        } else if (var2.field4308 != -1) {
                            arg0.field857 = var2.field4308;
                        }
                    } else if (var2.field4296 != -1) {
                        arg0.field857 = var2.field4296;
                    }
                }
            }
            arg0.field855 &= 0x7FF;
        } else {
            arg0.field857 = -1;
            int var15 = arg0.field802 << 5;
            if (arg0.field805 != var15) {
                arg0.field884 = 0;
                arg0.field805 = var15;
                int var16 = var15 - arg0.field842 & 0xFFFF;
                int var17 = arg0.field844 * arg0.field844 / (var2.field4300 * 2);
                if (arg0.field844 > 0 && var17 <= var16 && (var16 - var17) < 32768) {
                    arg0.field871 = true;
                    int var18 = var2.field4287 * var2.field4287 / (var2.field4300 * 2);
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    arg0.field835 = var16 / 2;
                    if (arg0.field835 > var18) {
                        arg0.field835 = var16 - var18;
                    }
                } else if (arg0.field844 < 0 && (65536 - var16) >= var17 && 65536 - (var16 + var17) < 32768) {
                    arg0.field835 = (65536 - var16) / 2;
                    arg0.field871 = true;
                    int var19 = var2.field4287 * var2.field4287 / (var2.field4300 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var19 < arg0.field835) {
                        arg0.field835 = 65536 - var19 - var16;
                    }
                } else {
                    arg0.field871 = false;
                }
            }
            if (arg0.field844 == 0) {
                int var20 = arg0.field805 - arg0.field842 & 0xFFFF;
                if (var2.field4300 > var20) {
                    arg0.field842 = arg0.field805;
                } else {
                    arg0.field884 = 0;
                    arg0.field871 = true;
                    int var21 = var2.field4287 * var2.field4287 / (var2.field4300 * 2);
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    if (var20 >= 32768) {
                        arg0.field835 = (65536 - var20) / 2;
                        arg0.field844 = -var2.field4300;
                        if (arg0.field835 > var21) {
                            arg0.field835 = 65536 - var20 - var21;
                        }
                    } else {
                        arg0.field835 = var20 / 2;
                        if (arg0.field835 > var21) {
                            arg0.field835 = var20 - var21;
                        }
                        arg0.field844 = var2.field4300;
                    }
                }
            } else if (arg0.field844 > 0) {
                if (arg0.field884 >= arg0.field835) {
                    arg0.field871 = false;
                }
                if (!arg0.field871) {
                    arg0.field844 -= var2.field4300;
                    if (arg0.field844 < 0) {
                        arg0.field844 = 0;
                    }
                } else if (var2.field4287 > arg0.field844) {
                    arg0.field844 += var2.field4300;
                }
            } else {
                if (arg0.field835 <= arg0.field884) {
                    arg0.field871 = false;
                }
                if (!arg0.field871) {
                    arg0.field844 += var2.field4300;
                    if (arg0.field844 > 0) {
                        arg0.field844 = 0;
                    }
                } else if (arg0.field844 > -var2.field4287) {
                    arg0.field844 -= var2.field4300;
                }
            }
            if (arg0.field844 > 0) {
                arg0.field884 += arg0.field844;
            } else {
                arg0.field884 -= arg0.field844;
            }
            arg0.field842 += arg0.field844;
            arg0.field842 &= 0xFFFF;
            arg0.field855 = arg0.field842 >> 5;
            if (arg0.field844 >= 0) {
                if (arg0.field862 > 0) {
                    if (arg0.field834[arg0.field862 - 1] == 2) {
                        if (var2.field4271 != -1) {
                            arg0.field857 = var2.field4271;
                        } else if (var2.field4299 != -1) {
                            arg0.field857 = var2.field4299;
                        }
                    } else if (arg0.field834[arg0.field862 - 1] == 0) {
                        if (var2.field4285 != -1) {
                            arg0.field857 = var2.field4285;
                        } else if (var2.field4308 != -1) {
                            arg0.field857 = var2.field4308;
                        }
                    }
                }
                if (arg0.field857 == -1) {
                    if (var2.field4296 != -1) {
                        arg0.field857 = var2.field4296;
                    } else if (var2.field4269 != -1) {
                        arg0.field857 = var2.field4269;
                    }
                }
            } else {
                if (arg0.field862 > 0) {
                    if (arg0.field834[arg0.field862 - 1] == 2) {
                        if (var2.field4270 != -1) {
                            arg0.field857 = var2.field4270;
                        } else if (var2.field4299 != -1) {
                            arg0.field857 = var2.field4299;
                        }
                    } else if (arg0.field834[arg0.field862 - 1] == 0) {
                        if (var2.field4273 != -1) {
                            arg0.field857 = var2.field4273;
                        } else if (var2.field4308 != -1) {
                            arg0.field857 = var2.field4308;
                        }
                    }
                }
                if (arg0.field857 == -1) {
                    if (var2.field4303 != -1) {
                        arg0.field857 = var2.field4303;
                    } else if (var2.field4274 != -1) {
                        arg0.field857 = var2.field4274;
                    }
                }
            }
            if (arg0.field857 == -1) {
                arg0.field857 = var2.field4276;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIILkk;II)V")
    public static final void method284(int arg0, int arg1, int arg2, int arg3, class254 arg4, int arg5, int arg6) {
        int var7 = 79 % ((22 - arg3) / 51);
        field603++;
        class195 var8 = class192.method1334(false, arg6);
        if (var8 == null || !var8.field3110 || !var8.method1354(true)) {
            return;
        }
        if (var8.field3107 != null) {
            int[] var9 = new int[var8.field3107.length];
            for (int var10 = 0; var10 < (var9.length / 2); var10++) {
                int var12;
                if (class92.field1402 == 4) {
                    var12 = (int) class202.field3253 & 0x7FF;
                } else {
                    var12 = (int) class202.field3253 + class262.field4330 & 0x7FF;
                }
                int var13 = class172.field2669[var12];
                int var14 = class172.field2658[var12];
                if (class92.field1402 != 4) {
                    var14 = var14 * 256 / (class265.field4365 + 256);
                    var13 = var13 * 256 / (class265.field4365 + 256);
                }
                var9[var10 * 2] = arg4.field4085 / 2 + arg5 + ((arg2 - -(var8.field3107[var10 * 2] * 4)) * var14 + (var8.field3107[var10 * 2 + 1] * 4 + arg0) * var13 >> 16);
                var9[var10 * 2 + 1] = arg1 - (((var8.field3107[var10 * 2 + 1] * 4 + arg0) * var14 - ((var8.field3107[var10 * 2] * 4 + arg2) * var13) >> 16) - (arg4.field4152 / 2));
            }
            class240.method1665(var9, var8.field3106, var8.field3106 >>> 24, arg4.field4193, arg4.field4092);
            for (int var11 = 0; var11 < var9.length / 2 - 1; var11++) {
                class62.method406(var9[var11 * 2], var9[var11 * 2 + 1], var9[var11 * 2 + 2], var9[var11 * 2 + 2 + 1], var8.field3112, var8.field3112 >>> 24, arg4.field4193, arg4.field4092);
            }
            class62.method406(var9[var9.length - 2], var9[var9.length - 1], var9[0], var9[1], var8.field3112, var8.field3112 >>> 24, arg4.field4193, arg4.field4092);
        }
        class110 var15 = null;
        if (var8.field3104 != -1) {
            var15 = var8.method1357(false, 0, false);
            if (var15 != null) {
                class199.method1375(arg0, arg4, arg1, arg2, var15, arg5, -123);
            }
        }
        if (var8.field3088 == null) {
            return;
        }
        int var16 = 0;
        if (var15 != null) {
            var16 = var15.field1672;
        }
        class116 var17 = class249.field3970;
        if (var8.field3093 == 1) {
            var17 = class48.field667;
        }
        if (var8.field3093 == 2) {
            var17 = class202.field3227;
        }
        class48.method300(var8.field3075, var8.field3088, arg4, true, arg2, arg1, var17, var16, arg0, arg5);
        return;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(II)V")
    public class44(int arg0, int arg1) {
        this.field607 = arg1;
        this.field610 = arg0;
    }
}
