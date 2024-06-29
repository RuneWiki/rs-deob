import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class37 {

    @OriginalMember(owner = "client!vba", name = "q", descriptor = "Lhn;")
    public static class616 field450 = new class616();

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!vba", name = "j", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!vba", name = "l", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!vba", name = "m", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!vba", name = "n", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "client!vba", name = "o", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!vba", name = "p", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!vba", name = "r", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!vba", name = "s", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!vba", name = "t", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!vba", name = "u", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!vba", name = "v", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!vba", name = "w", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!vba", name = "x", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!vba", name = "y", descriptor = "I")
    public int field458;

    @OriginalMember(owner = "client!vba", name = "z", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "[[I")
    public int[][] field439;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIII)V", line = 7)
    private final void method226(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 75) {
            this.field439[arg3][arg1] = method245(this.field439[arg3][arg1], ~arg0);
            field442++;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V", line = 18)
    public static final void method227(byte arg0) {
        for (int var1 = 0; var1 < class146.field2114.length; var1++) {
            for (int var2 = 0; var2 < class146.field2114[0].length; var2++) {
                for (int var3 = 0; var3 < class146.field2114[0][0].length; var3++) {
                    class146.field2114[var1][var2][var3] = 0;
                }
            }
        }
        field456++;
        if (arg0 != 35) {
            method230(-41, 54);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIIIIIII)Z", line = 54)
    public final boolean method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field457++;
        int var10 = -38 / ((arg6 - 19) / 51);
        if (arg1 > 1) {
            return class11.method52(arg1, arg2, arg3, arg5, arg4, arg0, true, arg8, arg1) ? true : this.method243(arg3, arg4, arg1, arg7, arg1, arg5, arg2, 14004, arg8, arg0);
        }
        int var11 = arg2 + arg8 - 1;
        int var12 = arg4 + arg0 - 1;
        if (arg3 >= arg2 && var11 >= arg3 && arg0 <= arg5 && arg5 <= var12) {
            return true;
        } else if ((arg2 - 1) == arg3 && arg5 >= arg0 && arg5 <= var12 && (this.field439[arg3 - this.field435][arg5 - this.field458] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if ((var11 + 1) == arg3 && arg0 <= arg5 && arg5 <= var12 && (this.field439[arg3 - this.field435][arg5 - this.field458] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg0 - 1 == arg5 && arg2 <= arg3 && arg3 <= var11 && (this.field439[arg3 - this.field435][arg5 - this.field458] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return (var12 + 1) == arg5 && arg3 >= arg2 && var11 >= arg3 && (this.field439[arg3 - this.field435][arg5 - this.field458] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 95)
    public static final void method229(String arg0, int arg1) {
        System.out.println("Error: " + class6.method20(arg0, 97, "%0a", "\n"));
        if (arg1 == 1024) {
            field453++;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)Loa;", line = 108)
    public static final class597 method230(int arg0, int arg1) {
        field443++;
        if (arg0 == 0) {
            if ((double) class339.field4675 == 3.0D) {
                return class488.field6946;
            }
            if ((double) class339.field4675 == 4.0D) {
                return class268.field3815;
            }
            if ((double) class339.field4675 == 6.0D) {
                return class117.field1641;
            }
            if ((double) class339.field4675 >= 8.0D) {
                return class156.field2323;
            }
        } else if (arg0 == 1) {
            if ((double) class339.field4675 == 3.0D) {
                return class117.field1641;
            }
            if ((double) class339.field4675 == 4.0D) {
                return class156.field2323;
            }
            if ((double) class339.field4675 == 6.0D) {
                return class377.field5200;
            }
            if ((double) class339.field4675 >= 8.0D) {
                return class583.field8569;
            }
        } else if (arg0 == 2) {
            if ((double) class339.field4675 == 3.0D) {
                return class377.field5200;
            }
            if ((double) class339.field4675 == 4.0D) {
                return class583.field8569;
            }
            if ((double) class339.field4675 == 6.0D) {
                return class540.field8089;
            }
            if ((double) class339.field4675 >= 8.0D) {
                return class77.field1031;
            }
        }
        if (arg1 != 16074) {
            method232(null, -76, 50, -32, -9, 55);
        }
        return null;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V", line = 179)
    public final void method231(int arg0) {
        if (arg0 != -3995) {
            return;
        }
        for (int var2 = 0; var2 < this.field436; var2++) {
            for (int var3 = 0; var3 < this.field447; var3++) {
                if (var2 == 0 || var3 == 0 || this.field436 - 5 <= var2 || (this.field447 - 5) <= var3) {
                    this.field439[var2][var3] = -1;
                } else {
                    this.field439[var2][var3] = 2097152;
                }
            }
        }
        field445++;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lfw;IIIII)V", line = 210)
    public static final void method232(class51 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field594 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field597[var6] != null) {
                arg0.field594++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field594; var7++) {
            long var8 = class22.field219[arg1][arg2][arg3];
            while (var8 != 0L) {
                class420 var14 = class148.field2163[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field597[var7] == var14.field5683) {
                    continue label50;
                }
            }
            long var10 = class22.field219[arg1][arg4][arg5];
            while (var10 != 0L) {
                class420 var13 = class148.field2163[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field597[var7] == var13.field5683) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field594 - 1; var12++) {
                arg0.field597[var12] = arg0.field597[var12 + 1];
            }
            arg0.field594--;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(III)V", line = 269)
    public final void method233(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field458;
        int var5 = -64 / ((-arg1 - 77) / 37);
        field449++;
        int var6 = arg0 - this.field435;
        this.field439[var6][var4] = class473.method2847(this.field439[var6][var4], 262144);
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(III)V", line = 281)
    public final void method234(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field435;
        field438++;
        if (arg1 != -3) {
            field450 = null;
        }
        int var5 = arg0 - this.field458;
        this.field439[var4][var5] = method245(this.field439[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIB)V", line = 294)
    public final void method235(int arg0, int arg1, byte arg2) {
        field452++;
        int var4 = arg0 - this.field458;
        int var5 = arg1 - this.field435;
        this.field439[var5][var4] = method245(this.field439[var5][var4], -2097153);
        if (arg2 != 27) {
            this.field439 = null;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZIIIZII)V", line = 314)
    public final void method236(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg3 - this.field458;
        int var9 = arg5 - this.field435;
        field440++;
        if (arg6 == 0) {
            if (arg1 == 0) {
                this.method226(128, var8, 118, var9);
                this.method226(8, var8, 111, var9 - 1);
            }
            if (arg1 == 1) {
                this.method226(2, var8, 110, var9);
                this.method226(32, var8 + 1, 99, var9);
            }
            if (arg1 == 2) {
                this.method226(8, var8, 94, var9);
                this.method226(128, var8, 92, var9 + 1);
            }
            if (arg1 == 3) {
                this.method226(32, var8, 108, var9);
                this.method226(2, var8 - 1, 115, var9);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg1 == 0) {
                this.method226(1, var8, 112, var9);
                this.method226(16, var8 + 1, 98, var9 - 1);
            }
            if (arg1 == 1) {
                this.method226(4, var8, 92, var9);
                this.method226(64, var8 + 1, 106, var9 + 1);
            }
            if (arg1 == 2) {
                this.method226(16, var8, 112, var9);
                this.method226(1, var8 - 1, 120, var9 + 1);
            }
            if (arg1 == 3) {
                this.method226(64, var8, 95, var9);
                this.method226(4, var8 - 1, 78, var9 - 1);
            }
        }
        if (arg6 == 2) {
            if (arg1 == 0) {
                this.method226(130, var8, 120, var9);
                this.method226(8, var8, 123, var9 - 1);
                this.method226(32, var8 + 1, 107, var9);
            }
            if (arg1 == 1) {
                this.method226(10, var8, 126, var9);
                this.method226(32, var8 + 1, 120, var9);
                this.method226(128, var8, 82, var9 + 1);
            }
            if (arg1 == 2) {
                this.method226(40, var8, 89, var9);
                this.method226(128, var8, 89, var9 + 1);
                this.method226(2, var8 - 1, 78, var9);
            }
            if (arg1 == 3) {
                this.method226(160, var8, 121, var9);
                this.method226(2, var8 - 1, 114, var9);
                this.method226(8, var8, 96, var9 - 1);
            }
        }
        if (arg4) {
            if (arg6 == 0) {
                if (arg1 == 0) {
                    this.method226(65536, var8, 119, var9);
                    this.method226(4096, var8, 122, var9 - 1);
                }
                if (arg1 == 1) {
                    this.method226(1024, var8, 119, var9);
                    this.method226(16384, var8 + 1, 87, var9);
                }
                if (arg1 == 2) {
                    this.method226(4096, var8, 112, var9);
                    this.method226(65536, var8, 98, var9 + 1);
                }
                if (arg1 == 3) {
                    this.method226(16384, var8, 119, var9);
                    this.method226(1024, var8 - 1, 115, var9);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg1 == 0) {
                    this.method226(512, var8, 81, var9);
                    this.method226(8192, var8 + 1, 120, var9 - 1);
                }
                if (arg1 == 1) {
                    this.method226(2048, var8, 116, var9);
                    this.method226(32768, var8 + 1, 91, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method226(8192, var8, 95, var9);
                    this.method226(512, var8 - 1, 112, var9 + 1);
                }
                if (arg1 == 3) {
                    this.method226(32768, var8, 114, var9);
                    this.method226(2048, var8 - 1, 105, var9 - 1);
                }
            }
            if (arg6 == 2) {
                if (arg1 == 0) {
                    this.method226(66560, var8, 121, var9);
                    this.method226(4096, var8, 123, var9 - 1);
                    this.method226(16384, var8 + 1, 109, var9);
                }
                if (arg1 == 1) {
                    this.method226(5120, var8, 107, var9);
                    this.method226(16384, var8 + 1, 85, var9);
                    this.method226(65536, var8, 76, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method226(20480, var8, 85, var9);
                    this.method226(65536, var8, 90, var9 + 1);
                    this.method226(1024, var8 - 1, 110, var9);
                }
                if (arg1 == 3) {
                    this.method226(81920, var8, 126, var9);
                    this.method226(1024, var8 - 1, 90, var9);
                    this.method226(4096, var8, 76, var9 - 1);
                }
            }
        }
        if (arg0) {
            if (arg6 == 0) {
                if (arg1 == 0) {
                    this.method226(536870912, var8, 124, var9);
                    this.method226(33554432, var8, 105, var9 - 1);
                }
                if (arg1 == 1) {
                    this.method226(8388608, var8, 99, var9);
                    this.method226(134217728, var8 + 1, 124, var9);
                }
                if (arg1 == 2) {
                    this.method226(33554432, var8, 123, var9);
                    this.method226(536870912, var8, 94, var9 + 1);
                }
                if (arg1 == 3) {
                    this.method226(134217728, var8, 80, var9);
                    this.method226(8388608, var8 - 1, 127, var9);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg1 == 0) {
                    this.method226(4194304, var8, 93, var9);
                    this.method226(67108864, var8 + 1, 110, var9 - 1);
                }
                if (arg1 == 1) {
                    this.method226(16777216, var8, 81, var9);
                    this.method226(268435456, var8 + 1, 109, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method226(67108864, var8, 84, var9);
                    this.method226(4194304, var8 - 1, 127, var9 + 1);
                }
                if (arg1 == 3) {
                    this.method226(268435456, var8, 81, var9);
                    this.method226(16777216, var8 - 1, 107, var9 - 1);
                }
            }
            if (arg6 == 2) {
                if (arg1 == 0) {
                    this.method226(545259520, var8, 110, var9);
                    this.method226(33554432, var8, 97, var9 - 1);
                    this.method226(134217728, var8 + 1, 118, var9);
                }
                if (arg1 == 1) {
                    this.method226(41943040, var8, 127, var9);
                    this.method226(134217728, var8 + 1, 94, var9);
                    this.method226(536870912, var8, 118, var9 + 1);
                }
                if (arg1 == 2) {
                    this.method226(167772160, var8, 91, var9);
                    this.method226(536870912, var8, 80, var9 + 1);
                    this.method226(8388608, var8 - 1, 91, var9);
                }
                if (arg1 == 3) {
                    this.method226(671088640, var8, 109, var9);
                    this.method226(8388608, var8 - 1, 109, var9);
                    this.method226(33554432, var8, 99, var9 - 1);
                }
            }
        }
        if (arg2 <= 77) {
            this.method243(-6, 16, -5, -17, -50, 14, 40, 121, 52, -51);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIIIIII)Z", line = 624)
    public final boolean method237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field459++;
        if (arg0 == 1) {
            if (arg3 == arg7 && arg1 == arg2) {
                return true;
            }
        } else if (arg3 >= arg7 && arg0 + arg7 - 1 >= arg3 && arg2 <= arg2 && arg2 <= arg2 + arg0 - 1) {
            return true;
        }
        int var9 = arg3 - this.field435;
        int var10 = arg2 - this.field458;
        int var11 = arg7 - this.field435;
        int var12 = arg1 - this.field458;
        if (arg4 != -24088) {
            this.field458 = 107;
        }
        if (arg0 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if (var9 + 1 == var11 && var10 == var12 && (this.field439[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field439[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field439[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field439[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field439[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field439[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 + 1 == var11 && var10 == var12 && (this.field439[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field439[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var9 == var11 && var10 + 1 == var12 && (this.field439[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var10 - 1) == var12 && (this.field439[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var11 && var10 == var12 && (this.field439[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var10 == var12 && (this.field439[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var11 - 1;
            int var14 = var12 - (1 - arg0);
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg6 = arg6 + 2 & 0x3;
                }
                if (arg6 == 0) {
                    if ((var9 + 1) == var11 && var12 <= var10 && var14 >= var10 && (this.field439[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && (var10 - arg0) == var12 && (this.field439[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var9 - arg0) == var11 && var10 >= var12 && var14 >= var10 && (this.field439[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var10 - arg0 == var12 && (this.field439[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if ((var9 - arg0) == var11 && var10 >= var12 && var10 <= var14 && (this.field439[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && (var10 + 1) == var12 && (this.field439[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if ((var9 + 1) == var11 && var10 >= var12 && var10 <= var14 && (this.field439[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var10 + 1) == var12 && (this.field439[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var11 <= var9 && var13 >= var9 && (var10 + 1) == var12 && (this.field439[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var11 <= var9 && var13 >= var9 && (var10 - arg0) == var12 && (this.field439[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - arg0) == var11 && var10 >= var12 && var14 >= var10 && (this.field439[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var12 <= var10 && var10 <= var14 && (this.field439[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZIII)V", line = 809)
    private final void method238(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            this.field458 = 95;
        }
        field444++;
        this.field439[arg3][arg1] = class473.method2847(this.field439[arg3][arg1], arg2);
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIZIZIB)V", line = 824)
    public final void method239(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, byte arg6) {
        int var8 = arg5 - this.field458;
        int var9 = arg1 - this.field435;
        if (arg6 != -62) {
            field450 = null;
        }
        field448++;
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method238(false, var8, 128, var9);
                this.method238(false, var8, 8, var9 - 1);
            }
            if (arg0 == 1) {
                this.method238(false, var8, 2, var9);
                this.method238(false, var8 + 1, 32, var9);
            }
            if (arg0 == 2) {
                this.method238(false, var8, 8, var9);
                this.method238(false, var8, 128, var9 + 1);
            }
            if (arg0 == 3) {
                this.method238(false, var8, 32, var9);
                this.method238(false, var8 - 1, 2, var9);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method238(false, var8, 1, var9);
                this.method238(false, var8 + 1, 16, var9 - 1);
            }
            if (arg0 == 1) {
                this.method238(false, var8, 4, var9);
                this.method238(false, var8 + 1, 64, var9 + 1);
            }
            if (arg0 == 2) {
                this.method238(false, var8, 16, var9);
                this.method238(false, var8 - 1, 1, var9 + 1);
            }
            if (arg0 == 3) {
                this.method238(false, var8, 64, var9);
                this.method238(false, var8 - 1, 4, var9 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg0 == 0) {
                this.method238(false, var8, 130, var9);
                this.method238(false, var8, 8, var9 - 1);
                this.method238(false, var8 + 1, 32, var9);
            }
            if (arg0 == 1) {
                this.method238(false, var8, 10, var9);
                this.method238(false, var8 + 1, 32, var9);
                this.method238(false, var8, 128, var9 + 1);
            }
            if (arg0 == 2) {
                this.method238(false, var8, 40, var9);
                this.method238(false, var8, 128, var9 + 1);
                this.method238(false, var8 - 1, 2, var9);
            }
            if (arg0 == 3) {
                this.method238(false, var8, 160, var9);
                this.method238(false, var8 - 1, 2, var9);
                this.method238(false, var8, 8, var9 - 1);
            }
        }
        if (arg4) {
            if (arg3 == 0) {
                if (arg0 == 0) {
                    this.method238(false, var8, 65536, var9);
                    this.method238(false, var8, 4096, var9 - 1);
                }
                if (arg0 == 1) {
                    this.method238(false, var8, 1024, var9);
                    this.method238(false, var8 + 1, 16384, var9);
                }
                if (arg0 == 2) {
                    this.method238(false, var8, 4096, var9);
                    this.method238(false, var8, 65536, var9 + 1);
                }
                if (arg0 == 3) {
                    this.method238(false, var8, 16384, var9);
                    this.method238(false, var8 - 1, 1024, var9);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg0 == 0) {
                    this.method238(false, var8, 512, var9);
                    this.method238(false, var8 + 1, 8192, var9 - 1);
                }
                if (arg0 == 1) {
                    this.method238(false, var8, 2048, var9);
                    this.method238(false, var8 + 1, 32768, var9 + 1);
                }
                if (arg0 == 2) {
                    this.method238(false, var8, 8192, var9);
                    this.method238(false, var8 - 1, 512, var9 + 1);
                }
                if (arg0 == 3) {
                    this.method238(false, var8, 32768, var9);
                    this.method238(false, var8 - 1, 2048, var9 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg0 == 0) {
                    this.method238(false, var8, 66560, var9);
                    this.method238(false, var8, 4096, var9 - 1);
                    this.method238(false, var8 + 1, 16384, var9);
                }
                if (arg0 == 1) {
                    this.method238(false, var8, 5120, var9);
                    this.method238(false, var8 + 1, 16384, var9);
                    this.method238(false, var8, 65536, var9 + 1);
                }
                if (arg0 == 2) {
                    this.method238(false, var8, 20480, var9);
                    this.method238(false, var8, 65536, var9 + 1);
                    this.method238(false, var8 - 1, 1024, var9);
                }
                if (arg0 == 3) {
                    this.method238(false, var8, 81920, var9);
                    this.method238(false, var8 - 1, 1024, var9);
                    this.method238(false, var8, 4096, var9 - 1);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 == 0) {
                this.method238(false, var8, 536870912, var9);
                this.method238(false, var8, 33554432, var9 - 1);
            }
            if (arg0 == 1) {
                this.method238(false, var8, 8388608, var9);
                this.method238(false, var8 + 1, 134217728, var9);
            }
            if (arg0 == 2) {
                this.method238(false, var8, 33554432, var9);
                this.method238(false, var8, 536870912, var9 + 1);
            }
            if (arg0 == 3) {
                this.method238(false, var8, 134217728, var9);
                this.method238(false, var8 - 1, 8388608, var9);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg0 == 0) {
                this.method238(false, var8, 4194304, var9);
                this.method238(false, var8 + 1, 67108864, var9 - 1);
            }
            if (arg0 == 1) {
                this.method238(false, var8, 16777216, var9);
                this.method238(false, var8 + 1, 268435456, var9 + 1);
            }
            if (arg0 == 2) {
                this.method238(false, var8, 67108864, var9);
                this.method238(false, var8 - 1, 4194304, var9 + 1);
            }
            if (arg0 == 3) {
                this.method238(false, var8, 268435456, var9);
                this.method238(false, var8 - 1, 16777216, var9 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method238(false, var8, 545259520, var9);
            this.method238(false, var8, 33554432, var9 - 1);
            this.method238(false, var8 + 1, 134217728, var9);
        }
        if (arg0 == 1) {
            this.method238(false, var8, 41943040, var9);
            this.method238(false, var8 + 1, 134217728, var9);
            this.method238(false, var8, 536870912, var9 + 1);
        }
        if (arg0 == 2) {
            this.method238(false, var8, 167772160, var9);
            this.method238(false, var8, 536870912, var9 + 1);
            this.method238(false, var8 - 1, 8388608, var9);
        }
        if (arg0 == 3) {
            this.method238(false, var8, 671088640, var9);
            this.method238(false, var8 - 1, 8388608, var9);
            this.method238(false, var8, 33554432, var9 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IBZIZII)V", line = 1127)
    public final void method240(int arg0, byte arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field441++;
        int var8 = 256;
        if (arg2) {
            var8 |= 0x20000;
        }
        int var9 = arg0 - this.field435;
        if (arg4) {
            var8 |= 0x40000000;
        }
        if (arg1 != 80) {
            return;
        }
        int var10 = arg6 - this.field458;
        for (int var11 = var9; var11 < arg3 + var9; var11++) {
            if (var11 >= 0 && this.field436 > var11) {
                for (int var12 = var10; var12 < arg5 + var10; var12++) {
                    if (var12 >= 0 && var12 < this.field447) {
                        this.method238(false, var12, var8, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(IIIIIIII)Z", line = 1176)
    public final boolean method241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field451++;
        if (arg2 == 1) {
            if (arg4 == arg6 && arg0 == arg1) {
                return true;
            }
        } else if (arg4 >= arg6 && arg2 + arg6 - 1 >= arg4 && arg0 <= arg0 && (arg0 + arg2 - 1) >= arg0) {
            return true;
        }
        int var9 = arg4 - this.field435;
        int var10 = arg1 - this.field458;
        int var11 = arg6 - this.field435;
        int var12 = arg0 - this.field458;
        if (arg2 == 1) {
            if (arg5 == 0) {
                if (arg3 == 0) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field439[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field439[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var9 == var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field439[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field439[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field439[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field439[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field439[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field439[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field439[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field439[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field439[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field439[var11][var10] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field439[var11][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field439[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field439[var11][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field439[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var9 == var11 && (var12 + 1) == var10 && (this.field439[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field439[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var11 && var10 == var12 && (this.field439[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var10 == var12 && (this.field439[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg2 - 1;
            int var14 = arg2 + var10 - 1;
            if (arg5 == 0) {
                if (arg3 == 0) {
                    if ((var9 - arg2) == var11 && var12 >= var10 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var12 + 1 == var10 && (this.field439[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var12 - arg2) == var10 && (this.field439[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 <= var9 && var9 <= var13 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var9 - arg2 == var11 && var12 >= var10 && var12 <= var14 && (this.field439[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 <= var12 && var12 <= var14 && (this.field439[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var9 + 1 == var11 && var12 >= var10 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var12 + 1 == var10 && (this.field439[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var12 - arg2 == var10 && (this.field439[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 >= var11 && var9 <= var13 && (var12 - arg2) == var10) {
                        return true;
                    }
                    if (var9 - arg2 == var11 && var10 <= var12 && var14 >= var12 && (this.field439[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 <= var12 && var14 >= var12 && (this.field439[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg3 == 0) {
                    if ((var9 - arg2) == var11 && var12 >= var10 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 <= var12 && var12 <= var14 && (this.field439[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var12 - arg2) == var10 && (this.field439[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var9 - arg2) == var11 && var10 <= var12 && var14 >= var12 && (this.field439[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var12 - arg2) == var10 && (this.field439[var9][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var9 - arg2) == var11 && var10 <= var12 && var12 <= var14 && (this.field439[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var12 + 1 == var10 && (this.field439[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var12 - arg2 == var10) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var9 - arg2 == var11 && var12 >= var10 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var12 + 1) == var10 && (this.field439[var9][var10] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 <= var12 && var12 <= var14 && (this.field439[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var12 - arg2) == var10) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var11 <= var9 && var9 <= var13 && var12 + 1 == var10 && (this.field439[var9][var10] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var9 && var9 <= var13 && (var12 - arg2) == var10 && (this.field439[var9][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var9 - arg2 == var11 && var10 <= var12 && var14 >= var12 && (this.field439[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var10 <= var12 && var12 <= var14 && (this.field439[var11][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg7 != 128) {
            method230(75, 54);
        }
        return false;
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)V", line = 1551)
    public static void method242(int arg0) {
        field450 = null;
        if (arg0 != 0) {
            field450 = null;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIIIIIIII)Z", line = 1578)
    public final boolean method243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field446++;
        int var11 = arg0 + arg4;
        int var12 = arg2 + arg5;
        if (arg7 != 14004) {
            field450 = null;
        }
        int var13 = arg6 + arg8;
        int var14 = arg1 + arg9;
        if (arg0 == var13 && (arg3 & 0x2) == 0) {
            int var15 = arg9 >= arg5 ? arg9 : arg5;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field439[var13 - this.field435 - 1][var15 - this.field458] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg6 == var11 && (arg3 & 0x8) == 0) {
            int var17 = arg9 >= arg5 ? arg9 : arg5;
            int var18 = var12 < var14 ? var12 : var14;
            while (var18 > var17) {
                if ((this.field439[arg6 - this.field435][var17 - this.field458] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg5 == var14 && (arg3 & 0x1) == 0) {
            int var19 = arg0 <= arg6 ? arg6 : arg0;
            int var20 = var13 <= var11 ? var13 : var11;
            while (var19 < var20) {
                if ((this.field439[var19 - this.field435][var14 - this.field458 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg9 == var12 && (arg3 & 0x4) == 0) {
            int var21 = arg6 < arg0 ? arg0 : arg6;
            int var22 = var13 > var11 ? var11 : var13;
            while (var22 > var21) {
                if ((this.field439[var21 - this.field435][arg9 - this.field458] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIIIZZIB)V", line = 1671)
    public final void method244(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, byte arg7) {
        field437++;
        int var9 = 256;
        if (arg4) {
            var9 |= 0x20000;
        }
        if (arg1 == 1 || arg1 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        if (arg5) {
            var9 |= 0x40000000;
        }
        if (arg7 < 65) {
            this.method226(-83, 99, -17, -90);
        }
        int var11 = arg0 - this.field458;
        int var12 = arg6 - this.field435;
        for (int var13 = var12; var13 < (arg2 + var12); var13++) {
            if (var13 >= 0 && this.field436 > var13) {
                for (int var14 = var11; var14 < (arg3 + var11); var14++) {
                    if (var14 >= 0 && this.field447 > var14) {
                        this.method226(var9, var14, 83, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(II)I", line = 1728)
    public static int method245(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IBI)V", line = 1738)
    public final void method246(int arg0, byte arg1, int arg2) {
        if (arg1 == 27) {
            field434++;
            int var4 = arg0 - this.field458;
            int var5 = arg2 - this.field435;
            this.field439[var5][var4] = class473.method2847(this.field439[var5][var4], 2097152);
        }
    }
}
