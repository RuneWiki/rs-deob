import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class155 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    private int field2699;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    private int field2722;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    private int field2709;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    private int field2705;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "[[I")
    public int[][] field2721;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "Lqk;")
    public static class207 field2713 = class24.method212(255, "logo");

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "[I")
    public static int[] field2726 = new int[99];

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "Lqk;")
    public static class207 field2730;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "Lnk;")
    public static class127 field2729;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "Lpk;")
    public static class99 field2724;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method1118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2716++;
        if (arg9 != 65536) {
            return false;
        }
        int var11 = arg8 + arg0;
        int var12 = arg2 + arg1;
        int var13 = arg4 + arg5;
        int var14 = arg3 + arg6;
        if (arg2 <= arg8 && var12 > arg8) {
            if (arg3 == var13 && (arg7 & 0x4) == 0) {
                int var15 = var11 > var12 ? var12 : var11;
                for (int var16 = arg8; var16 < var15; var16++) {
                    if ((this.field2721[var16 - this.field2705][var13 - this.field2709 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg5 == var14 && (arg7 & 0x1) == 0) {
                int var17 = arg8;
                int var18 = var12 < var11 ? var12 : var11;
                while (var18 > var17) {
                    if ((this.field2721[var17 - this.field2705][arg5 - this.field2709] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg2 < var11 && var12 >= var11) {
            if (arg3 == var13 && (arg7 & 0x4) == 0) {
                for (int var19 = arg2; var19 < var11; var19++) {
                    if ((this.field2721[var19 - this.field2705][var13 - this.field2709 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg5 == var14 && (arg7 & 0x1) == 0) {
                for (int var20 = arg2; var20 < var11; var20++) {
                    if ((this.field2721[var20 - this.field2705][arg5 - this.field2709] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg3 <= arg5 && var14 > arg5) {
            if (arg2 == var11 && (arg7 & 0x8) == 0) {
                int var21 = var14 < var13 ? var14 : var13;
                for (int var22 = arg5; var22 < var21; var22++) {
                    if ((this.field2721[var11 - this.field2705 - 1][var22 - this.field2709] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg8 == var12 && (arg7 & 0x2) == 0) {
                int var23 = var13 > var14 ? var14 : var13;
                for (int var24 = arg5; var24 < var23; var24++) {
                    if ((this.field2721[arg8 - this.field2705][var24 - this.field2709] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        } else if (var13 > arg3 && var13 <= var14) {
            if (arg2 == var11 && (arg7 & 0x8) == 0) {
                for (int var25 = arg3; var25 < var13; var25++) {
                    if ((this.field2721[var11 - this.field2705 - 1][var25 - this.field2709] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg8 == var12 && (arg7 & 0x2) == 0) {
                for (int var26 = arg3; var26 < var13; var26++) {
                    if ((this.field2721[arg8 - this.field2705][var26 - this.field2709] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZIIIIIIII)Z")
    private final boolean method1119(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2719++;
        if (!arg0) {
            method1139((class235) null, -24, -74, -49, -115, -115);
        }
        if (arg3 + arg7 > arg4 && arg4 + arg8 > arg7) {
            return arg1 + arg6 > arg5 && arg5 + arg2 > arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)V")
    public final void method1120(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field2705;
        int var5 = arg1 - this.field2709;
        if (arg2 <= -6) {
            this.field2721[var4][var5] = class281.method1906(this.field2721[var4][var5], 262144);
            field2715++;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIBZ)V")
    public final void method1121(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6) {
        int var8 = arg3 - this.field2705;
        int var9 = 256;
        if (arg0 == 1 || arg0 == 3) {
            int var10 = arg1;
            arg1 = arg4;
            arg4 = var10;
        }
        int var11 = arg2 - this.field2709;
        field2703++;
        if (arg5 != -62) {
            this.method1120(108, -8, 76);
        }
        if (arg6) {
            var9 += 131072;
        }
        for (int var12 = var8; var12 < (var8 + arg1); var12++) {
            if (var12 >= 0 && var12 < this.field2722) {
                for (int var13 = var11; var13 < (arg4 + var11); var13++) {
                    if (var13 >= 0 && this.field2699 > var13) {
                        this.method1135(var9, var13, var12, 90);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(III)I")
    public static final int method1122(int arg0, int arg1, int arg2) {
        if (arg0 > -23) {
            method1122(-87, -3, -117);
        }
        field2711++;
        class40 var3 = (class40) class177.field3194.method1867((long) arg1, true);
        if (var3 == null) {
            return -1;
        } else if (arg2 >= 0 && var3.field810.length > arg2) {
            return var3.field810[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBZIII)V")
    public final void method1123(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg1 <= 126) {
            return;
        }
        int var7 = arg3 - this.field2705;
        int var8 = arg4 - this.field2709;
        field2717++;
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method1135(128, var8, var7, -85);
                this.method1135(8, var8, var7 - 1, -70);
            }
            if (arg5 == 1) {
                this.method1135(2, var8, var7, -113);
                this.method1135(32, var8 + 1, var7, -100);
            }
            if (arg5 == 2) {
                this.method1135(8, var8, var7, 94);
                this.method1135(128, var8, var7 + 1, -105);
            }
            if (arg5 == 3) {
                this.method1135(32, var8, var7, -101);
                this.method1135(2, var8 - 1, var7, -74);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method1135(1, var8, var7, 58);
                this.method1135(16, var8 + 1, var7 + -1, 122);
            }
            if (arg5 == 1) {
                this.method1135(4, var8, var7, 96);
                this.method1135(64, var8 + 1, var7 - -1, -74);
            }
            if (arg5 == 2) {
                this.method1135(16, var8, var7, 79);
                this.method1135(1, var8 - 1, var7 + 1, 82);
            }
            if (arg5 == 3) {
                this.method1135(64, var8, var7, -98);
                this.method1135(4, var8 - 1, var7 + -1, 122);
            }
        }
        if (arg0 == 2) {
            if (arg5 == 0) {
                this.method1135(130, var8, var7, 123);
                this.method1135(8, var8, var7 - 1, -118);
                this.method1135(32, var8 + 1, var7, -73);
            }
            if (arg5 == 1) {
                this.method1135(10, var8, var7, -120);
                this.method1135(32, var8 + 1, var7, -93);
                this.method1135(128, var8, var7 + 1, -74);
            }
            if (arg5 == 2) {
                this.method1135(40, var8, var7, -83);
                this.method1135(128, var8, var7 + 1, 99);
                this.method1135(2, var8 - 1, var7, 69);
            }
            if (arg5 == 3) {
                this.method1135(160, var8, var7, 75);
                this.method1135(2, var8 - 1, var7, 74);
                this.method1135(8, var8, var7 - 1, 70);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 == 0) {
                this.method1135(65536, var8, var7, 97);
                this.method1135(4096, var8, var7 - 1, -69);
            }
            if (arg5 == 1) {
                this.method1135(1024, var8, var7, -80);
                this.method1135(16384, var8 + 1, var7, -114);
            }
            if (arg5 == 2) {
                this.method1135(4096, var8, var7, -121);
                this.method1135(65536, var8, var7 + 1, -68);
            }
            if (arg5 == 3) {
                this.method1135(16384, var8, var7, 124);
                this.method1135(1024, var8 - 1, var7, -101);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg5 == 0) {
                this.method1135(512, var8, var7, -126);
                this.method1135(8192, var8 + 1, var7 - 1, 65);
            }
            if (arg5 == 1) {
                this.method1135(2048, var8, var7, 64);
                this.method1135(32768, var8 + 1, var7 + 1, -104);
            }
            if (arg5 == 2) {
                this.method1135(8192, var8, var7, 99);
                this.method1135(512, var8 - 1, var7 + 1, 72);
            }
            if (arg5 == 3) {
                this.method1135(32768, var8, var7, -77);
                this.method1135(2048, var8 - 1, var7 - 1, 113);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method1135(66560, var8, var7, 76);
            this.method1135(4096, var8, var7 - 1, 110);
            this.method1135(16384, var8 + 1, var7, -80);
        }
        if (arg5 == 1) {
            this.method1135(5120, var8, var7, -75);
            this.method1135(16384, var8 + 1, var7, 61);
            this.method1135(65536, var8, var7 + 1, 89);
        }
        if (arg5 == 2) {
            this.method1135(20480, var8, var7, 74);
            this.method1135(65536, var8, var7 + 1, 91);
            this.method1135(1024, var8 - 1, var7, -96);
        }
        if (arg5 == 3) {
            this.method1135(81920, var8, var7, 93);
            this.method1135(1024, var8 - 1, var7, -117);
            this.method1135(4096, var8, var7 - 1, -72);
            return;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public final void method1124(byte arg0) {
        field2714++;
        int var2 = 0;
        if (arg0 > -57) {
            return;
        }
        while (var2 < this.field2722) {
            for (int var3 = 0; var3 < this.field2699; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field2722 - 5) <= var2 || this.field2699 - 5 <= var3) {
                    this.field2721[var2][var3] = 16777215;
                } else {
                    this.field2721[var2][var3] = 16777216;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZIIIII)V")
    public final void method1125(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2700++;
        int var7 = arg1 - this.field2705;
        int var8 = arg2 - this.field2709;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method1131(128, var7, false, var8);
                this.method1131(8, var7 - 1, false, var8);
            }
            if (arg4 == 1) {
                this.method1131(2, var7, false, var8);
                this.method1131(32, var7, false, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1131(8, var7, false, var8);
                this.method1131(128, var7 + 1, false, var8);
            }
            if (arg4 == 3) {
                this.method1131(32, var7, false, var8);
                this.method1131(2, var7, false, var8 - 1);
            }
        }
        if (arg3 != -1845) {
            this.method1120(-72, -128, 100);
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method1131(1, var7, false, var8);
                this.method1131(16, var7 - 1, false, var8 + 1);
            }
            if (arg4 == 1) {
                this.method1131(4, var7, false, var8);
                this.method1131(64, var7 + 1, false, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1131(16, var7, false, var8);
                this.method1131(1, var7 + 1, false, var8 - 1);
            }
            if (arg4 == 3) {
                this.method1131(64, var7, false, var8);
                this.method1131(4, var7 - 1, false, var8 - 1);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method1131(130, var7, false, var8);
                this.method1131(8, var7 - 1, false, var8);
                this.method1131(32, var7, false, var8 + 1);
            }
            if (arg4 == 1) {
                this.method1131(10, var7, false, var8);
                this.method1131(32, var7, false, var8 + 1);
                this.method1131(128, var7 + 1, false, var8);
            }
            if (arg4 == 2) {
                this.method1131(40, var7, false, var8);
                this.method1131(128, var7 + 1, false, var8);
                this.method1131(2, var7, false, var8 - 1);
            }
            if (arg4 == 3) {
                this.method1131(160, var7, false, var8);
                this.method1131(2, var7, false, var8 - 1);
                this.method1131(8, var7 - 1, false, var8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method1131(65536, var7, false, var8);
                this.method1131(4096, var7 - 1, false, var8);
            }
            if (arg4 == 1) {
                this.method1131(1024, var7, false, var8);
                this.method1131(16384, var7, false, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1131(4096, var7, false, var8);
                this.method1131(65536, var7 + 1, false, var8);
            }
            if (arg4 == 3) {
                this.method1131(16384, var7, false, var8);
                this.method1131(1024, var7, false, var8 - 1);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method1131(512, var7, false, var8);
                this.method1131(8192, var7 - 1, false, var8 + 1);
            }
            if (arg4 == 1) {
                this.method1131(2048, var7, false, var8);
                this.method1131(32768, var7 + 1, false, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1131(8192, var7, false, var8);
                this.method1131(512, var7 + 1, false, var8 - 1);
            }
            if (arg4 == 3) {
                this.method1131(32768, var7, false, var8);
                this.method1131(2048, var7 - 1, false, var8 - 1);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1131(66560, var7, false, var8);
            this.method1131(4096, var7 - 1, false, var8);
            this.method1131(16384, var7, false, var8 + 1);
        }
        if (arg4 == 1) {
            this.method1131(5120, var7, false, var8);
            this.method1131(16384, var7, false, var8 + 1);
            this.method1131(65536, var7 + 1, false, var8);
        }
        if (arg4 == 2) {
            this.method1131(20480, var7, false, var8);
            this.method1131(65536, var7 + 1, false, var8);
            this.method1131(1024, var7, false, var8 - 1);
        }
        if (arg4 == 3) {
            this.method1131(81920, var7, false, var8);
            this.method1131(1024, var7, false, var8 - 1);
            this.method1131(4096, var7 - 1, false, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIZIIIII)Z")
    public final boolean method1126(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2702++;
        if (arg5 > 1) {
            return this.method1119(!arg3, arg1, arg5, arg4, arg6, arg2, arg0, arg8, arg5) ? true : this.method1118(arg5, arg4, arg8, arg1, arg5, arg2, arg0, arg7, arg6, 65536);
        }
        int var10 = arg4 + arg8 - 1;
        int var11 = arg0 + arg1 - 1;
        if (arg8 <= arg6 && var10 >= arg6 && arg2 >= arg1 && var11 >= arg2) {
            return true;
        } else if (arg8 - 1 == arg6 && arg2 >= arg1 && var11 >= arg2 && (this.field2721[arg6 - this.field2705][arg2 - this.field2709] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg6 && arg2 >= arg1 && var11 >= arg2 && (this.field2721[arg6 - this.field2705][arg2 - this.field2709] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg2 && arg6 >= arg8 && arg6 <= var10 && (this.field2721[arg6 - this.field2705][arg2 - this.field2709] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else if (arg3) {
            return true;
        } else {
            return var11 + 1 == arg2 && arg8 <= arg6 && arg6 <= var10 && (this.field2721[arg6 - this.field2705][arg2 - this.field2709] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILmd;III)V")
    public static final void method1127(int arg0, class220 arg1, int arg2, int arg3, int arg4) {
        class21.method129((byte) 8);
        field2728++;
        class23.method164(arg0, arg2, arg1.field4037 + arg0, arg2 - -arg1.field3948);
        if (class185.field3283 == 2 || class185.field3283 == 5 || class144.field2485 == null) {
            class23.method149(arg0, arg2, 0, arg1.field4026, arg1.field3907);
        } else {
            int var5 = class202.field3565.field5104 / 32 + 48;
            int var6 = class70.field1254 + class266.field4711 & 0x7FF;
            int var7 = 464 - (class202.field3565.field5072 / 32);
            ((class139) class144.field2485).method377(arg0, arg2, arg1.field4037, arg1.field3948, var5, var7, var6, class225.field4098 + 256, arg1.field4026, arg1.field3907);
            if (class202.field3570 != null) {
                for (int var8 = 0; var8 < class202.field3570.field3301; var8++) {
                    if (class202.field3570.method1301(false, var8)) {
                        int var9 = (class202.field3570.field3294[var8] - class21.field349) * 4 + 2 - (class202.field3565.field5104 / 32);
                        int var10 = (class202.field3570.field3297[var8] - class180.field3231) * 4 + 2 - (class202.field3565.field5072 / 32);
                        int var11 = class257.field4598[var6];
                        int var12 = var11 * 256 / (class225.field4098 + 256);
                        int var13 = class257.field4597[var6];
                        int var14 = var13 * 256 / (class225.field4098 + 256);
                        int var15 = var10 * var14 - (var9 * var12) >> 16;
                        int var16 = var9 * var14 + var10 * var12 >> 16;
                        class226 var17 = class167.field2940;
                        if (class202.field3570.method1306(var8, 3) == 1) {
                            var17 = class176.field3183;
                        }
                        if (class202.field3570.method1306(var8, 3) == 2) {
                            var17 = class284.field4996;
                        }
                        int var18 = var17.method1607(class202.field3570.field3312[var8], 100);
                        int var19 = var16 - var18 / 2;
                        if (var19 >= -arg1.field4037 && arg1.field4037 >= var19 && var15 >= -arg1.field3948 && var15 <= arg1.field3948) {
                            int var20 = 16777215;
                            if (class202.field3570.field3299[var8] != -1) {
                                var20 = class202.field3570.field3299[var8];
                            }
                            class23.method147(arg1.field4026, arg1.field3907);
                            var17.method1599(class202.field3570.field3312[var8], arg1.field4037 / 2 + arg0 + var19, -var15 + arg2 - -(arg1.field3948 / 2), var18, 50, var20, 0, 256, 1, 0, 0);
                            class23.method153();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class237.field4374; var21++) {
                int var56 = class247.field4487[var21] * 4 + 2 - (class202.field3565.field5104 / 32);
                int var57 = class113.field1964[var21] * 4 + 2 - class202.field3565.field5072 / 32;
                class22 var58 = class33.method251(0, class217.field3855[var21]);
                if (var58.field428 != null) {
                    var58 = var58.method141(false);
                    if (var58 == null || var58.field362 == -1) {
                        continue;
                    }
                }
                class212.method1515(arg1, class150.field2635[var58.field362], arg0, var57, 126, arg2, var56);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var52 = 0; var52 < 104; var52++) {
                    class132 var53 = class276.field4844[class93.field1645][var22][var52];
                    if (var53 != null) {
                        int var54 = var22 * 4 + 2 - (class202.field3565.field5104 / 32);
                        int var55 = var52 * 4 + 2 - (class202.field3565.field5072 / 32);
                        class212.method1515(arg1, class127.field2217[0], arg0, var55, 124, arg2, var54);
                    }
                }
            }
            for (int var23 = 0; var23 < class138.field2390; var23++) {
                class256 var48 = class79.field1449[class117.field2036[var23]];
                if (var48 != null && var48.method90((byte) -12)) {
                    class72 var49 = var48.field4581;
                    if (var49 != null && var49.field1293 != null) {
                        var49 = var49.method517(-65);
                    }
                    if (var49 != null && var49.field1273 && var49.field1301) {
                        int var50 = var48.field5104 / 32 - class202.field3565.field5104 / 32;
                        int var51 = var48.field5072 / 32 - (class202.field3565.field5072 / 32);
                        if (var49.field1311 == -1) {
                            class212.method1515(arg1, class127.field2217[1], arg0, var51, 124, arg2, var50);
                        } else {
                            class212.method1515(arg1, class150.field2635[var49.field1311], arg0, var51, 120, arg2, var50);
                        }
                    }
                }
            }
            for (int var24 = 0; var24 < class31.field629; var24++) {
                class14 var38 = class169.field2953[class10.field149[var24]];
                if (var38 != null && var38.method90((byte) -120)) {
                    int var39 = var38.field5072 / 32 - (class202.field3565.field5072 / 32);
                    int var40 = var38.field5104 / 32 - class202.field3565.field5104 / 32;
                    boolean var41 = false;
                    long var42 = var38.field209.method1428(0);
                    for (int var44 = 0; var44 < class25.field534; var44++) {
                        if (class150.field2640[var44] == var42 && class34.field679[var44] != 0) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    for (int var46 = 0; var46 < class277.field4866; var46++) {
                        if (class105.field1859[var46].field3407 == var42) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    if (class202.field3565.field208 != 0 && var38.field208 != 0 && class202.field3565.field208 == var38.field208) {
                        var47 = true;
                    }
                    if (var41) {
                        class212.method1515(arg1, class127.field2217[3], arg0, var39, 118, arg2, var40);
                    } else if (var45) {
                        class212.method1515(arg1, class127.field2217[5], arg0, var39, 126, arg2, var40);
                    } else if (var47) {
                        class212.method1515(arg1, class127.field2217[4], arg0, var39, 124, arg2, var40);
                    } else {
                        class212.method1515(arg1, class127.field2217[2], arg0, var39, 116, arg2, var40);
                    }
                }
            }
            class156[] var25 = class170.field3025;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class156 var29 = var25[var26];
                if (var29 != null && var29.field2749 != 0 && (class160.field2844 % 20) < 10) {
                    if (var29.field2749 == 1 && var29.field2740 >= 0 && class79.field1449.length > var29.field2740) {
                        class256 var30 = class79.field1449[var29.field2740];
                        if (var30 != null) {
                            int var31 = var30.field5104 / 32 - (class202.field3565.field5104 / 32);
                            int var32 = var30.field5072 / 32 - (class202.field3565.field5072 / 32);
                            class98.method694(arg0, arg1, var32, var29.field2750, var31, arg2, (byte) -66);
                        }
                    }
                    if (var29.field2749 == 2) {
                        int var33 = (var29.field2732 - class180.field3231) * 4 + 2 - class202.field3565.field5072 / 32;
                        int var34 = (var29.field2756 - class21.field349) * 4 + 2 - (class202.field3565.field5104 / 32);
                        class98.method694(arg0, arg1, var33, var29.field2750, var34, arg2, (byte) -74);
                    }
                    if (var29.field2749 == 10 && var29.field2740 >= 0 && var29.field2740 < class169.field2953.length) {
                        class14 var35 = class169.field2953[var29.field2740];
                        if (var35 != null) {
                            int var36 = var35.field5104 / 32 - (class202.field3565.field5104 / 32);
                            int var37 = var35.field5072 / 32 - class202.field3565.field5072 / 32;
                            class98.method694(arg0, arg1, var37, var29.field2750, var36, arg2, (byte) -92);
                        }
                    }
                }
            }
            if (class117.field2015 != 0) {
                int var27 = class117.field2015 * 4 + 2 - (class202.field3565.field5104 / 32);
                int var28 = class233.field4282 * 4 + 2 - (class202.field3565.field5072 / 32);
                class212.method1515(arg1, class74.field1361, arg0, var28, 115, arg2, var27);
            }
            class23.method167(arg1.field4037 / 2 + arg0 - 1, arg1.field3948 / 2 + arg2 + -1, 3, 3, 16777215);
        }
        class212.field3766[arg3] = true;
        int var59 = 98 / ((arg4 + 65) / 58);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIZ)V")
    public final void method1128(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2701++;
        int var7 = 76 % ((arg2 + 75) / 51);
        int var8 = arg1 - this.field2705;
        int var9 = 256;
        if (arg5) {
            var9 += 131072;
        }
        int var10 = arg3 - this.field2709;
        for (int var11 = var8; var11 < (var8 + arg4); var11++) {
            if (var11 >= 0 && this.field2722 > var11) {
                for (int var12 = var10; var12 < (arg0 + var10); var12++) {
                    if (var12 >= 0 && var12 < this.field2699) {
                        this.method1131(var9, var11, false, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static void method1129(int arg0) {
        field2726 = null;
        field2724 = null;
        field2730 = null;
        field2713 = null;
        field2729 = null;
        if (arg0 != -1) {
            field2724 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1130(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2710++;
        if (arg1 == 1) {
            if (arg4 == arg5 && arg0 == arg3) {
                return true;
            }
        } else if (arg5 >= arg4 && (arg1 + arg4 - 1) >= arg5 && arg3 <= arg3 && arg3 <= (arg3 + arg1 - 1)) {
            return true;
        }
        int var9 = 30 % ((23 - arg2) / 40);
        int var10 = arg5 - this.field2705;
        int var11 = arg3 - this.field2709;
        int var12 = arg4 - this.field2705;
        int var13 = arg0 - this.field2709;
        if (arg1 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var10 + 1 == var12 && var11 == var13 && (this.field2721[var12][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 - 1 == var13 && (this.field2721[var12][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var10 - 1 == var12 && var11 == var13 && (this.field2721[var12][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 - 1) == var13 && (this.field2721[var12][var13] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var10 - 1) == var12 && var11 == var13 && (this.field2721[var12][var13] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var11 + 1 == var13 && (this.field2721[var12][var13] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var10 + 1 == var12 && var11 == var13 && (this.field2721[var12][var13] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var11 + 1) == var13 && (this.field2721[var12][var13] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var10 == var12 && (var11 + 1) == var13 && (this.field2721[var12][var13] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var11 - 1) == var13 && (this.field2721[var12][var13] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var12 && var11 == var13 && (this.field2721[var12][var13] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var11 == var13 && (this.field2721[var12][var13] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var14 = arg1 + var12 - 1;
            int var15 = arg1 + var13 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var10 + 1 == var12 && var13 <= var11 && var11 <= var15 && (this.field2721[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var14 && var11 - arg1 == var13 && (this.field2721[var10][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var10 - arg1) == var12 && var11 >= var13 && var11 <= var15 && (this.field2721[var14][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var14 && (var11 - arg1) == var13 && (this.field2721[var10][var15] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var10 - arg1) == var12 && var13 <= var11 && var11 <= var15 && (this.field2721[var14][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var14 && var11 + 1 == var13 && (this.field2721[var10][var13] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var10 + 1) == var12 && var11 >= var13 && var11 <= var15 && (this.field2721[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var10 <= var14 && var11 + 1 == var13 && (this.field2721[var10][var13] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var12 <= var10 && var10 <= var14 && (var11 + 1) == var13 && (this.field2721[var10][var13] & 0x20) == 0) {
                    return true;
                }
                if (var10 >= var12 && var14 >= var10 && var11 - arg1 == var13 && (this.field2721[var10][var15] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg1) == var12 && var11 >= var13 && var15 >= var11 && (this.field2721[var14][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var13 <= var11 && var11 <= var15 && (this.field2721[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIZI)V")
    private final void method1131(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            field2729 = null;
        }
        this.field2721[arg1][arg3] = class281.method1906(this.field2721[arg1][arg3], arg0);
        field2725++;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(III)V")
    public final void method1132(int arg0, int arg1, int arg2) {
        field2712++;
        int var4 = arg0 - this.field2705;
        int var5 = arg2 - this.field2709;
        this.field2721[var4][var5] = class121.method860(this.field2721[var4][var5], arg1);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIZI)Z")
    public final boolean method1133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        field2704++;
        if (arg4 == 1) {
            if (arg3 == arg7 && arg1 == arg5) {
                return true;
            }
        } else if (arg7 <= arg3 && (arg4 + arg7 - 1) >= arg3 && arg5 >= arg5 && arg4 + arg5 - 1 >= arg5) {
            return true;
        }
        int var9 = arg5 - this.field2709;
        int var10 = arg1 - this.field2709;
        int var11 = arg3 - this.field2705;
        int var12 = arg7 - this.field2705;
        if (arg4 == 1) {
            if (arg0 == 0) {
                if (arg2 == 0) {
                    if (var11 - 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field2721[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field2721[var12][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var11 == var12 && var9 + 1 == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field2721[var12][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field2721[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var11 + 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field2721[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field2721[var12][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var11 == var12 && (var9 - 1) == var10) {
                        return true;
                    }
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field2721[var12][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field2721[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg2 == 0) {
                    if (var11 - 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10 && (this.field2721[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field2721[var12][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var11 - 1 == var12 && var9 == var10 && (this.field2721[var12][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10 && (this.field2721[var12][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var11 - 1) == var12 && var9 == var10 && (this.field2721[var12][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field2721[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var9 - 1 == var10) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var11 - 1) == var12 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var9 + 1) == var10 && (this.field2721[var12][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 == var10 && (this.field2721[var12][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var11 == var12 && var9 + 1 == var10 && (this.field2721[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var9 - 1 == var10 && (this.field2721[var12][var10] & 0x2) == 0) {
                    return true;
                }
                if (var11 - 1 == var12 && var9 == var10 && (this.field2721[var12][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var12 && var9 == var10 && (this.field2721[var12][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 - (1 - arg4);
            int var14 = arg4 + var10 - 1;
            if (arg0 == 0) {
                if (arg2 == 0) {
                    if (var11 - arg4 == var12 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var9 + 1 == var10 && (this.field2721[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var9 - arg4) == var10 && (this.field2721[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var12 <= var11 && var13 >= var11 && var9 + 1 == var10) {
                        return true;
                    }
                    if (var11 - arg4 == var12 && var10 <= var9 && var9 <= var14 && (this.field2721[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 <= var9 && var14 >= var9 && (this.field2721[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var11 + 1) == var12 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && var9 + 1 == var10 && (this.field2721[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var9 - arg4 == var10 && (this.field2721[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var11 >= var12 && var13 >= var11 && var9 - arg4 == var10) {
                        return true;
                    }
                    if (var11 - arg4 == var12 && var10 <= var9 && var14 >= var9 && (this.field2721[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var9 >= var10 && var9 <= var14 && (this.field2721[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 2) {
                if (arg2 == 0) {
                    if ((var11 - arg4) == var12 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && (var9 + 1) == var10) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 <= var9 && var14 >= var9 && (this.field2721[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && var9 - arg4 == var10 && (this.field2721[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var11 - arg4 == var12 && var9 >= var10 && var14 >= var9 && (this.field2721[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var9 + 1 == var10) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var10 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var9 - arg4) == var10 && (this.field2721[var11][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var11 - arg4 == var12 && var9 >= var10 && var9 <= var14 && (this.field2721[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 >= var12 && var11 <= var13 && (var9 + 1) == var10 && (this.field2721[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 + 1 == var12 && var9 >= var10 && var9 <= var14) {
                        return true;
                    }
                    if (var12 <= var11 && var11 <= var13 && (var9 - arg4) == var10) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var11 - arg4 == var12 && var10 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 >= var12 && var13 >= var11 && (var9 + 1) == var10 && (this.field2721[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var11 + 1) == var12 && var10 <= var9 && var14 >= var9 && (this.field2721[var12][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var12 <= var11 && var13 >= var11 && var9 - arg4 == var10) {
                        return true;
                    }
                }
            }
            if (arg0 == 9) {
                if (var11 >= var12 && var13 >= var11 && (var9 + 1) == var10 && (this.field2721[var11][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 >= var12 && var11 <= var13 && (var9 - arg4) == var10 && (this.field2721[var11][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var11 - arg4) == var12 && var10 <= var9 && var9 <= var14 && (this.field2721[var13][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var10 <= var9 && var14 >= var9 && (this.field2721[var12][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg6) {
            field2726 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(III)V")
    public final void method1134(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field2709;
        int var5 = arg2 - this.field2705;
        field2718++;
        this.field2721[var5][var4] = class281.method1906(this.field2721[var5][var4], 2097152);
        if (arg0 != -18939) {
            this.method1125(false, -94, -48, 51, -41, 25);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIII)V")
    private final void method1135(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -11 % ((-arg3 - 5) / 63);
        this.field2721[arg2][arg1] = class121.method860(this.field2721[arg2][arg1], ~arg0);
        field2707++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIII)I")
    public static final int method1136(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 4096) {
            method1127(20, (class220) null, -73, -32, -124);
        }
        field2706++;
        int var5 = 65536 - class257.field4597[arg1 * 1024 / arg3] >> 1;
        return ((65536 - var5) * arg0 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)Luh;")
    public static final class100 method1137(int arg0) {
        field2708++;
        if (arg0 != -1) {
            field2724 = null;
        }
        int var1 = class241.field4402[0] * class107.field1895[0];
        int[] var2 = new int[var1];
        byte[] var3 = class185.field3286[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class243.field4421[class121.method860(255, var3[var4])];
        }
        class139 var5 = new class139(class242.field4406, class230.field4224, class287.field5127[0], class170.field3021[0], class107.field1895[0], class241.field4402[0], var2);
        class116.method821((byte) -124);
        return var5;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)Lsa;")
    public static final class260 method1138(int arg0) {
        field2727++;
        if (class17.field266 < class193.field3404.length) {
            return class193.field3404[class17.field266++];
        } else {
            int var1 = -66 % ((arg0 - 18) / 60);
            return null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ldc;IIIII)V")
    public static final void method1139(class235 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class100.field1801 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class225.field4104) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class279.field4908 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class174 var14 = class82.field1498[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class163.field2881[var11][var12 + 1][var13] + class163.field2881[var11][var12][var13] + class163.field2881[var11][var12][var13 + 1] + class163.field2881[var11][var12 + 1][var13 + 1]) / 4 - (class163.field2881[arg1][arg2 + 1][arg3] + class163.field2881[arg1][arg2][arg3] + class163.field2881[arg1][arg2][arg3 + 1] + class163.field2881[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class209 var16 = var14.field3136;
                                    if (var16 != null) {
                                        if (var16.field3704.method1506()) {
                                            arg0.method1489(var16.field3704, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3712 != null && var16.field3712.method1506()) {
                                            arg0.method1489(var16.field3712, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3138; var17++) {
                                        class288 var18 = var14.field3140[var17];
                                        if (var18 != null && var18.field5136.method1506() && (var18.field5150 == var12 || var7 == var12) && (var18.field5140 == var13 || var9 == var13)) {
                                            int var19 = var18.field5146 + 1 - var18.field5150;
                                            int var20 = var18.field5142 + 1 - var18.field5140;
                                            arg0.method1489(var18.field5136, (var18.field5150 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field5140 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(II)V")
    public class155(int arg0, int arg1) {
        this.field2699 = arg1;
        this.field2722 = arg0;
        this.field2709 = 0;
        this.field2705 = 0;
        this.field2721 = new int[this.field2722][this.field2699];
        this.method1124((byte) -81);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field2726[var1] = var0 / 4;
        }
        field2730 = class24.method212(255, "Memory before cleanup=");
    }
}
