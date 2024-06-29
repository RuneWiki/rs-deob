import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class749 {

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "I")
    public static int field10435 = 1;

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "I")
    public static int field10434 = 0;

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "Lag;")
    public static class214 field10433 = new class214(1, 2);

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
    public static int field10430;

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
    public static int field10431;

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "I")
    public static int field10432;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)V")
    public static void method4162(byte arg0) {
        if (arg0 < -81) {
            field10433 = null;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(ZI)I")
    public static final int method4163(boolean arg0, int arg1) {
        field10430++;
        if (arg1 != 0) {
            field10435 = 89;
        }
        int var2 = class589.field8461;
        if (var2 == 0) {
            return arg0 ? 0 : class720.field10169;
        } else if (var2 == 1) {
            return class720.field10169;
        } else if (var2 == 2) {
            return 0;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILhg;Z)V")
    public static final void method4164(int arg0, class584 arg1, boolean arg2) {
        field10432++;
        class591 var3 = arg1.method3482(0);
        if (arg1.field8419 == 0) {
            arg1.field8422 = 0;
            field10431 = -1;
            class118.field1642 = 0;
            return;
        }
        if (arg1.field8317 != -1 && arg1.field8391 == 0) {
            class103 var4 = class274.field3684.method1881((byte) -80, arg1.field8317);
            if (arg1.field8416 > 0 && var4.field1481 == 0) {
                class118.field1642 = 0;
                field10431 = -1;
                arg1.field8422++;
                return;
            }
            if (arg1.field8416 <= 0 && var4.field1486 == 0) {
                arg1.field8422++;
                field10431 = -1;
                class118.field1642 = 0;
                return;
            }
        }
        if (arg1.field8313 != -1 && arg1.field8331 <= class245.field3409) {
            class42 var5 = class267.field3625.method3986(-1, arg1.field8313);
            if (var5.field594 && var5.field585 != -1) {
                class103 var6 = class274.field3684.method1881((byte) -80, var5.field585);
                if (arg1.field8416 > 0 && var6.field1481 == 0) {
                    field10431 = -1;
                    class118.field1642 = 0;
                    arg1.field8422++;
                    return;
                }
                if (arg1.field8416 <= 0 && var6.field1486 == 0) {
                    field10431 = -1;
                    class118.field1642 = 0;
                    arg1.field8422++;
                    return;
                }
            }
        }
        if (arg1.field8313 != -1 && arg1.field8331 <= class245.field3409) {
            class42 var7 = class267.field3625.method3986(-1, arg1.field8313);
            if (var7.field594 && var7.field585 != -1) {
                class103 var8 = class274.field3684.method1881((byte) -80, var7.field585);
                if (arg1.field8416 > 0 && var8.field1481 == 0) {
                    field10431 = -1;
                    class118.field1642 = 0;
                    arg1.field8422++;
                    return;
                }
                if (arg1.field8416 <= 0 && var8.field1486 == 0) {
                    class118.field1642 = 0;
                    field10431 = -1;
                    arg1.field8422++;
                    return;
                }
            }
        }
        int var9 = arg1.field9490;
        int var10 = arg1.field9489;
        int var11 = arg1.field8421[arg1.field8419 - 1] * 512 + (arg1.method3470(-1) * 256);
        int var12 = -36 % ((arg0 + 60) / 36);
        int var13 = arg1.field8414[arg1.field8419 - 1] * 512 + arg1.method3470(-1) * 256;
        if (var9 >= var11) {
            if (var11 < var9) {
                if (var13 > var10) {
                    arg1.method3475(-16384, 6144);
                } else if (var13 < var10) {
                    arg1.method3475(-16384, 2048);
                } else {
                    arg1.method3475(-16384, 4096);
                }
            } else if (var13 > var10) {
                arg1.method3475(-16384, 8192);
            } else if (var10 > var13) {
                arg1.method3475(-16384, 0);
            }
        } else if (var10 < var13) {
            arg1.method3475(-16384, 10240);
        } else if (var13 < var10) {
            arg1.method3475(-16384, 14336);
        } else {
            arg1.method3475(-16384, 12288);
        }
        byte var14 = arg1.field8420[arg1.field8419 - 1];
        if (!arg2 && ((var11 - var9) > 1024 || var11 - var9 < -1024 || var13 - var10 > 1024 || (var13 - var10) < -1024)) {
            arg1.field9489 = var13;
            arg1.field9490 = var11;
            arg1.method3471(arg1.field8376, (byte) -106, false);
            if (arg1.field8416 > 0) {
                arg1.field8416--;
            }
            arg1.field8419--;
            field10431 = -1;
            class118.field1642 = 0;
            return;
        }
        int var15 = 16;
        boolean var16 = true;
        if (arg1 instanceof class55) {
            var16 = ((class55) arg1).field771.field143;
        }
        if (var16) {
            int var17 = arg1.field8376 - arg1.field8327.field6095;
            if (var17 != 0 && arg1.field8342 == -1 && arg1.field8322 != 0) {
                var15 = 8;
            }
            if (!arg2 && arg1.field8419 > 2) {
                var15 = 24;
            }
            if (!arg2 && arg1.field8419 > 3) {
                var15 = 32;
            }
        } else {
            if (!arg2 && arg1.field8419 > 1) {
                var15 = 24;
            }
            if (!arg2 && arg1.field8419 > 2) {
                var15 = 32;
            }
        }
        if (arg1.field8422 > 0 && arg1.field8419 > 1) {
            arg1.field8422--;
            var15 = 32;
        }
        if (var14 == 2) {
            var15 <<= 0x1;
        } else if (var14 == 0) {
            var15 >>= 0x1;
        }
        if (var3.field8517 != -1) {
            int var18 = var15 << 9;
            if (arg1.field8419 == 1) {
                int var19 = arg1.field8417 * arg1.field8417;
                int var20 = (var11 < arg1.field9490 ? arg1.field9490 - var11 : -arg1.field9490 + var11) << 9;
                int var21 = (arg1.field9489 <= var13 ? var13 - arg1.field9489 : arg1.field9489 - var13) << 9;
                int var22 = var21 >= var20 ? var21 : var20;
                int var23 = var3.field8517 * 2 * var22;
                if (var19 > var23) {
                    arg1.field8417 /= 2;
                } else if (var19 / 2 > var22) {
                    arg1.field8417 -= var3.field8517;
                    if (arg1.field8417 < 0) {
                        arg1.field8417 = 0;
                    }
                } else if (arg1.field8417 < var18) {
                    arg1.field8417 += var3.field8517;
                    if (arg1.field8417 > var18) {
                        arg1.field8417 = var18;
                    }
                }
            } else if (var18 > arg1.field8417) {
                arg1.field8417 += var3.field8517;
                if (arg1.field8417 > var18) {
                    arg1.field8417 = var18;
                }
            } else if (arg1.field8417 > 0) {
                arg1.field8417 -= var3.field8517;
                if (arg1.field8417 < 0) {
                    arg1.field8417 = 0;
                }
            }
            var15 = arg1.field8417 >> 9;
            if (var15 < 1) {
                var15 = 1;
            }
        }
        class118.field1642 = 0;
        if (var9 == var11 && var10 == var13) {
            field10431 = -1;
        } else {
            if (var9 < var11) {
                arg1.field9490 += var15;
                class118.field1642 |= 0x4;
                if (var11 < arg1.field9490) {
                    arg1.field9490 = var11;
                }
            } else if (var11 < var9) {
                arg1.field9490 -= var15;
                class118.field1642 |= 0x8;
                if (arg1.field9490 < var11) {
                    arg1.field9490 = var11;
                }
            }
            if (var10 < var13) {
                class118.field1642 |= 0x1;
                arg1.field9489 += var15;
                if (arg1.field9489 > var13) {
                    arg1.field9489 = var13;
                }
            } else if (var10 > var13) {
                arg1.field9489 -= var15;
                class118.field1642 |= 0x2;
                if (var13 > arg1.field9489) {
                    arg1.field9489 = var13;
                }
            }
            if (var15 >= 32) {
                field10431 = 2;
            } else {
                field10431 = var14;
            }
        }
        if (arg1.field9490 != var11 || arg1.field9489 != var13) {
            return;
        }
        arg1.field8419--;
        if (arg1.field8416 > 0) {
            arg1.field8416--;
            return;
        }
    }
}
