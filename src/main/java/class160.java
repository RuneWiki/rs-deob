import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class160 {

    @OriginalMember(owner = "client!la", name = "b", descriptor = "Lha;")
    public static class46 field2825 = class271.method1828("null", -46);

    @OriginalMember(owner = "client!la", name = "f", descriptor = "Lha;")
    private static class46 field2829 = class271.method1828("Loaded world list data", -46);

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Lha;")
    public static class46 field2827 = field2829;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)Lbj;")
    public static final class190 method1169(int arg0) {
        if (arg0 != 32) {
            method1171(true);
        }
        field2830++;
        try {
            return (class190) Class.forName("ak").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BIZILhi;)V")
    public static final void method1170(byte arg0, int arg1, boolean arg2, int arg3, class24 arg4) {
        int var5 = arg4.field468;
        field2828++;
        if (arg4.field464 == 0) {
            arg4.field468 = arg4.field467;
        } else if (arg4.field464 == 1) {
            arg4.field468 = arg3 - arg4.field467;
        } else if (arg4.field464 == 2) {
            arg4.field468 = arg4.field467 * arg3 >> 14;
        } else if (arg4.field464 == 3) {
            if (arg4.field485 == 2) {
                arg4.field468 = (arg4.field467 - 1) * arg4.field463 + arg4.field467 * 32;
            } else if (arg4.field485 == 7) {
                arg4.field468 = (arg4.field467 - 1) * arg4.field463 + arg4.field467 * 115;
            }
        }
        int var6 = arg4.field341;
        if (arg4.field474 == 0) {
            arg4.field341 = arg4.field461;
        } else if (arg4.field474 == 1) {
            arg4.field341 = arg1 - arg4.field461;
        } else if (arg4.field474 == 2) {
            arg4.field341 = arg4.field461 * arg1 >> 14;
        } else if (arg4.field474 == 3) {
            if (arg4.field485 == 2) {
                arg4.field341 = (arg4.field461 - 1) * arg4.field388 + arg4.field461 * 32;
            } else if (arg4.field485 == 7) {
                arg4.field341 = (arg4.field461 - 1) * arg4.field388 + arg4.field461 * 12;
            }
        }
        if (arg4.field464 == 4) {
            arg4.field468 = arg4.field423 * arg4.field341 / arg4.field409;
        }
        if (arg4.field474 == 4) {
            arg4.field341 = arg4.field468 * arg4.field409 / arg4.field423;
        }
        int var7 = -39 % ((arg0 - 8) / 45);
        if (class40.field701 && (client.method1811(arg4) != 0 || arg4.field485 == 0)) {
            if (arg4.field341 < 5 && arg4.field468 < 5) {
                arg4.field468 = 5;
                arg4.field341 = 5;
            } else {
                if (arg4.field341 <= 0) {
                    arg4.field341 = 5;
                }
                if (arg4.field468 <= 0) {
                    arg4.field468 = 5;
                }
            }
        }
        if (arg4.field407 == 1337) {
            class240.field4277 = arg4;
        }
        if (arg2 && arg4.field406 != null && arg4.field468 != var5 || arg4.field341 != var6) {
            class275 var8 = new class275();
            var8.field4796 = arg4.field406;
            var8.field4792 = arg4;
            class271.field4727.method265(var8, -501);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
    public static final void method1171(boolean arg0) {
        if (class207.field3710 < 128) {
            class207.field3710 = 128;
        }
        if (class207.field3710 > 383) {
            class207.field3710 = 383;
        }
        class249.field4414 &= 0x7FF;
        int var1 = class147.field2647 >> 7;
        field2826++;
        int var2 = class134.field2429 >> 7;
        int var3 = 0;
        int var4 = class206.method1461(class134.field2429, class135.field2450, class147.field2647, 4);
        if (arg0) {
            field2825 = null;
        }
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class135.field2450;
                    if (var7 < 3 && (class111.field2081[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var4 - class119.field2228[var7][var5][var6];
                    if (var8 > var3) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class60.field999) {
            class60.field999 += (var9 - class60.field999) / 24;
        } else if (class60.field999 > var9) {
            class60.field999 += (var9 - class60.field999) / 80;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIB)V")
    public static final void method1172(int arg0, int arg1, int arg2, byte arg3) {
        field2824++;
        class146 var4 = class6.method22((byte) 16, 4, arg0);
        var4.method1088(11102);
        var4.field2637 = arg2;
        if (arg3 < 56) {
            method1172(5, 51, -56, (byte) -68);
        }
        var4.field2640 = arg1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method1173(byte arg0) {
        field2825 = null;
        if (arg0 != 0) {
            field2825 = null;
        }
        field2827 = null;
        field2829 = null;
    }
}
