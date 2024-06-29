import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class477 {

    @OriginalMember(owner = "client!po", name = "c", descriptor = "Lvt;")
    public static class344 field6712 = new class344("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field6711;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public static void method2703(int arg0) {
        field6712 = null;
        if (arg0 <= 19) {
            method2704(-122, null, true);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILdc;Z)V")
    public static final void method2704(int arg0, class23 arg1, boolean arg2) {
        field6711++;
        class362 var3 = arg1.method144((byte) 16);
        if (arg1.field421 == 0) {
            class580.field8085 = -1;
            arg1.field420 = 0;
            class216.field2769 = 0;
            return;
        }
        if (arg1.field368 != -1 && arg1.field391 == 0) {
            class320 var4 = class609.field8754.method535(arg1.field368, true);
            if (arg1.field424 > 0 && var4.field4415 == 0) {
                arg1.field420++;
                class580.field8085 = -1;
                class216.field2769 = 0;
                return;
            }
            if (arg1.field424 <= 0 && var4.field4408 == 0) {
                class216.field2769 = 0;
                class580.field8085 = -1;
                arg1.field420++;
                return;
            }
        }
        if (arg1.field380 != -1 && class7.field61 >= arg1.field369) {
            class628 var5 = class410.field5636.method348(6410, arg1.field380);
            if (var5.field9162 && var5.field9152 != -1) {
                class320 var6 = class609.field8754.method535(var5.field9152, true);
                if (arg1.field424 > 0 && var6.field4415 == 0) {
                    arg1.field420++;
                    class580.field8085 = -1;
                    class216.field2769 = 0;
                    return;
                }
                if (arg1.field424 <= 0 && var6.field4408 == 0) {
                    class580.field8085 = -1;
                    class216.field2769 = 0;
                    arg1.field420++;
                    return;
                }
            }
        }
        if (arg1.field380 != -1 && arg1.field369 <= class7.field61) {
            class628 var7 = class410.field5636.method348(6410, arg1.field380);
            if (var7.field9162 && var7.field9152 != -1) {
                class320 var8 = class609.field8754.method535(var7.field9152, true);
                if (arg1.field424 > 0 && var8.field4415 == 0) {
                    arg1.field420++;
                    class216.field2769 = 0;
                    class580.field8085 = -1;
                    return;
                }
                if (arg1.field424 <= 0 && var8.field4408 == 0) {
                    class580.field8085 = -1;
                    arg1.field420++;
                    class216.field2769 = 0;
                    return;
                }
            }
        }
        int var9 = arg1.field6362;
        int var10 = arg1.field6368;
        int var11 = arg1.field419[arg1.field421 - 1] * 512 + (arg1.method104((byte) -92) * 256);
        int var12 = arg1.field417[arg1.field421 - 1] * 512 + arg1.method104((byte) -92) * 256;
        if (var11 <= var9) {
            if (var9 > var11) {
                if (var10 < var12) {
                    arg1.method130(-126, 6144);
                } else if (var10 <= var12) {
                    arg1.method130(-128, 4096);
                } else {
                    arg1.method130(-118, 2048);
                }
            } else if (var10 < var12) {
                arg1.method130(-120, 8192);
            } else if (var12 < var10) {
                arg1.method130(-106, 0);
            }
        } else if (var12 > var10) {
            arg1.method130(-95, 10240);
        } else if (var10 <= var12) {
            arg1.method130(-128, 12288);
        } else {
            arg1.method130(-111, 14336);
        }
        byte var13 = arg1.field418[arg1.field421 - 1];
        if (!arg2 && (var11 - var9) > 1024 || (var11 - var9) < -1024 || (var12 - var10) > 1024 || var12 - var10 < -1024) {
            arg1.field6362 = var11;
            arg1.field6368 = var12;
            arg1.method131(true, arg1.field407, false);
            class580.field8085 = -1;
            arg1.field421--;
            if (arg1.field424 > 0) {
                arg1.field424--;
            }
            class216.field2769 = 0;
            return;
        }
        int var14 = 16;
        boolean var15 = true;
        if (arg1 instanceof class585) {
            var15 = ((class585) arg1).field8478.field9115;
        }
        if (var15) {
            int var16 = arg1.field407 - arg1.field338.field458;
            if (var16 != 0 && arg1.field399 == -1 && arg1.field334 != 0) {
                var14 = 8;
            }
            if (!arg2 && arg1.field421 > 2) {
                var14 = 24;
            }
            if (!arg2 && arg1.field421 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg2 && arg1.field421 > 1) {
                var14 = 24;
            }
            if (!arg2 && arg1.field421 > 2) {
                var14 = 32;
            }
        }
        if (arg1.field420 > 0 && arg1.field421 > 1) {
            var14 = 32;
            arg1.field420--;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        class216.field2769 = 0;
        if (var3.field5053 != -1) {
            int var17 = var14 << 9;
            if (arg1.field421 == 1) {
                int var18 = arg1.field415 * arg1.field415;
                int var19 = (var11 < arg1.field6362 ? arg1.field6362 - var11 : var11 - arg1.field6362) << 9;
                int var20 = (var12 < arg1.field6368 ? arg1.field6368 - var12 : -arg1.field6368 + var12) << 9;
                int var21 = var19 > var20 ? var19 : var20;
                int var22 = var3.field5053 * 2 * var21;
                if (var18 > var22) {
                    arg1.field415 /= 2;
                } else if (var18 / 2 > var21) {
                    arg1.field415 -= var3.field5053;
                    if (arg1.field415 < 0) {
                        arg1.field415 = 0;
                    }
                } else if (var17 > arg1.field415) {
                    arg1.field415 += var3.field5053;
                    if (var17 < arg1.field415) {
                        arg1.field415 = var17;
                    }
                }
            } else if (arg1.field415 < var17) {
                arg1.field415 += var3.field5053;
                if (arg1.field415 > var17) {
                    arg1.field415 = var17;
                }
            } else if (arg1.field415 > 0) {
                arg1.field415 -= var3.field5053;
                if (arg1.field415 < 0) {
                    arg1.field415 = 0;
                }
            }
            var14 = arg1.field415 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        if (arg0 > -68) {
            method2704(-92, null, true);
        }
        if (var9 == var11 && var10 == var12) {
            class580.field8085 = -1;
        } else {
            if (var9 < var11) {
                class216.field2769 |= 0x4;
                arg1.field6362 += var14;
                if (var11 < arg1.field6362) {
                    arg1.field6362 = var11;
                }
            } else if (var9 > var11) {
                arg1.field6362 -= var14;
                class216.field2769 |= 0x8;
                if (arg1.field6362 < var11) {
                    arg1.field6362 = var11;
                }
            }
            if (var14 >= 32) {
                class580.field8085 = 2;
            } else {
                class580.field8085 = var13;
            }
            if (var10 < var12) {
                arg1.field6368 += var14;
                class216.field2769 |= 0x1;
                if (arg1.field6368 > var12) {
                    arg1.field6368 = var12;
                }
            } else if (var10 > var12) {
                class216.field2769 |= 0x2;
                arg1.field6368 -= var14;
                if (var12 > arg1.field6368) {
                    arg1.field6368 = var12;
                }
            }
        }
        if (arg1.field6362 == var11 && arg1.field6368 == var12) {
            if (arg1.field424 > 0) {
                arg1.field424--;
            }
            arg1.field421--;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIBLkr;)Lpe;")
    public static final class157 method2705(int arg0, int arg1, byte arg2, class329 arg3) {
        field6710++;
        byte[] var4 = arg3.method2054(true, arg0, arg1);
        if (var4 == null) {
            return null;
        } else if (arg2 == -26) {
            return new class157(var4);
        } else {
            return null;
        }
    }
}
