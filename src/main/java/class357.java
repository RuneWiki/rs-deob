import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class357 {

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Llo;")
    private class443 field5286 = new class443();

    @OriginalMember(owner = "client!te", name = "p", descriptor = "Ltr;")
    private class173 field5296 = new class173();

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    private int field5294;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    private int field5295;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "Lbo;")
    private class453 field5292;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "I")
    public static int field5289 = -1;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Lss;")
    public static class394 field5287 = class309.method2045(0);

    @OriginalMember(owner = "client!te", name = "m", descriptor = "B")
    public static byte field5293;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method2343(boolean arg0) {
        field5283++;
        class117.field1529.method473(((float) class378.field5531 * 0.1F + 0.7F) * 1.1523438F);
        class117.field1529.method488(class238.field3341, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class117.field1529.method483(class123.field1592, -1);
        if (arg0) {
            method2347((byte) 26, 122);
        }
        class117.field1529.method441(class232.field3224);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V", line = 22)
    public static final void method2344(byte arg0) {
        class157.field1985 = null;
        class441.field6391 = null;
        class273.field4011 = null;
        if (arg0 >= -49) {
            return;
        }
        field5290++;
        class280.field4130 = false;
        class342.field5121 = null;
        class174.field2366 = null;
        class274.method1812(-1695);
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V", line = 54)
    public final void method2345(boolean arg0) {
        this.field5296.method1156(-7585);
        field5291++;
        if (!arg0) {
            this.field5292.method2825(117);
            this.field5286 = new class443();
            this.field5295 = this.field5294;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIII)V", line = 82)
    public static final void method2346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5281++;
        int var8 = arg5 + arg3;
        int var9 = arg4 - arg3;
        for (int var10 = arg5; var10 < var8; var10++) {
            class351.method2317(false, arg2, class444.field6416[var10], arg7, arg6);
        }
        int var11 = arg2 - arg3;
        int var12 = arg7 + arg3;
        int var13 = arg4;
        if (arg1 < 39) {
            field5297 = 105;
        }
        while (var9 < var13) {
            class351.method2317(false, arg2, class444.field6416[var13], arg7, arg6);
            var13--;
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class444.field6416[var14];
            class351.method2317(false, var12, var15, arg7, arg6);
            class351.method2317(false, var11, var15, var12, arg0);
            class351.method2317(false, arg2, var15, var11, arg6);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)S", line = 127)
    public static final short method2347(byte arg0, int arg1) {
        field5282++;
        int var2 = (arg1 & 0xFDEC) >> 10;
        if (arg0 != 87) {
            return -35;
        }
        int var3 = arg1 >> 3 & 0x70;
        int var4 = arg1 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var7 >> 4 << 7 | var2 << 10);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IJ)Llo;", line = 155)
    public final class443 method2348(int arg0, long arg1) {
        if (arg0 != 112) {
            return null;
        }
        field5288++;
        class443 var4 = (class443) this.field5292.method2826(false, arg1);
        if (var4 != null) {
            this.field5296.method1154(var4, 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIILps;)V", line = 178)
    public static final void method2349(int arg0, int arg1, int arg2, int arg3, class162 arg4) {
        field5284++;
        class290 var5 = arg4.method1084(-24211);
        if (arg1 <= 15) {
            field5298 = -6;
        }
        int var6 = arg4.field2111 - arg4.field2164.field1198 & 0x3FFF;
        if (arg2 == -1) {
            if (var6 != 0 || arg4.field2156 > 25) {
                arg4.field2178 = false;
                if (arg3 < 0 && var5.field4390 != -1) {
                    arg4.field2143 = var5.field4390;
                } else if (arg3 <= 0 || var5.field4362 == -1) {
                    arg4.field2143 = var5.field4365;
                } else {
                    arg4.field2143 = var5.field4362;
                }
            } else if (!arg4.field2178 || !var5.method1972((byte) -47, arg4.field2143)) {
                arg4.field2143 = var5.method1975(0);
                arg4.field2178 = arg4.field2143 != -1;
            }
        } else if (arg4.field2179 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class231.field3180[arg0] - arg4.field2164.field1198 & 0x3FFF;
            arg4.field2178 = false;
            if (arg2 == 2 && var5.field4385 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field4381 != -1) {
                    arg4.field2143 = var5.field4381;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field4372 != -1) {
                    arg4.field2143 = var5.field4372;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field4363 == -1) {
                    arg4.field2143 = var5.field4385;
                } else {
                    arg4.field2143 = var5.field4363;
                }
            } else if (arg2 == 0 && var5.field4373 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field4345 != -1) {
                    arg4.field2143 = var5.field4345;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field4352 != -1) {
                    arg4.field2143 = var5.field4352;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field4343 == -1) {
                    arg4.field2143 = var5.field4373;
                } else {
                    arg4.field2143 = var5.field4343;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field4382 != -1) {
                arg4.field2143 = var5.field4382;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field4346 != -1) {
                arg4.field2143 = var5.field4346;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field4360 == -1) {
                arg4.field2143 = var5.field4365;
            } else {
                arg4.field2143 = var5.field4360;
            }
        } else if (var6 == 0 && arg4.field2156 <= 25) {
            if (arg2 == 2 && var5.field4385 != -1) {
                arg4.field2143 = var5.field4385;
            } else if (arg2 == 0 && var5.field4373 != -1) {
                arg4.field2143 = var5.field4373;
            } else {
                arg4.field2143 = var5.field4365;
            }
            arg4.field2178 = false;
        } else {
            arg4.field2178 = false;
            if (arg2 == 2 && var5.field4385 != -1) {
                if (arg3 < 0 && var5.field4374 != -1) {
                    arg4.field2143 = var5.field4374;
                } else if (arg3 <= 0 || var5.field4349 == -1) {
                    arg4.field2143 = var5.field4385;
                } else {
                    arg4.field2143 = var5.field4349;
                }
            } else if (arg2 == 0 && var5.field4373 != -1) {
                if (arg3 < 0 && var5.field4379 != -1) {
                    arg4.field2143 = var5.field4379;
                } else if (arg3 <= 0 || var5.field4355 == -1) {
                    arg4.field2143 = var5.field4373;
                } else {
                    arg4.field2143 = var5.field4355;
                }
            } else if (arg3 < 0 && var5.field4386 != -1) {
                arg4.field2143 = var5.field4386;
            } else if (arg3 <= 0 || var5.field4375 == -1) {
                arg4.field2143 = var5.field4365;
            } else {
                arg4.field2143 = var5.field4375;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Llo;JI)V", line = 338)
    public final void method2350(class443 arg0, long arg1, int arg2) {
        field5285++;
        if (this.field5295 == 0) {
            class443 var5 = this.field5296.method1149(0);
            var5.method2632(true);
            var5.method2764((byte) 119);
            if (this.field5286 == var5) {
                class443 var6 = this.field5296.method1149(0);
                var6.method2632(true);
                var6.method2764((byte) 119);
            }
        } else {
            this.field5295--;
        }
        this.field5292.method2815(-1, arg1, arg0);
        int var7 = -12 / ((arg2 + 33) / 42);
        this.field5296.method1154(arg0, 0);
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(I)V", line = 392)
    public class357(int arg0) {
        this.field5294 = arg0;
        this.field5295 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field5292 = new class453(var2);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 372)
    public static void method2351(int arg0) {
        int var1 = -62 / ((-arg0 - 34) / 55);
        field5287 = null;
    }
}
