import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class287 {

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public int field4556 = -1;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public int field4560 = -1;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4559 = "flash2:";

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "Lqi;")
    public static class131 field4552;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "[I")
    public int[] field4564;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIZIIIIIII)V")
    public static final void method1947(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class274 var10 = null;
        class274 var11 = (class274) class105.field1528.method1384(2);
        field4551++;
        while (var11 != null) {
            if (var11.field4409 == arg5 && var11.field4402 == arg8 && var11.field4399 == arg1 && var11.field4391 == arg7) {
                var10 = var11;
                break;
            }
            var11 = (class274) class105.field1528.method1388((byte) 107);
        }
        if (var10 == null) {
            var10 = new class274();
            var10.field4409 = arg5;
            var10.field4399 = arg1;
            var10.field4402 = arg8;
            var10.field4391 = arg7;
            class180.method1341(var10, (byte) -72);
            class105.field1528.method1385(var10, arg2);
        }
        if (!arg2) {
            return;
        }
        var10.field4397 = arg9;
        var10.field4398 = arg6;
        var10.field4394 = arg0;
        var10.field4396 = arg4;
        var10.field4393 = arg3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1948(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4557++;
        if (arg3 == arg4) {
            class268.method1862(true, arg0, arg5, arg1, arg7, arg3, arg6);
            return;
        }
        int var8 = 124 / ((81 - arg2) / 45);
        if (class272.field4374 <= arg5 - arg3 && (arg3 + arg5) <= class211.field3386 && class207.field3328 <= (arg7 - arg4) && class228.field3657 >= arg4 + arg7) {
            class188.method1405((byte) -90, arg0, arg3, arg5, arg6, arg1, arg7, arg4);
        } else {
            class195.method1448(arg6, arg0, arg7, false, arg5, arg1, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static void method1949(int arg0) {
        if (arg0 != 14348) {
            method1950(false, -67);
        }
        field4552 = null;
        field4559 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)I")
    public static final int method1950(boolean arg0, int arg1) {
        field4558++;
        return arg0 ? 125 : arg1 >>> 10;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lv;III)V")
    private final void method1951(class152 arg0, int arg1, int arg2, int arg3) {
        field4561++;
        if (arg2 == 1) {
            this.field4556 = arg0.method1126(false);
        } else if (arg2 == 2) {
            this.field4564 = new int[arg0.method1111(255)];
            for (int var5 = 0; var5 < this.field4564.length; var5++) {
                this.field4564[var5] = arg0.method1126(false);
            }
        } else if (arg2 == 3) {
            this.field4560 = arg0.method1111(255);
        }
        int var6 = 5 / ((71 - arg1) / 39);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1952(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -73 % ((arg2 + 67) / 37);
        field4563++;
        if (arg1 >= class272.field4374 && class211.field3386 >= arg1 && arg4 >= class272.field4374 && class211.field3386 >= arg4 && arg6 >= class272.field4374 && class211.field3386 >= arg6 && class272.field4374 <= arg7 && class211.field3386 >= arg7 && arg0 >= class207.field3328 && arg0 <= class228.field3657 && class207.field3328 <= arg5 && arg5 <= class228.field3657 && class207.field3328 <= arg3 && class228.field3657 >= arg3 && class207.field3328 <= arg8 && class228.field3657 >= arg8) {
            class154.method1146(arg5, arg4, arg9, arg8, arg0, arg7, arg1, arg3, arg6, 0);
        } else {
            class99.method760(arg6, arg5, arg0, arg4, arg1, arg7, arg8, arg3, 121, arg9);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lqi;BLsi;IIII)V")
    public static final void method1953(class131 arg0, byte arg1, class204 arg2, int arg3, int arg4, int arg5, int arg6) {
        field4555++;
        if (arg2 == null) {
            return;
        }
        int var7 = (int) class190.field3068 + class61.field855 & 0x7FF;
        int var8 = Math.max(arg0.field2102 / 2, arg0.field2167 / 2) + 10;
        if (arg1 != -57) {
            return;
        }
        int var9 = arg4 * arg4 + arg6 * arg6;
        if (var9 > (var8 * var8)) {
            return;
        }
        int var10 = class47.field679[var7];
        int var11 = class47.field695[var7];
        int var12 = var10 * 256 / (class53.field776 + 256);
        int var13 = var11 * 256 / (class53.field776 + 256);
        int var14 = arg4 * var13 + arg6 * var12 >> 16;
        int var15 = arg6 * var13 - arg4 * var12 >> 16;
        ((class140) arg2).method990(arg0.field2102 / 2 + arg3 + var14 - arg2.field3266 / 2, -var15 + arg5 + -(arg2.field3274 / 2) - -(arg0.field2167 / 2), arg0.field2068, arg0.field2062);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lsl;I)I")
    public static final int method1954(class18 arg0, int arg1) {
        field4553++;
        class245 var2 = arg0.field205;
        if (arg1 != -1) {
            field4552 = null;
        }
        if (var2.field3972 != null) {
            var2 = var2.method1758(true);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3971;
        class235 var4 = arg0.method917((byte) 122);
        if (arg0.field1966 == var4.field3760) {
            var3 = var2.field4034;
        } else if (arg0.field1966 == var4.field3783 || arg0.field1966 == var4.field3785 || arg0.field1966 == var4.field3793 || arg0.field1966 == var4.field3789) {
            var3 = var2.field3975;
        } else if (arg0.field1966 == var4.field3759 || arg0.field1966 == var4.field3767 || arg0.field1966 == var4.field3774 || arg0.field1966 == var4.field3770) {
            var3 = var2.field4032;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lv;II)V")
    public final void method1955(class152 arg0, int arg1, int arg2) {
        if (arg1 != 26355) {
            this.method1955((class152) null, 119, -118);
        }
        while (true) {
            int var4 = arg0.method1111(255);
            if (var4 == 0) {
                field4554++;
                return;
            }
            this.method1951(arg0, -79, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1956(int arg0, int arg1, int arg2, int arg3) {
        if (!class5.method29(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class220.field3533[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class204.field3277) {
                    if (!class77.method565(var4, var6, var5)) {
                        return false;
                    }
                    if (!class77.method565(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class77.method565(var4, var7, var5)) {
                        return false;
                    }
                    if (!class77.method565(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class77.method565(var4, var8, var5)) {
                    return false;
                }
                if (!class77.method565(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class108.field1566) {
                    if (!class77.method565(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class77.method565(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class77.method565(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class77.method565(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class77.method565(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class77.method565(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class204.field3277) {
                    if (!class77.method565(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class77.method565(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class77.method565(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class77.method565(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class77.method565(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class77.method565(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class108.field1566) {
                    if (!class77.method565(var4, var6, var5)) {
                        return false;
                    }
                    if (!class77.method565(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class77.method565(var4, var7, var5)) {
                        return false;
                    }
                    if (!class77.method565(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class77.method565(var4, var8, var5)) {
                    return false;
                }
                if (!class77.method565(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class77.method565(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class77.method565(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class77.method565(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class77.method565(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class77.method565(var4, var8, var5);
        } else {
            return true;
        }
    }
}
