import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class271 {

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field4090 = 0;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "[I")
    public static int[] field4094 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field4098 = 0;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field4092 = 0;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field4097 = new String[500];

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Lad;")
    public static class128 field4085 = new class128();

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "[I")
    public static int[] field4096;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "[Lbb;")
    public static class91[] field4095;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Loa;I)V", line = 11)
    public static final void method1883(class288 arg0, int arg1) {
        field4093++;
        class132 var2 = arg0.method2030(-13196);
        arg0.field4527 = var2.field2084;
        int var3 = 105 / ((arg1 - 37) / 59);
        if (arg0.field4453 == 0) {
            arg0.field4495 = 0;
            return;
        }
        if (arg0.field4439 != -1 && arg0.field4437 == 0) {
            class162 var4 = class173.method1259((byte) 119, arg0.field4439);
            if (arg0.field4528 > 0 && var4.field2426 == 0) {
                arg0.field4495++;
                return;
            }
            if (arg0.field4528 <= 0 && var4.field2424 == 0) {
                arg0.field4495++;
                return;
            }
        }
        int var5 = arg0.field4496;
        int var6 = arg0.field4507;
        int var7 = arg0.field4477[arg0.field4453 - 1] * 128 + (arg0.method929(12) * 64);
        int var8 = arg0.field4470[arg0.field4453 - 1] * 128 + (arg0.method929(12) * 64);
        if (var7 - var6 > 256 || var7 - var6 < -256 || (var8 - var5) > 256 || var8 - var5 < -256) {
            arg0.field4507 = var7;
            arg0.field4496 = var8;
            return;
        }
        if (var6 < var7) {
            if (var8 > var5) {
                arg0.field4497 = 1280;
            } else if (var8 < var5) {
                arg0.field4497 = 1792;
            } else {
                arg0.field4497 = 1536;
            }
        } else if (var7 < var6) {
            if (var8 > var5) {
                arg0.field4497 = 768;
            } else if (var5 > var8) {
                arg0.field4497 = 256;
            } else {
                arg0.field4497 = 512;
            }
        } else if (var8 > var5) {
            arg0.field4497 = 1024;
        } else if (var8 < var5) {
            arg0.field4497 = 0;
        }
        int var9 = var2.field2046;
        int var10 = 4;
        int var11 = arg0.field4497 - arg0.field4438 & 0x7FF;
        if (var11 > 1024) {
            var11 -= 2048;
        }
        boolean var12 = true;
        if (var11 >= -256 && var11 <= 256) {
            var9 = var2.field2055;
        } else if (var11 >= 256 && var11 < 768) {
            var9 = var2.field2077;
        } else if (var11 >= -768 && var11 <= -256) {
            var9 = var2.field2080;
        }
        if (var9 == -1) {
            var9 = var2.field2055;
        }
        arg0.field4527 = var9;
        byte var13 = 1;
        if (arg0 instanceof class45) {
            var12 = ((class45) arg0).field698.field2760;
        }
        if (var12) {
            if (arg0.field4497 != arg0.field4438 && arg0.field4494 == -1 && arg0.field4443 != 0) {
                var10 = 2;
            }
            if (arg0.field4453 > 2) {
                var10 = 6;
            }
            if (arg0.field4453 > 3) {
                var10 = 8;
            }
            if (arg0.field4495 > 0 && arg0.field4453 > 1) {
                var10 = 8;
                arg0.field4495--;
            }
        } else {
            if (arg0.field4453 > 1) {
                var10 = 6;
            }
            if (arg0.field4453 > 2) {
                var10 = 8;
            }
            if (arg0.field4495 > 0 && arg0.field4453 > 1) {
                arg0.field4495--;
                var10 = 8;
            }
        }
        if (arg0.field4501[arg0.field4453 - 1] == 2) {
            var13 = 2;
            var10 <<= 0x1;
        } else if (arg0.field4501[arg0.field4453 - 1] == 0) {
            var13 = 0;
            var10 >>= 0x1;
        }
        if (var10 < 8 || var2.field2072 == -1) {
            if (var2.field2048 != -1 && var13 == 0) {
                if (arg0.field4527 == var2.field2046 && var2.field2071 != -1) {
                    arg0.field4527 = var2.field2071;
                } else if (arg0.field4527 == var2.field2080 && var2.field2078 != -1) {
                    arg0.field4527 = var2.field2078;
                } else if (arg0.field4527 == var2.field2077 && var2.field2079 != -1) {
                    arg0.field4527 = var2.field2079;
                } else {
                    arg0.field4527 = var2.field2048;
                }
            }
        } else if (arg0.field4527 == var2.field2046 && var2.field2081 != -1) {
            arg0.field4527 = var2.field2081;
        } else if (arg0.field4527 == var2.field2080 && var2.field2075 != -1) {
            arg0.field4527 = var2.field2075;
        } else if (arg0.field4527 == var2.field2077 && var2.field2065 != -1) {
            arg0.field4527 = var2.field2065;
        } else {
            arg0.field4527 = var2.field2072;
        }
        if (var2.field2063 != -1) {
            int var14 = var10 << 7;
            if (arg0.field4453 == 1) {
                int var15 = arg0.field4487 * arg0.field4487;
                int var16 = (arg0.field4507 > var7 ? arg0.field4507 - var7 : -arg0.field4507 + var7) << 7;
                int var17 = (arg0.field4496 > var8 ? arg0.field4496 - var8 : -arg0.field4496 + var8) << 7;
                int var18 = var16 <= var17 ? var17 : var16;
                int var19 = var2.field2063 * 2 * var18;
                if (var15 > var19) {
                    arg0.field4487 /= 2;
                } else if ((var15 / 2) > var18) {
                    arg0.field4487 -= var2.field2063;
                    if (arg0.field4487 < 0) {
                        arg0.field4487 = 0;
                    }
                } else if (arg0.field4487 < var14) {
                    arg0.field4487 += var2.field2063;
                    if (var14 < arg0.field4487) {
                        arg0.field4487 = var14;
                    }
                }
            } else if (arg0.field4487 < var14) {
                arg0.field4487 += var2.field2063;
                if (arg0.field4487 > var14) {
                    arg0.field4487 = var14;
                }
            } else if (arg0.field4487 > 0) {
                arg0.field4487 -= var2.field2063;
                if (arg0.field4487 < 0) {
                    arg0.field4487 = 0;
                }
            }
            var10 = arg0.field4487 >> 7;
            if (var10 < 1) {
                var10 = 1;
            }
        }
        if (var6 < var7) {
            arg0.field4507 += var10;
            if (var7 < arg0.field4507) {
                arg0.field4507 = var7;
            }
        } else if (var7 < var6) {
            arg0.field4507 -= var10;
            if (var7 > arg0.field4507) {
                arg0.field4507 = var7;
            }
        }
        if (var5 < var8) {
            arg0.field4496 += var10;
            if (arg0.field4496 > var8) {
                arg0.field4496 = var8;
            }
        } else if (var8 < var5) {
            arg0.field4496 -= var10;
            if (arg0.field4496 < var8) {
                arg0.field4496 = var8;
            }
        }
        if (arg0.field4507 == var7 && arg0.field4496 == var8) {
            if (arg0.field4528 > 0) {
                arg0.field4528--;
            }
            arg0.field4453--;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLek;I)I", line = 342)
    public static final int method1884(byte arg0, class184 arg1, int arg2) {
        field4089++;
        if (arg0 <= 13) {
            method1888(-80, (byte) 5);
        }
        if (!client.method1764(arg1).method1928(arg2, (byte) -60) && arg1.field2868 == null) {
            return -1;
        } else if (arg1.field2918 == null || arg2 >= arg1.field2918.length) {
            return -1;
        } else {
            return arg1.field2918[arg2];
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V", line = 365)
    public static final void method1885(int arg0, int arg1) {
        field4086++;
        class147 var2 = class92.method731(-29125, arg0, arg1);
        var2.method1099(-71);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 383)
    public static void method1886(byte arg0) {
        field4094 = null;
        field4095 = null;
        field4096 = null;
        field4085 = null;
        if (arg0 > 73) {
            field4097 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)Lab;", line = 398)
    public static final class147 method1887(byte arg0) {
        if (arg0 < 55) {
            field4095 = (class91[]) null;
        }
        field4087++;
        class147 var1 = (class147) class230.field3563.method1077(18667);
        if (var1 != null) {
            var1.method1554((byte) -42);
            var1.method713((byte) 62);
            return var1;
        }
        class147 var2;
        do {
            var2 = (class147) class227.field3508.method1077(18667);
            if (var2 == null) {
                return null;
            }
            if (var2.method1100(false) > class234.method1650((byte) 34)) {
                return null;
            }
            var2.method1554((byte) -96);
            var2.method713((byte) 67);
        } while ((Long.MIN_VALUE & var2.field1262) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)V", line = 450)
    public static final void method1888(int arg0, byte arg1) {
        if (!class287.field4432) {
            arg0 = -1;
        }
        field4088++;
        if (class91.field1321 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class110 var2 = class297.method2094(-94, arg0);
            class134 var3 = var2.method876((byte) 70);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class301.field4715.method177(var3.field311, class171.field2548, new Point(var2.field1748, var2.field1740), var3.field316, var3.method1029(), true);
                class91.field1321 = arg0;
            }
        }
        if (arg0 == -1 && class91.field1321 != -1) {
            class301.field4715.method177(-1, class171.field2548, new Point(), -1, (int[]) null, true);
            class91.field1321 = -1;
        }
        if (arg1 != -96) {
            method1886((byte) 95);
        }
    }
}
