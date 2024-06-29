import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class91 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field1437 = 0;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Lvh;")
    public static class61 field1438;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)V", line = 8)
    public static final void method793(byte arg0, int arg1) {
        class320 var2 = class215.field3606.method736(arg0 + 51);
        if (arg0 != -49) {
            return;
        }
        while (var2 != null) {
            if ((long) arg1 == (var2.field5062 >> 48 & 0xFFFFL)) {
                var2.method2195(-1);
            }
            var2 = class215.field3606.method727((byte) -110);
        }
        field1439++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II[BB)I", line = 36)
    public static final int method794(int arg0, int arg1, byte[] arg2, byte arg3) {
        field1441++;
        int var4 = -1;
        int var5 = arg1;
        if (arg3 <= 36) {
            return -63;
        }
        while (var5 < arg0) {
            var4 = var4 >>> 8 ^ class48.field732[(arg2[var5] ^ var4) & 0xFF];
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLwc;)V", line = 77)
    public static final void method795(byte arg0, class116 arg1) {
        int var2 = -61 / ((-arg0 - 82) / 43);
        class346 var3 = arg1.method980((byte) 73);
        arg1.field2000 = var3.field5521;
        field1440++;
        if (arg1.field1957 == 0) {
            arg1.field2020 = 0;
            return;
        }
        if (arg1.field1998 != -1 && arg1.field1934 == 0) {
            class285 var4 = class346.method2428(arg1.field1998, (byte) -24);
            if (arg1.field2013 > 0 && var4.field4541 == 0) {
                arg1.field2020++;
                return;
            }
            if (arg1.field2013 <= 0 && var4.field4545 == 0) {
                arg1.field2020++;
                return;
            }
        }
        if (arg1.field1980 != -1 && class181.field3045 >= arg1.field2024) {
            class158 var5 = class271.method1851(arg1.field1980, 0);
            if (var5.field2803 && var5.field2793 != -1) {
                class285 var6 = class346.method2428(var5.field2793, (byte) -24);
                if (arg1.field2013 > 0 && var6.field4541 == 0) {
                    arg1.field2020++;
                    return;
                }
                if (arg1.field2013 <= 0 && var6.field4545 == 0) {
                    arg1.field2020++;
                    return;
                }
            }
        }
        int var7 = arg1.field2036;
        int var8 = arg1.field1985;
        int var9 = arg1.field1975[arg1.field1957 - 1] * 128 + arg1.method987(3047) * 64;
        int var10 = arg1.field2034[arg1.field1957 - 1] * 128 + (arg1.method987(3047) * 64);
        if ((var9 - var7) > 256 || (var9 - var7) < -256 || (var10 - var8) > 256 || var10 - var8 < -256) {
            arg1.field2036 = var9;
            arg1.field1985 = var10;
            return;
        }
        if (var9 <= var7) {
            if (var7 > var9) {
                if (var8 < var10) {
                    arg1.field1951 = 768;
                } else if (var8 > var10) {
                    arg1.field1951 = 256;
                } else {
                    arg1.field1951 = 512;
                }
            } else if (var10 > var8) {
                arg1.field1951 = 1024;
            } else if (var10 < var8) {
                arg1.field1951 = 0;
            }
        } else if (var10 > var8) {
            arg1.field1951 = 1280;
        } else if (var10 >= var8) {
            arg1.field1951 = 1536;
        } else {
            arg1.field1951 = 1792;
        }
        int var11 = arg1.field1951 - arg1.field1946 & 0x7FF;
        if (var11 > 1024) {
            var11 -= 2048;
        }
        int var12 = 4;
        int var13 = var3.field5491;
        boolean var14 = true;
        if (var11 >= -256 && var11 <= 256) {
            var13 = var3.field5492;
        } else if (var11 >= 256 && var11 < 768) {
            var13 = var3.field5500;
        } else if (var11 >= -768 && var11 <= -256) {
            var13 = var3.field5515;
        }
        if (var13 == -1) {
            var13 = var3.field5492;
        }
        arg1.field2000 = var13;
        if (arg1 instanceof class278) {
            var14 = ((class278) arg1).field4413.field188;
        }
        byte var15 = 1;
        if (var14) {
            if (arg1.field1951 != arg1.field1946 && arg1.field1941 == -1 && arg1.field1979 != 0) {
                var12 = 2;
            }
            if (arg1.field1957 > 2) {
                var12 = 6;
            }
            if (arg1.field1957 > 3) {
                var12 = 8;
            }
            if (arg1.field2020 > 0 && arg1.field1957 > 1) {
                arg1.field2020--;
                var12 = 8;
            }
        } else {
            if (arg1.field1957 > 1) {
                var12 = 6;
            }
            if (arg1.field1957 > 2) {
                var12 = 8;
            }
            if (arg1.field2020 > 0 && arg1.field1957 > 1) {
                var12 = 8;
                arg1.field2020--;
            }
        }
        if (arg1.field2037[arg1.field1957 - 1] == 2) {
            var12 <<= 0x1;
            var15 = 2;
        } else if (arg1.field2037[arg1.field1957 - 1] == 0) {
            var15 = 0;
            var12 >>= 0x1;
        }
        if (var12 < 8 || var3.field5503 == -1) {
            if (var3.field5522 != -1 && var15 == 0) {
                if (arg1.field2000 == var3.field5491 && var3.field5527 != -1) {
                    arg1.field2000 = var3.field5527;
                } else if (arg1.field2000 == var3.field5515 && var3.field5518 != -1) {
                    arg1.field2000 = var3.field5518;
                } else if (arg1.field2000 == var3.field5500 && var3.field5494 != -1) {
                    arg1.field2000 = var3.field5494;
                } else {
                    arg1.field2000 = var3.field5522;
                }
            }
        } else if (arg1.field2000 == var3.field5491 && var3.field5506 != -1) {
            arg1.field2000 = var3.field5506;
        } else if (arg1.field2000 == var3.field5515 && var3.field5499 != -1) {
            arg1.field2000 = var3.field5499;
        } else if (arg1.field2000 == var3.field5500 && var3.field5504 != -1) {
            arg1.field2000 = var3.field5504;
        } else {
            arg1.field2000 = var3.field5503;
        }
        if (var3.field5519 != -1) {
            int var16 = var12 << 7;
            if (arg1.field1957 == 1) {
                int var17 = arg1.field2001 * arg1.field2001;
                int var18 = (arg1.field2036 <= var9 ? var9 - arg1.field2036 : -var9 + arg1.field2036) << 7;
                int var19 = (var10 >= arg1.field1985 ? var10 - arg1.field1985 : -var10 + arg1.field1985) << 7;
                int var20 = var18 <= var19 ? var19 : var18;
                int var21 = var3.field5519 * var20 * 2;
                if (var21 < var17) {
                    arg1.field2001 /= 2;
                } else if ((var17 / 2) > var20) {
                    arg1.field2001 -= var3.field5519;
                    if (arg1.field2001 < 0) {
                        arg1.field2001 = 0;
                    }
                } else if (var16 > arg1.field2001) {
                    arg1.field2001 += var3.field5519;
                    if (var16 < arg1.field2001) {
                        arg1.field2001 = var16;
                    }
                }
            } else if (var16 > arg1.field2001) {
                arg1.field2001 += var3.field5519;
                if (var16 < arg1.field2001) {
                    arg1.field2001 = var16;
                }
            } else if (arg1.field2001 > 0) {
                arg1.field2001 -= var3.field5519;
                if (arg1.field2001 < 0) {
                    arg1.field2001 = 0;
                }
            }
            var12 = arg1.field2001 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var10 > var8) {
            arg1.field1985 += var12;
            if (arg1.field1985 > var10) {
                arg1.field1985 = var10;
            }
        } else if (var8 > var10) {
            arg1.field1985 -= var12;
            if (arg1.field1985 < var10) {
                arg1.field1985 = var10;
            }
        }
        if (var9 > var7) {
            arg1.field2036 += var12;
            if (arg1.field2036 > var9) {
                arg1.field2036 = var9;
            }
        } else if (var9 < var7) {
            arg1.field2036 -= var12;
            if (arg1.field2036 < var9) {
                arg1.field2036 = var9;
            }
        }
        if (arg1.field2036 == var9 && arg1.field1985 == var10) {
            if (arg1.field2013 > 0) {
                arg1.field2013--;
            }
            arg1.field1957--;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 516)
    public static void method796(int arg0) {
        field1438 = null;
        if (arg0 < 79) {
            field1438 = (class61) null;
        }
    }
}
