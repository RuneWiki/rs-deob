import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class8 {

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    private int field121 = 0;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    private int field119;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "[[I")
    public int[][] field132;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "Lvd;")
    private static class222 field129 = class212.method1357("Service unavailable)3", 10731);

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "Lvd;")
    public static class222 field131 = field129;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Lve;")
    public static class223 field126;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "[I")
    public static int[] field135;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
    public static final void method65(int arg0, int arg1, int arg2) {
        field130++;
        if (class27.method232(arg0, -7754)) {
            class220.method1398(arg2, class220.field4066[arg0], (byte) -36);
            if (arg1 != 1) {
                field131 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BIIIIIZ)V")
    public final void method66(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg4 - this.field121;
        int var9 = arg5 - this.field119;
        field122++;
        if (arg2 == 1 || arg2 == 3) {
            int var10 = arg1;
            arg1 = arg3;
            arg3 = var10;
        }
        int var11 = 256;
        if (arg6) {
            var11 += 131072;
        }
        if (arg0 <= 11) {
            return;
        }
        for (int var12 = var8; var12 < var8 + arg1; var12++) {
            if (var12 >= 0 && this.field143 > var12) {
                for (int var13 = var9; var13 < arg3 + var9; var13++) {
                    if (var13 >= 0 && var13 < this.field120) {
                        this.method82(var11, var13, var12, -11441);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BII)V")
    public final void method67(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field121;
        int var5 = arg2 - this.field119;
        this.field132[var4][var5] = class213.method1361(this.field132[var4][var5], 2097152);
        if (arg0 >= 87) {
            field123++;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static final void method68(int arg0) {
        field138++;
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(1);
        if (arg0 != -1) {
            field135 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public final void method69(byte arg0) {
        field125++;
        int var2 = -36 / ((12 - arg0) / 52);
        for (int var3 = 0; var3 < this.field143; var3++) {
            for (int var4 = 0; var4 < this.field120; var4++) {
                if (var3 == 0 || var4 == 0 || this.field143 - 5 <= var3 || this.field120 - 5 <= var4) {
                    this.field132[var3][var4] = 16777215;
                } else {
                    this.field132[var3][var4] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIIZII)V")
    public final void method70(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field142++;
        int var7 = arg1 - this.field119;
        int var8 = 256;
        int var9 = arg4 - this.field121;
        if (arg0) {
            var8 += 131072;
        }
        int var10 = var9;
        if (arg3) {
            field135 = null;
        }
        while (var10 < arg2 + var9) {
            if (var10 >= 0 && this.field143 > var10) {
                for (int var11 = var7; var11 < var7 + arg5; var11++) {
                    if (var11 >= 0 && var11 < this.field120) {
                        this.method72(var10, var8, (byte) -121, var11);
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public static void method71(int arg0) {
        field131 = null;
        field129 = null;
        field126 = null;
        field135 = null;
        if (arg0 < 76) {
            method68(101);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIBI)V")
    private final void method72(int arg0, int arg1, byte arg2, int arg3) {
        field145++;
        this.field132[arg0][arg3] = class213.method1361(this.field132[arg0][arg3], arg1);
        if (arg2 >= -115) {
            method73(-90, 30, -21, 13, -109, null, 66, 93);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIILba;II)V")
    public static final void method73(int arg0, int arg1, int arg2, int arg3, int arg4, class13 arg5, int arg6, int arg7) {
        if (class217.field4040) {
            class216.field4018 = 32;
        } else {
            class216.field4018 = 0;
        }
        if (arg3 != -32) {
            return;
        }
        field127++;
        class217.field4040 = false;
        if (class94.field1773 != 0) {
            if (arg1 <= arg4 && arg1 + 16 > arg4 && arg6 <= arg7 && arg7 < arg6 + 16) {
                arg5.field314 -= 4;
                class80.method527(arg5, arg3 + 31734);
            } else if (arg1 <= arg4 && arg4 < arg1 + 16 && arg7 >= arg6 + arg2 - 16 && arg6 + arg2 > arg7) {
                arg5.field314 += 4;
                class80.method527(arg5, 31702);
            } else if (arg4 >= arg1 - class216.field4018 && arg1 + class216.field4018 + 16 > arg4 && arg6 + 16 <= arg7 && arg2 + arg6 - 16 > arg7) {
                int var8 = (arg2 - 32) * arg2 / arg0;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg2 - var8 - 32;
                int var10 = arg7 - arg6 - var8 / 2 - 16;
                arg5.field314 = (arg0 - arg2) * var10 / var9;
                class80.method527(arg5, 31702);
                class217.field4040 = true;
            }
        }
        if (class225.field4209 == 0) {
            return;
        }
        int var11 = arg5.field341;
        if (arg1 - var11 <= arg4 && arg6 <= arg7 && arg4 < arg1 + 16 && arg2 + arg6 >= arg7) {
            arg5.field314 += class225.field4209 * 45;
            class80.method527(arg5, arg3 + 31734);
            return;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIIIII)V")
    public final void method74(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field121;
        field144++;
        if (arg1 >= -34) {
            this.field132 = null;
        }
        int var8 = arg4 - this.field119;
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method82(128, var8, var7, -11441);
                this.method82(8, var8, var7 - 1, -11441);
            }
            if (arg3 == 1) {
                this.method82(2, var8, var7, -11441);
                this.method82(32, var8 + 1, var7, -11441);
            }
            if (arg3 == 2) {
                this.method82(8, var8, var7, -11441);
                this.method82(128, var8, var7 + 1, -11441);
            }
            if (arg3 == 3) {
                this.method82(32, var8, var7, -11441);
                this.method82(2, var8 - 1, var7, -11441);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method82(1, var8, var7, -11441);
                this.method82(16, var8 + 1, var7 + -1, -11441);
            }
            if (arg3 == 1) {
                this.method82(4, var8, var7, -11441);
                this.method82(64, var8 + 1, var7 + 1, -11441);
            }
            if (arg3 == 2) {
                this.method82(16, var8, var7, -11441);
                this.method82(1, var8 - 1, var7 - -1, -11441);
            }
            if (arg3 == 3) {
                this.method82(64, var8, var7, -11441);
                this.method82(4, var8 - 1, var7 + -1, -11441);
            }
        }
        if (arg5 == 2) {
            if (arg3 == 0) {
                this.method82(130, var8, var7, -11441);
                this.method82(8, var8, var7 - 1, -11441);
                this.method82(32, var8 + 1, var7, -11441);
            }
            if (arg3 == 1) {
                this.method82(10, var8, var7, -11441);
                this.method82(32, var8 + 1, var7, -11441);
                this.method82(128, var8, var7 + 1, -11441);
            }
            if (arg3 == 2) {
                this.method82(40, var8, var7, -11441);
                this.method82(128, var8, var7 + 1, -11441);
                this.method82(2, var8 - 1, var7, -11441);
            }
            if (arg3 == 3) {
                this.method82(160, var8, var7, -11441);
                this.method82(2, var8 - 1, var7, -11441);
                this.method82(8, var8, var7 - 1, -11441);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 == 0) {
                this.method82(65536, var8, var7, -11441);
                this.method82(4096, var8, var7 - 1, -11441);
            }
            if (arg3 == 1) {
                this.method82(1024, var8, var7, -11441);
                this.method82(16384, var8 + 1, var7, -11441);
            }
            if (arg3 == 2) {
                this.method82(4096, var8, var7, -11441);
                this.method82(65536, var8, var7 + 1, -11441);
            }
            if (arg3 == 3) {
                this.method82(16384, var8, var7, -11441);
                this.method82(1024, var8 - 1, var7, -11441);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg3 == 0) {
                this.method82(512, var8, var7, -11441);
                this.method82(8192, var8 + 1, var7 + -1, -11441);
            }
            if (arg3 == 1) {
                this.method82(2048, var8, var7, -11441);
                this.method82(32768, var8 + 1, var7 - -1, -11441);
            }
            if (arg3 == 2) {
                this.method82(8192, var8, var7, -11441);
                this.method82(512, var8 - 1, var7 - -1, -11441);
            }
            if (arg3 == 3) {
                this.method82(32768, var8, var7, -11441);
                this.method82(2048, var8 - 1, var7 - 1, -11441);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method82(66560, var8, var7, -11441);
            this.method82(4096, var8, var7 - 1, -11441);
            this.method82(16384, var8 + 1, var7, -11441);
        }
        if (arg3 == 1) {
            this.method82(5120, var8, var7, -11441);
            this.method82(16384, var8 + 1, var7, -11441);
            this.method82(65536, var8, var7 + 1, -11441);
        }
        if (arg3 == 2) {
            this.method82(20480, var8, var7, -11441);
            this.method82(65536, var8, var7 + 1, -11441);
            this.method82(1024, var8 - 1, var7, -11441);
        }
        if (arg3 == 3) {
            this.method82(81920, var8, var7, -11441);
            this.method82(1024, var8 - 1, var7, -11441);
            this.method82(4096, var8, var7 - 1, -11441);
            return;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field133++;
        if (arg1 == arg6 && arg4 == arg5) {
            return true;
        }
        int var8 = arg6 - this.field121;
        int var9 = arg4 - this.field119;
        int var10 = arg5 - this.field119;
        int var11 = arg1 - this.field121;
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var11 + 1 == var8 && var9 == var10 && (this.field132[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field132[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var11 - 1 == var8 && var9 == var10 && (this.field132[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 - 1 == var9 && (this.field132[var8][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var11 - 1 == var8 && var9 == var10 && (this.field132[var8][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field132[var8][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var11 + 1 == var8 && var9 == var10 && (this.field132[var8][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var11 && var10 + 1 == var9 && (this.field132[var8][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg3 != 128) {
            return true;
        }
        if (arg2 == 8) {
            if (var8 == var11 && var10 + 1 == var9 && (this.field132[var8][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var11 && var10 - 1 == var9 && (this.field132[var8][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var8 && var9 == var10 && (this.field132[var8][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var8 && var9 == var10 && (this.field132[var8][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)V")
    public final void method76(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field119;
        int var5 = arg0 - this.field121;
        if (arg1 <= -73) {
            this.field132[var5][var4] = class213.method1361(this.field132[var5][var4], 262144);
            field124++;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(BII)V")
    public final void method77(byte arg0, int arg1, int arg2) {
        if (arg0 == -110) {
            int var4 = arg2 - this.field119;
            field137++;
            int var5 = arg1 - this.field121;
            this.field132[var5][var4] = class139.method876(this.field132[var5][var4], -262145);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field128++;
        int var9 = arg3 + arg4 - 1;
        int var10 = arg7 + arg0 - 1;
        if (arg1 < 88) {
            return true;
        } else if (arg6 >= arg4 && arg6 <= var9 && arg2 >= arg7 && arg2 <= var10) {
            return true;
        } else if (arg4 - 1 == arg6 && arg2 >= arg7 && var10 >= arg2 && (this.field132[arg6 - this.field121][arg2 - this.field119] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg6 && arg2 >= arg7 && arg2 <= var10 && (this.field132[arg6 - this.field121][arg2 - this.field119] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if (arg7 - 1 == arg2 && arg6 >= arg4 && arg6 <= var9 && (this.field132[arg6 - this.field121][arg2 - this.field119] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg2 && arg6 >= arg4 && var9 >= arg6 && (this.field132[arg6 - this.field121][arg2 - this.field119] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z[B)Lr;")
    public static final class178 method79(boolean arg0, byte[] arg1) {
        field140++;
        if (arg1 == null) {
            return null;
        } else {
            class178 var2 = new class178(arg1, class174.field3279, class218.field4050, class185.field3429, class83.field1584, class235.field4398, class157.field3020);
            class160.method1009(arg0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIZ)V")
    public final void method80(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field134++;
        int var7 = arg2 - this.field119;
        int var8 = arg3 - this.field121;
        if (arg0 != 4) {
            method71(-15);
        }
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method72(var8, 128, (byte) -116, var7);
                this.method72(var8 - 1, 8, (byte) -125, var7);
            }
            if (arg4 == 1) {
                this.method72(var8, 2, (byte) -125, var7);
                this.method72(var8, 32, (byte) -117, var7 + 1);
            }
            if (arg4 == 2) {
                this.method72(var8, 8, (byte) -118, var7);
                this.method72(var8 + 1, 128, (byte) -125, var7);
            }
            if (arg4 == 3) {
                this.method72(var8, 32, (byte) -116, var7);
                this.method72(var8, 2, (byte) -128, var7 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method72(var8, 1, (byte) -127, var7);
                this.method72(var8 - 1, 16, (byte) -120, var7 + 1);
            }
            if (arg4 == 1) {
                this.method72(var8, 4, (byte) -116, var7);
                this.method72(var8 + 1, 64, (byte) -116, var7 + 1);
            }
            if (arg4 == 2) {
                this.method72(var8, 16, (byte) -125, var7);
                this.method72(var8 + 1, 1, (byte) -123, var7 - 1);
            }
            if (arg4 == 3) {
                this.method72(var8, 64, (byte) -118, var7);
                this.method72(var8 - 1, 4, (byte) -121, var7 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg4 == 0) {
                this.method72(var8, 130, (byte) -128, var7);
                this.method72(var8 - 1, 8, (byte) -120, var7);
                this.method72(var8, 32, (byte) -126, var7 + 1);
            }
            if (arg4 == 1) {
                this.method72(var8, 10, (byte) -117, var7);
                this.method72(var8, 32, (byte) -122, var7 + 1);
                this.method72(var8 + 1, 128, (byte) -126, var7);
            }
            if (arg4 == 2) {
                this.method72(var8, 40, (byte) -117, var7);
                this.method72(var8 + 1, 128, (byte) -127, var7);
                this.method72(var8, 2, (byte) -123, var7 - 1);
            }
            if (arg4 == 3) {
                this.method72(var8, 160, (byte) -119, var7);
                this.method72(var8, 2, (byte) -123, var7 - 1);
                this.method72(var8 - 1, 8, (byte) -126, var7);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method72(var8, 65536, (byte) -125, var7);
                this.method72(var8 - 1, 4096, (byte) -123, var7);
            }
            if (arg4 == 1) {
                this.method72(var8, 1024, (byte) -128, var7);
                this.method72(var8, 16384, (byte) -126, var7 + 1);
            }
            if (arg4 == 2) {
                this.method72(var8, 4096, (byte) -118, var7);
                this.method72(var8 + 1, 65536, (byte) -127, var7);
            }
            if (arg4 == 3) {
                this.method72(var8, 16384, (byte) -121, var7);
                this.method72(var8, 1024, (byte) -123, var7 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method72(var8, 512, (byte) -117, var7);
                this.method72(var8 - 1, 8192, (byte) -120, var7 + 1);
            }
            if (arg4 == 1) {
                this.method72(var8, 2048, (byte) -128, var7);
                this.method72(var8 + 1, 32768, (byte) -121, var7 + 1);
            }
            if (arg4 == 2) {
                this.method72(var8, 8192, (byte) -124, var7);
                this.method72(var8 + 1, 512, (byte) -125, var7 - 1);
            }
            if (arg4 == 3) {
                this.method72(var8, 32768, (byte) -125, var7);
                this.method72(var8 - 1, 2048, (byte) -122, var7 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method72(var8, 66560, (byte) -119, var7);
            this.method72(var8 - 1, 4096, (byte) -122, var7);
            this.method72(var8, 16384, (byte) -118, var7 + 1);
        }
        if (arg4 == 1) {
            this.method72(var8, 5120, (byte) -117, var7);
            this.method72(var8, 16384, (byte) -118, var7 + 1);
            this.method72(var8 + 1, 65536, (byte) -128, var7);
        }
        if (arg4 == 2) {
            this.method72(var8, 20480, (byte) -121, var7);
            this.method72(var8 + 1, 65536, (byte) -124, var7);
            this.method72(var8, 1024, (byte) -128, var7 - 1);
        }
        if (arg4 == 3) {
            this.method72(var8, 81920, (byte) -116, var7);
            this.method72(var8, 1024, (byte) -121, var7 - 1);
            this.method72(var8 - 1, 4096, (byte) -127, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(IIIIIII)Z")
    public final boolean method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field141++;
        if (arg0 == arg1 && arg5 == arg6) {
            return true;
        } else if (arg3 == 1) {
            int var8 = arg5 - this.field119;
            int var9 = arg0 - this.field121;
            int var10 = arg6 - this.field119;
            int var11 = arg1 - this.field121;
            if (arg2 == 0) {
                if (arg4 == 0) {
                    if (var9 - 1 == var11 && var8 == var10) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var8 && (this.field132[var11][var8] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var8 && (this.field132[var11][var8] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 == var11 && var10 + 1 == var8) {
                        return true;
                    }
                    if (var9 - 1 == var11 && var8 == var10 && (this.field132[var11][var8] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var8 == var10 && (this.field132[var11][var8] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 + 1 == var11 && var8 == var10) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var8 && (this.field132[var11][var8] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var8 && (this.field132[var11][var8] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 == var11 && var10 - 1 == var8) {
                        return true;
                    }
                    if (var9 - 1 == var11 && var8 == var10 && (this.field132[var11][var8] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var8 == var10 && (this.field132[var11][var8] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg4 == 0) {
                    if (var9 - 1 == var11 && var8 == var10) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var8) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var8 == var10 && (this.field132[var11][var8] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var8 && (this.field132[var11][var8] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 - 1 == var11 && var8 == var10 && (this.field132[var11][var8] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var8) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var8 == var10) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var8 && (this.field132[var11][var8] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 - 1 == var11 && var8 == var10 && (this.field132[var11][var8] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var8 && (this.field132[var11][var8] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var8 == var10) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var8) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 - 1 == var11 && var8 == var10) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var8 && (this.field132[var11][var8] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var8 == var10 && (this.field132[var11][var8] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var8) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var9 == var11 && var10 + 1 == var8 && (this.field132[var11][var8] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var8 && (this.field132[var11][var8] & 0x2) == 0) {
                    return true;
                }
                if (var9 - 1 == var11 && var8 == var10 && (this.field132[var11][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var8 == var10 && (this.field132[var11][var8] & 0x80) == 0) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)V")
    private final void method82(int arg0, int arg1, int arg2, int arg3) {
        field136++;
        if (arg3 == -11441) {
            this.field132[arg2][arg1] = class139.method876(this.field132[arg2][arg1], ~arg0);
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(II)V")
    public class8(int arg0, int arg1) {
        this.field143 = arg0;
        this.field120 = arg1;
        this.field119 = 0;
        this.field132 = new int[this.field143][this.field120];
        this.method69((byte) 91);
    }
}
