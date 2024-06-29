import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class class221 {

    @OriginalMember(owner = "client!te", name = "c", descriptor = "Z")
    public static boolean field3610 = true;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "S")
    public static short field3612 = 32767;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static final void method1518(int arg0) {
        field3608++;
        int var1 = class6.field59;
        int var2 = class66.field1099 - class294.field4709 - var1;
        int var3 = class238.field3822;
        int var4 = class153.field2387 - class310.field4964 - var3;
        if (var1 <= arg0 && var2 <= 0 && var3 <= 0 && var4 <= 0) {
            return;
        }
        try {
            int var5 = 0;
            Container var6;
            if (class259.field4184 != null) {
                var6 = class259.field4184;
            } else if (class92.field1494 == null) {
                var6 = class268.field4323.field751;
            } else {
                var6 = class92.field1494;
            }
            int var7 = 0;
            if (class92.field1494 == var6) {
                Insets var8 = class92.field1494.getInsets();
                var7 = var8.left;
                var5 = var8.top;
            }
            Graphics var9 = var6.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var7, var5, var1, class153.field2387);
            }
            if (var3 > 0) {
                var9.fillRect(var7, var5, class66.field1099, var3);
            }
            if (var2 > 0) {
                var9.fillRect(class66.field1099 + var7 - var2, var5, var2, class153.field2387);
            }
            if (var4 > 0) {
                var9.fillRect(var7, var5 + class153.field2387 - var4, class66.field1099, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Laa;B)V")
    public static final void method1519(class43 arg0, byte arg1) {
        field3611++;
        if (arg0.field664 == 0) {
            return;
        }
        class182 var2 = arg0.method292(-41);
        if (arg0.field690 != -1 && arg0.field690 < 32768) {
            class131 var3 = class12.field127[arg0.field690];
            if (var3 != null) {
                int var4 = arg0.field637 - var3.field637;
                int var5 = arg0.field710 - var3.field710;
                if (var4 != 0 || var5 != 0) {
                    arg0.field702 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field690 >= 32768) {
            int var6 = arg0.field690 - 32768;
            if (class123.field1961 == var6) {
                var6 = 2047;
            }
            class299 var7 = class270.field4355[var6];
            if (var7 != null) {
                int var8 = arg0.field637 - var7.field637;
                int var9 = arg0.field710 - var7.field710;
                if (var8 != 0 || var9 != 0) {
                    arg0.field702 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field634 != 0 || arg0.field648 != 0) && (arg0.field674 == 0 || arg0.field697 > 0)) {
            int var10 = arg0.field710 - ((arg0.field648 - class108.field1732 - class108.field1732) * 64);
            int var11 = arg0.field637 - (arg0.field634 - class276.field4438 - class276.field4438) * 64;
            if (var11 != 0 || var10 != 0) {
                arg0.field702 = (int) (Math.atan2((double) var11, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field634 = 0;
            arg0.field648 = 0;
        }
        if (arg1 > -84) {
            field3610 = true;
        }
        int var12 = arg0.field702 - arg0.field652 & 0x7FF;
        if (var12 == 0) {
            arg0.field696 = 0;
            arg0.field708 = 0;
        } else if (var2.field2969 == 0) {
            arg0.field708++;
            if (var12 > 1024) {
                arg0.field652 -= arg0.field664;
                boolean var20 = true;
                if (var12 < arg0.field664 || (2048 - arg0.field664) < var12) {
                    var20 = false;
                    arg0.field652 = arg0.field702;
                }
                if (arg0.field708 > 25 || var20) {
                    arg0.field682 = var2.field2976;
                    if (arg0.field674 <= 0) {
                        if (var2.field3004 != -1) {
                            arg0.field682 = var2.field3004;
                        }
                    } else if (arg0.field654[arg0.field674 - 1] == 2) {
                        if (var2.field3007 != -1) {
                            arg0.field682 = var2.field3007;
                        } else if (var2.field2985 != -1) {
                            arg0.field682 = var2.field2985;
                        }
                    } else if (arg0.field654[arg0.field674 - 1] == 0) {
                        if (var2.field2966 != -1) {
                            arg0.field682 = var2.field2966;
                        } else if (var2.field2987 != -1) {
                            arg0.field682 = var2.field2987;
                        }
                    } else if (var2.field2973 != -1) {
                        arg0.field682 = var2.field2973;
                    }
                }
            } else {
                arg0.field652 += arg0.field664;
                boolean var21 = true;
                if (arg0.field664 > var12 || var12 > (2048 - arg0.field664)) {
                    var21 = false;
                    arg0.field652 = arg0.field702;
                }
                if (arg0.field708 > 25 || var21) {
                    arg0.field682 = var2.field2976;
                    if (arg0.field674 <= 0) {
                        if (var2.field2974 != -1) {
                            arg0.field682 = var2.field2974;
                        }
                    } else if (arg0.field654[arg0.field674 - 1] == 2) {
                        if (var2.field2975 != -1) {
                            arg0.field682 = var2.field2975;
                        } else if (var2.field2985 != -1) {
                            arg0.field682 = var2.field2985;
                        }
                    } else if (arg0.field654[arg0.field674 - 1] == 0) {
                        if (var2.field2993 != -1) {
                            arg0.field682 = var2.field2993;
                        } else if (var2.field2987 != -1) {
                            arg0.field682 = var2.field2987;
                        }
                    } else if (var2.field3003 != -1) {
                        arg0.field682 = var2.field3003;
                    }
                }
            }
            arg0.field652 &= 0x7FF;
        } else {
            arg0.field682 = -1;
            int var13 = arg0.field702 << 5;
            if (arg0.field677 != var13) {
                arg0.field677 = var13;
                int var14 = var13 - arg0.field620 & 0xFFFF;
                arg0.field671 = 0;
                int var15 = arg0.field696 * arg0.field696 / (var2.field2969 * 2);
                if (arg0.field696 > 0 && var14 >= var15 && (var14 - var15) < 32768) {
                    arg0.field689 = var14 / 2;
                    int var16 = var2.field3005 * var2.field3005 / (var2.field2969 * 2);
                    arg0.field661 = true;
                    if (var16 > 32767) {
                        var16 = 32767;
                    }
                    if (arg0.field689 > var16) {
                        arg0.field689 = var14 - var16;
                    }
                } else if (arg0.field696 < 0 && var15 <= 65536 - var14 && 65536 - var14 - var15 < 32768) {
                    arg0.field661 = true;
                    int var17 = var2.field3005 * var2.field3005 / (var2.field2969 * 2);
                    arg0.field689 = (65536 - var14) / 2;
                    if (var17 > 32767) {
                        var17 = 32767;
                    }
                    if (var17 < arg0.field689) {
                        arg0.field689 = 65536 - var17 - var14;
                    }
                } else {
                    arg0.field661 = false;
                }
            }
            if (arg0.field696 == 0) {
                int var18 = arg0.field677 - arg0.field620 & 0xFFFF;
                if (var2.field2969 > var18) {
                    arg0.field620 = arg0.field677;
                } else {
                    arg0.field661 = true;
                    arg0.field671 = 0;
                    int var19 = var2.field3005 * var2.field3005 / (var2.field2969 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var18 < 32768) {
                        arg0.field696 = var2.field2969;
                        arg0.field689 = var18 / 2;
                        if (arg0.field689 > var19) {
                            arg0.field689 = var18 - var19;
                        }
                    } else {
                        arg0.field696 = -var2.field2969;
                        arg0.field689 = (65536 - var18) / 2;
                        if (arg0.field689 > var19) {
                            arg0.field689 = 65536 - var18 - var19;
                        }
                    }
                }
            } else if (arg0.field696 <= 0) {
                if (arg0.field671 >= arg0.field689) {
                    arg0.field661 = false;
                }
                if (!arg0.field661) {
                    arg0.field696 += var2.field2969;
                    if (arg0.field696 > 0) {
                        arg0.field696 = 0;
                    }
                } else if (-var2.field3005 < arg0.field696) {
                    arg0.field696 -= var2.field2969;
                }
            } else {
                if (arg0.field671 >= arg0.field689) {
                    arg0.field661 = false;
                }
                if (!arg0.field661) {
                    arg0.field696 -= var2.field2969;
                    if (arg0.field696 < 0) {
                        arg0.field696 = 0;
                    }
                } else if (arg0.field696 < var2.field3005) {
                    arg0.field696 += var2.field2969;
                }
            }
            arg0.field620 += arg0.field696;
            arg0.field620 &= 0xFFFF;
            arg0.field652 = arg0.field620 >> 5;
            if (arg0.field696 > 0) {
                arg0.field671 += arg0.field696;
            } else {
                arg0.field671 -= arg0.field696;
            }
            if (arg0.field696 >= 0) {
                if (arg0.field674 > 0) {
                    if (arg0.field654[arg0.field674 - 1] == 2) {
                        if (var2.field2975 != -1) {
                            arg0.field682 = var2.field2975;
                        } else if (var2.field2985 != -1) {
                            arg0.field682 = var2.field2985;
                        }
                    } else if (arg0.field654[arg0.field674 - 1] == 0) {
                        if (var2.field2993 != -1) {
                            arg0.field682 = var2.field2993;
                        } else if (var2.field2987 != -1) {
                            arg0.field682 = var2.field2987;
                        }
                    }
                }
                if (arg0.field682 == -1) {
                    if (var2.field3003 != -1) {
                        arg0.field682 = var2.field3003;
                    } else if (var2.field2974 != -1) {
                        arg0.field682 = var2.field2974;
                    }
                }
            } else {
                if (arg0.field674 > 0) {
                    if (arg0.field654[arg0.field674 - 1] == 2) {
                        if (var2.field3007 != -1) {
                            arg0.field682 = var2.field3007;
                        } else if (var2.field2985 != -1) {
                            arg0.field682 = var2.field2985;
                        }
                    } else if (arg0.field654[arg0.field674 - 1] == 0) {
                        if (var2.field2966 != -1) {
                            arg0.field682 = var2.field2966;
                        } else if (var2.field2987 != -1) {
                            arg0.field682 = var2.field2987;
                        }
                    }
                }
                if (arg0.field682 == -1) {
                    if (var2.field2973 != -1) {
                        arg0.field682 = var2.field2973;
                    } else if (var2.field3004 != -1) {
                        arg0.field682 = var2.field3004;
                    }
                }
            }
            if (arg0.field682 == -1) {
                arg0.field682 = var2.field2976;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class123.field1964[arg0][var8][var14] == -class173.field2830) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class267.field4304[arg0][arg1][arg3] + arg5;
            if (!class161.method1106(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class161.method1106(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class161.method1106(var9, var11, var13)) {
                return false;
            } else if (class161.method1106(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class287.method1913(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class161.method1106(var6 + 1, class267.field4304[arg0][arg1][arg3] + arg5, var7 + 1) && class161.method1106(var6 + 128 - 1, class267.field4304[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class161.method1106(var6 + 128 - 1, class267.field4304[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class161.method1106(var6 + 1, class267.field4304[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
    public static final void method1521(int arg0) {
        field3609++;
        class47.field796.method1255(-115);
        if (arg0 != -15719) {
            method1518(40);
        }
    }
}
