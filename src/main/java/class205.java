import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class205 extends class69 {

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Lin;")
    public static class380 field3009 = new class380(1, -1);

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "Lo;")
    public static class210 field3010;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZLfm;)V")
    public static final void method1435(int arg0, boolean arg1, class281 arg2) {
        field3012++;
        class31 var3 = arg2.method1783(true);
        if (arg2.field4141 == 0) {
            class522.field7312 = -1;
            class116.field1989 = 0;
            arg2.field4144 = 0;
            return;
        }
        if (arg2.field4064 != -1 && arg2.field4124 == 0) {
            class98 var4 = class168.field2552.method3287(96, arg2.field4064);
            if (arg2.field4140 > 0 && var4.field1412 == 0) {
                class116.field1989 = 0;
                arg2.field4144++;
                class522.field7312 = -1;
                return;
            }
            if (arg2.field4140 <= 0 && var4.field1397 == 0) {
                arg2.field4144++;
                class522.field7312 = -1;
                class116.field1989 = 0;
                return;
            }
        }
        for (int var5 = 0; var5 < arg2.field4043.length; var5++) {
            if (arg2.field4043[var5].field8710 != -1 && class594.field8494 >= arg2.field4043[var5].field8706) {
                class113 var20 = class620.field8760.method1832(77, arg2.field4043[var5].field8710);
                if (var20.field1650 && var20.field1628 != -1) {
                    class98 var21 = class168.field2552.method3287(108, var20.field1628);
                    if (arg2.field4140 > 0 && var21.field1412 == 0) {
                        class522.field7312 = -1;
                        arg2.field4144++;
                        class116.field1989 = 0;
                        return;
                    }
                    if (arg2.field4140 <= 0 && var21.field1397 == 0) {
                        arg2.field4144++;
                        class522.field7312 = -1;
                        class116.field1989 = 0;
                        return;
                    }
                }
            }
        }
        int var6 = arg2.field10347;
        int var7 = arg2.field10350;
        int var8 = arg2.field4142[arg2.field4141 - 1] * 512 + arg2.method209(true) * 256;
        int var9 = arg2.field4136[arg2.field4141 - 1] * 512 + arg2.method209(true) * 256;
        if (var6 >= var8) {
            if (var8 >= var6) {
                if (var7 < var9) {
                    arg2.method1791(8192, (byte) -84);
                } else if (var9 < var7) {
                    arg2.method1791(0, (byte) 117);
                }
            } else if (var7 < var9) {
                arg2.method1791(6144, (byte) -64);
            } else if (var9 < var7) {
                arg2.method1791(2048, (byte) -45);
            } else {
                arg2.method1791(4096, (byte) 108);
            }
        } else if (var9 > var7) {
            arg2.method1791(10240, (byte) 123);
        } else if (var9 < var7) {
            arg2.method1791(14336, (byte) 114);
        } else {
            arg2.method1791(12288, (byte) 94);
        }
        byte var10 = arg2.field4139[arg2.field4141 - 1];
        if (arg0 > -37) {
            method1435(-28, true, null);
        }
        if (!arg1 && (var8 - var6 > 1024 || (var8 - var6) < -1024 || (var9 - var7) > 1024 || (var9 - var7) < -1024)) {
            arg2.field10350 = var9;
            arg2.field10347 = var8;
            arg2.method1795(arg2.field4076, 0, false);
            arg2.field4141--;
            if (arg2.field4140 > 0) {
                arg2.field4140--;
            }
            class116.field1989 = 0;
            class522.field7312 = -1;
            return;
        }
        int var11 = 16;
        boolean var12 = true;
        if (arg2 instanceof class506) {
            var12 = ((class506) arg2).field6964.field2730;
        }
        if (var12) {
            int var13 = arg2.field4076 - arg2.field4067.field4287;
            if (var13 != 0 && arg2.field4054 == -1 && arg2.field4117 != 0) {
                var11 = 8;
            }
            if (!arg1 && arg2.field4141 > 2) {
                var11 = 24;
            }
            if (!arg1 && arg2.field4141 > 3) {
                var11 = 32;
            }
        } else {
            if (!arg1 && arg2.field4141 > 1) {
                var11 = 24;
            }
            if (!arg1 && arg2.field4141 > 2) {
                var11 = 32;
            }
        }
        if (arg2.field4144 > 0 && arg2.field4141 > 1) {
            arg2.field4144--;
            var11 = 32;
        }
        if (var10 == 2) {
            var11 <<= 0x1;
        } else if (var10 == 0) {
            var11 >>= 0x1;
        }
        class116.field1989 = 0;
        if (var3.field383 != -1) {
            int var14 = var11 << 9;
            if (arg2.field4141 == 1) {
                int var15 = arg2.field4137 * arg2.field4137;
                int var16 = (arg2.field10347 > var8 ? arg2.field10347 - var8 : -arg2.field10347 + var8) << 9;
                int var17 = (var9 >= arg2.field10350 ? var9 - arg2.field10350 : -var9 + arg2.field10350) << 9;
                int var18 = var17 < var16 ? var16 : var17;
                int var19 = var3.field383 * 2 * var18;
                if (var15 > var19) {
                    arg2.field4137 /= 2;
                } else if (var15 / 2 > var18) {
                    arg2.field4137 -= var3.field383;
                    if (arg2.field4137 < 0) {
                        arg2.field4137 = 0;
                    }
                } else if (var14 > arg2.field4137) {
                    arg2.field4137 += var3.field383;
                    if (arg2.field4137 > var14) {
                        arg2.field4137 = var14;
                    }
                }
            } else if (arg2.field4137 < var14) {
                arg2.field4137 += var3.field383;
                if (arg2.field4137 > var14) {
                    arg2.field4137 = var14;
                }
            } else if (arg2.field4137 > 0) {
                arg2.field4137 -= var3.field383;
                if (arg2.field4137 < 0) {
                    arg2.field4137 = 0;
                }
            }
            var11 = arg2.field4137 >> 9;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        if (var6 == var8 && var7 == var9) {
            class522.field7312 = -1;
        } else {
            if (var8 > var6) {
                class116.field1989 |= 0x4;
                arg2.field10347 += var11;
                if (arg2.field10347 > var8) {
                    arg2.field10347 = var8;
                }
            } else if (var8 < var6) {
                arg2.field10347 -= var11;
                class116.field1989 |= 0x8;
                if (arg2.field10347 < var8) {
                    arg2.field10347 = var8;
                }
            }
            if (var11 < 32) {
                class522.field7312 = var10;
            } else {
                class522.field7312 = 2;
            }
            if (var9 > var7) {
                class116.field1989 |= 0x1;
                arg2.field10350 += var11;
                if (var9 < arg2.field10350) {
                    arg2.field10350 = var9;
                }
            } else if (var9 < var7) {
                arg2.field10350 -= var11;
                class116.field1989 |= 0x2;
                if (arg2.field10350 < var9) {
                    arg2.field10350 = var9;
                }
            }
        }
        if (arg2.field10347 == var8 && arg2.field10350 == var9) {
            if (arg2.field4140 > 0) {
                arg2.field4140--;
            }
            arg2.field4141--;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZFFF)F")
    public static final float method1436(boolean arg0, float arg1, float arg2, float arg3) {
        if (arg0) {
            return 0.23349088F;
        } else {
            field3011++;
            return (arg1 - arg3) * arg2 + arg3;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
    public static void method1437(boolean arg0) {
        field3009 = null;
        field3010 = null;
        if (!arg0) {
            field3009 = null;
        }
    }
}
