import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class204 extends class337 {

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public volatile int field2820 = -1;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "Ljava/lang/String;")
    public volatile String field2823;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field2821 = 0;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field2824 = 0;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Lwm;")
    public static class30 field2819;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
    public static void method1384(boolean arg0) {
        if (arg0) {
            method1384(true);
        }
        field2819 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static final void method1385(int arg0) {
        if (arg0 < 17) {
            method1386(25, true, null);
        }
        field2818++;
        if (class331.field4047 != null) {
            class331.field4047.method1027(-83);
        }
        if (class223.field3037 != null) {
            class223.field3037.method1027(56);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZLfda;)V")
    public static final void method1386(int arg0, boolean arg1, class381 arg2) {
        field2825++;
        class68 var3 = arg2.method2169(arg0 - 6144);
        if (arg2.field4764 == 0) {
            arg2.field4759 = 0;
            class463.field6020 = 0;
            class781.field10681 = -1;
            return;
        }
        if (arg2.field4700 != -1 && arg2.field4692 == 0) {
            class11 var4 = class143.field1864.method4265(true, arg2.field4700);
            if (arg2.field4765 > 0 && var4.field106 == 0) {
                arg2.field4759++;
                class463.field6020 = 0;
                class781.field10681 = -1;
                return;
            }
            if (arg2.field4765 <= 0 && var4.field115 == 0) {
                class781.field10681 = -1;
                class463.field6020 = 0;
                arg2.field4759++;
                return;
            }
        }
        int var5 = 0;
        if (arg0 != 6144) {
            method1385(-71);
        }
        while (var5 < arg2.field4747.length) {
            if (arg2.field4747[var5].field5625 != -1 && arg2.field4747[var5].field5620 <= class693.field8900) {
                class353 var20 = class62.field819.method562((byte) 102, arg2.field4747[var5].field5625);
                if (var20.field4314 && var20.field4292 != -1) {
                    class11 var21 = class143.field1864.method4265(true, var20.field4292);
                    if (arg2.field4765 > 0 && var21.field106 == 0) {
                        arg2.field4759++;
                        class463.field6020 = 0;
                        class781.field10681 = -1;
                        return;
                    }
                    if (arg2.field4765 <= 0 && var21.field115 == 0) {
                        class463.field6020 = 0;
                        arg2.field4759++;
                        class781.field10681 = -1;
                        return;
                    }
                }
            }
            var5++;
        }
        int var6 = arg2.field2896;
        int var7 = arg2.field2900;
        int var8 = arg2.field4767[arg2.field4764 - 1] * 512 + (arg2.method190((byte) -83) * 256);
        int var9 = arg2.field4758[arg2.field4764 - 1] * 512 + arg2.method190((byte) 98) * 256;
        if (var6 >= var8) {
            if (var6 > var8) {
                if (var9 > var7) {
                    arg2.method2171(6144, false);
                } else if (var7 <= var9) {
                    arg2.method2171(4096, false);
                } else {
                    arg2.method2171(2048, false);
                }
            } else if (var7 < var9) {
                arg2.method2171(8192, false);
            } else if (var7 > var9) {
                arg2.method2171(0, false);
            }
        } else if (var7 < var9) {
            arg2.method2171(10240, false);
        } else if (var7 > var9) {
            arg2.method2171(14336, false);
        } else {
            arg2.method2171(12288, false);
        }
        byte var10 = arg2.field4761[arg2.field4764 - 1];
        if (!arg1 && ((var8 - var6) > 1024 || (var8 - var6) < -1024 || (var9 - var7) > 1024 || var9 - var7 < -1024)) {
            arg2.field2900 = var9;
            arg2.field2896 = var8;
            arg2.method2179(284, arg2.field4734, false);
            arg2.field4764--;
            if (arg2.field4765 > 0) {
                arg2.field4765--;
            }
            class463.field6020 = 0;
            class781.field10681 = -1;
            return;
        }
        int var11 = 16;
        boolean var12 = true;
        if (arg2 instanceof class727) {
            var12 = ((class727) arg2).field9545.field3324;
        }
        if (var12) {
            int var13 = arg2.field4734 - arg2.field4728.field6462;
            if (var13 != 0 && arg2.field4723 == -1 && arg2.field4750 != 0) {
                var11 = 8;
            }
            if (!arg1 && arg2.field4764 > 2) {
                var11 = 24;
            }
            if (!arg1 && arg2.field4764 > 3) {
                var11 = 32;
            }
        } else {
            if (!arg1 && arg2.field4764 > 1) {
                var11 = 24;
            }
            if (!arg1 && arg2.field4764 > 2) {
                var11 = 32;
            }
        }
        if (arg2.field4759 > 0 && arg2.field4764 > 1) {
            var11 = 32;
            arg2.field4759--;
        }
        if (var10 == 2) {
            var11 <<= 0x1;
        } else if (var10 == 0) {
            var11 >>= 0x1;
        }
        if (var3.field916 != -1) {
            int var14 = var11 << 9;
            if (arg2.field4764 == 1) {
                int var15 = arg2.field4762 * arg2.field4762;
                int var16 = (var8 >= arg2.field2896 ? var8 - arg2.field2896 : -var8 + arg2.field2896) << 9;
                int var17 = (var9 >= arg2.field2900 ? var9 - arg2.field2900 : arg2.field2900 - var9) << 9;
                int var18 = var17 >= var16 ? var17 : var16;
                int var19 = var3.field916 * 2 * var18;
                if (var15 > var19) {
                    arg2.field4762 /= 2;
                } else if (var15 / 2 > var18) {
                    arg2.field4762 -= var3.field916;
                    if (arg2.field4762 < 0) {
                        arg2.field4762 = 0;
                    }
                } else if (arg2.field4762 < var14) {
                    arg2.field4762 += var3.field916;
                    if (var14 < arg2.field4762) {
                        arg2.field4762 = var14;
                    }
                }
            } else if (var14 > arg2.field4762) {
                arg2.field4762 += var3.field916;
                if (arg2.field4762 > var14) {
                    arg2.field4762 = var14;
                }
            } else if (arg2.field4762 > 0) {
                arg2.field4762 -= var3.field916;
                if (arg2.field4762 < 0) {
                    arg2.field4762 = 0;
                }
            }
            var11 = arg2.field4762 >> 9;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        class463.field6020 = 0;
        if (var6 == var8 && var7 == var9) {
            class781.field10681 = -1;
        } else {
            if (var6 < var8) {
                arg2.field2896 += var11;
                class463.field6020 |= 0x4;
                if (arg2.field2896 > var8) {
                    arg2.field2896 = var8;
                }
            } else if (var6 > var8) {
                arg2.field2896 -= var11;
                class463.field6020 |= 0x8;
                if (arg2.field2896 < var8) {
                    arg2.field2896 = var8;
                }
            }
            if (var11 < 32) {
                class781.field10681 = var10;
            } else {
                class781.field10681 = 2;
            }
            if (var7 < var9) {
                arg2.field2900 += var11;
                class463.field6020 |= 0x1;
                if (var9 < arg2.field2900) {
                    arg2.field2900 = var9;
                }
            } else if (var7 > var9) {
                arg2.field2900 -= var11;
                class463.field6020 |= 0x2;
                if (var9 > arg2.field2900) {
                    arg2.field2900 = var9;
                }
            }
        }
        if (arg2.field2896 == var8 && arg2.field2900 == var9) {
            if (arg2.field4765 > 0) {
                arg2.field4765--;
            }
            arg2.field4764--;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class204(String arg0) {
        this.field2823 = arg0;
    }
}
