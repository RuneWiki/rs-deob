import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class287 extends class128 {

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public int field4597;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public int field4599;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field4600 = 0;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field4606 = 0;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "[I")
    public static int[] field4604 = new int[32];

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field4603 = -1;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "Lem;")
    public static class292 field4602;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static void method1910(byte arg0) {
        field4604 = null;
        field4602 = null;
        if (arg0 != 34) {
            method1914(true);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILaa;)V")
    public static final void method1911(int arg0, class43 arg1) {
        if (arg0 != 21225) {
            method1910((byte) 49);
        }
        field4598++;
        class182 var2 = arg1.method292(33);
        arg1.field682 = var2.field3006;
        if (arg1.field674 == 0) {
            arg1.field697 = 0;
            return;
        }
        if (arg1.field699 != -1 && arg1.field717 == 0) {
            class307 var3 = class22.method121(arg1.field699, true);
            if (arg1.field636 > 0 && var3.field4902 == 0) {
                arg1.field697++;
                return;
            }
            if (arg1.field636 <= 0 && var3.field4909 == 0) {
                arg1.field697++;
                return;
            }
        }
        if (arg1.field669 != -1 && class29.field360 >= arg1.field623) {
            class55 var4 = class137.method958(arg1.field669, (byte) 56);
            if (var4.field919 && var4.field908 != -1) {
                class307 var5 = class22.method121(var4.field908, true);
                if (arg1.field636 > 0 && var5.field4902 == 0) {
                    arg1.field697++;
                    return;
                }
                if (arg1.field636 <= 0 && var5.field4909 == 0) {
                    arg1.field697++;
                    return;
                }
            }
        }
        int var6 = arg1.field637;
        int var7 = arg1.field710;
        int var8 = arg1.field709[arg1.field674 - 1] * 128 + arg1.method279(23397) * 64;
        int var9 = arg1.field704[arg1.field674 - 1] * 128 + (arg1.method279(23397) * 64);
        if ((var8 - var6) > 256 || (var8 - var6) < -256 || (var9 - var7) > 256 || (var9 - var7) < -256) {
            arg1.field637 = var8;
            arg1.field710 = var9;
            return;
        }
        if (var8 <= var6) {
            if (var6 > var8) {
                if (var9 > var7) {
                    arg1.field702 = 768;
                } else if (var9 >= var7) {
                    arg1.field702 = 512;
                } else {
                    arg1.field702 = 256;
                }
            } else if (var7 < var9) {
                arg1.field702 = 1024;
            } else if (var9 < var7) {
                arg1.field702 = 0;
            }
        } else if (var9 > var7) {
            arg1.field702 = 1280;
        } else if (var7 > var9) {
            arg1.field702 = 1792;
        } else {
            arg1.field702 = 1536;
        }
        int var10 = arg1.field702 - arg1.field652 & 0x7FF;
        int var11 = var2.field2978;
        int var12 = 4;
        if (var10 > 1024) {
            var10 -= 2048;
        }
        if (var10 >= -256 && var10 <= 256) {
            var11 = var2.field2976;
        } else if (var10 >= 256 && var10 < 768) {
            var11 = var2.field2977;
        } else if (var10 >= -768 && var10 <= -256) {
            var11 = var2.field2971;
        }
        boolean var13 = true;
        if (var11 == -1) {
            var11 = var2.field2976;
        }
        arg1.field682 = var11;
        if (arg1 instanceof class131) {
            var13 = ((class131) arg1).field2056.field4052;
        }
        if (var13) {
            if (arg1.field702 != arg1.field652 && arg1.field690 == -1 && arg1.field664 != 0) {
                var12 = 2;
            }
            if (arg1.field674 > 2) {
                var12 = 6;
            }
            if (arg1.field674 > 3) {
                var12 = 8;
            }
            if (arg1.field697 > 0 && arg1.field674 > 1) {
                arg1.field697--;
                var12 = 8;
            }
        } else {
            if (arg1.field674 > 1) {
                var12 = 6;
            }
            if (arg1.field674 > 2) {
                var12 = 8;
            }
            if (arg1.field697 > 0 && arg1.field674 > 1) {
                arg1.field697--;
                var12 = 8;
            }
        }
        byte var14 = 1;
        if (arg1.field654[arg1.field674 - 1] == 2) {
            var12 <<= 0x1;
            var14 = 2;
        } else if (arg1.field654[arg1.field674 - 1] == 0) {
            var12 >>= 0x1;
            var14 = 0;
        }
        if (var12 < 8 || var2.field2985 == -1) {
            if (var2.field2987 != -1 && var14 == 0) {
                if (arg1.field682 == var2.field2978 && var2.field2981 != -1) {
                    arg1.field682 = var2.field2981;
                } else if (arg1.field682 == var2.field2971 && var2.field2996 != -1) {
                    arg1.field682 = var2.field2996;
                } else if (arg1.field682 == var2.field2977 && var2.field2994 != -1) {
                    arg1.field682 = var2.field2994;
                } else {
                    arg1.field682 = var2.field2987;
                }
            }
        } else if (arg1.field682 == var2.field2978 && var2.field2988 != -1) {
            arg1.field682 = var2.field2988;
        } else if (arg1.field682 == var2.field2971 && var2.field2998 != -1) {
            arg1.field682 = var2.field2998;
        } else if (arg1.field682 == var2.field2977 && var2.field2986 != -1) {
            arg1.field682 = var2.field2986;
        } else {
            arg1.field682 = var2.field2985;
        }
        if (var2.field2989 != -1) {
            int var15 = var12 << 7;
            if (arg1.field674 == 1) {
                int var16 = arg1.field681 * arg1.field681;
                int var17 = (var8 >= arg1.field637 ? var8 - arg1.field637 : -var8 + arg1.field637) << 7;
                int var18 = (arg1.field710 <= var9 ? var9 - arg1.field710 : -var9 + arg1.field710) << 7;
                int var19 = var17 <= var18 ? var18 : var17;
                int var20 = var19 * 2 * var2.field2989;
                if (var16 > var20) {
                    arg1.field681 /= 2;
                } else if (var19 < var16 / 2) {
                    arg1.field681 -= var2.field2989;
                    if (arg1.field681 < 0) {
                        arg1.field681 = 0;
                    }
                } else if (var15 > arg1.field681) {
                    arg1.field681 += var2.field2989;
                    if (var15 < arg1.field681) {
                        arg1.field681 = var15;
                    }
                }
            } else if (arg1.field681 < var15) {
                arg1.field681 += var2.field2989;
                if (arg1.field681 > var15) {
                    arg1.field681 = var15;
                }
            } else if (arg1.field681 > 0) {
                arg1.field681 -= var2.field2989;
                if (arg1.field681 < 0) {
                    arg1.field681 = 0;
                }
            }
            var12 = arg1.field681 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var7 < var9) {
            arg1.field710 += var12;
            if (var9 < arg1.field710) {
                arg1.field710 = var9;
            }
        } else if (var7 > var9) {
            arg1.field710 -= var12;
            if (arg1.field710 < var9) {
                arg1.field710 = var9;
            }
        }
        if (var6 < var8) {
            arg1.field637 += var12;
            if (var8 < arg1.field637) {
                arg1.field637 = var8;
            }
        } else if (var8 < var6) {
            arg1.field637 -= var12;
            if (var8 > arg1.field637) {
                arg1.field637 = var8;
            }
        }
        if (arg1.field637 != var8 || arg1.field710 != var9) {
            return;
        }
        if (arg1.field636 > 0) {
            arg1.field636--;
        }
        arg1.field674--;
        return;
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)Lod;")
    public static final class276 method1912(int arg0) {
        field4601++;
        if (arg0 != -768) {
            return null;
        }
        try {
            return new class27();
        } catch (Throwable var2) {
            try {
                return (class276) Class.forName("g").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class35();
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(II)V")
    public class287(int arg0, int arg1) {
        this.field4597 = arg0;
        this.field4599 = arg1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)Z")
    public static final boolean method1913(int arg0, int arg1, int arg2) {
        int var3 = class123.field1964[arg0][arg1][arg2];
        if (-class173.field2830 == var3) {
            return false;
        } else if (class173.field2830 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class161.method1106(var4 + 1, class267.field4304[arg0][arg1][arg2], var5 + 1) && class161.method1106(var4 + 128 - 1, class267.field4304[arg0][arg1 + 1][arg2], var5 + 1) && class161.method1106(var4 + 128 - 1, class267.field4304[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class161.method1106(var4 + 1, class267.field4304[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class123.field1964[arg0][arg1][arg2] = class173.field2830;
                return true;
            } else {
                class123.field1964[arg0][arg1][arg2] = -class173.field2830;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)V")
    public static final void method1914(boolean arg0) {
        if (!arg0) {
            return;
        }
        field4607++;
        int var1 = class128.method910(-118);
        if (var1 == 0) {
            class151.field2369 = null;
            class187.method1336((byte) -116, 0);
        } else if (var1 == 1) {
            class178.method1306((byte) 116, (byte) 0);
            class187.method1336((byte) -116, 512);
            if (class301.field4818 != null) {
                class146.method1027((byte) 68);
            }
        } else {
            class178.method1306((byte) 75, (byte) (class286.field4575 - 4 & 0xFF));
            class187.method1336((byte) -116, 2);
        }
        class129.field2026 = class56.field941;
    }
}
