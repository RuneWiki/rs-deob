import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class1 {

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    private int field23;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    private int field15;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    private int field10;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    private int field24;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "[[I")
    public int[][] field11;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "Lhh;")
    public static class163 field12 = class137.method1065("huffman", 17);

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "Lhh;")
    public static class163 field16 = class137.method1065("<br>(X", 17);

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lhh;")
    public static class163 field5 = class137.method1065(" loggt sich aus)3", 17);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[Lrh;")
    public static class242[] field3;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIII)Z")
    public final boolean method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field22++;
        if (arg4 > 1) {
            return this.method3(arg1, arg0, arg4, arg3, 27324, arg8, arg2, arg5, arg4) ? true : this.method13(arg4, arg0, arg2, arg7, (byte) 108, arg8, arg1, arg4, arg3, arg5);
        }
        int var10 = arg8 + arg0 - 1;
        int var11 = arg3 + arg5 - 1;
        if (arg6 >= -120) {
            return true;
        } else if (arg8 <= arg1 && arg1 <= var10 && arg2 >= arg5 && arg2 <= var11) {
            return true;
        } else if ((arg8 - 1) == arg1 && arg2 >= arg5 && arg2 <= var11 && (this.field11[arg1 - this.field15][arg2 - this.field10] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg1 && arg2 >= arg5 && var11 >= arg2 && (this.field11[arg1 - this.field15][arg2 - this.field10] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if ((arg5 - 1) == arg2 && arg8 <= arg1 && arg1 <= var10 && (this.field11[arg1 - this.field15][arg2 - this.field10] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg2 && arg1 >= arg8 && var10 >= arg1 && (this.field11[arg1 - this.field15][arg2 - this.field10] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)V")
    public final void method2(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field15;
        int var5 = 76 % ((-arg1 - 31) / 57);
        field20++;
        int var6 = arg2 - this.field10;
        this.field11[var4][var6] = class3.method27(this.field11[var4][var6], 262144);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIIIIIIII)Z")
    private final boolean method3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field19++;
        if (arg4 != 27324) {
            this.method7(-84, -86, (byte) -15, -76);
        }
        if (arg0 < arg1 + arg5 && arg0 + arg8 > arg5) {
            return arg6 < arg3 + arg7 && arg2 + arg6 > arg7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static void method4(byte arg0) {
        if (arg0 != -121) {
            return;
        }
        field2 = null;
        field16 = null;
        field12 = null;
        field3 = null;
        field5 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIII)V")
    private final void method5(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 28 % ((-arg0 - 22) / 47);
        field4++;
        this.field11[arg1][arg3] = class7.method50(this.field11[arg1][arg3], ~arg2);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIII)V")
    public static final void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field29++;
        int var6 = arg1 - arg3;
        int var7 = arg2 - arg5;
        if (var6 == 0) {
            if (var7 != 0) {
                class160.method1175(arg2, arg3, arg5, arg4, 5207);
            }
        } else if (var7 == 0) {
            class201.method1436((byte) -111, arg3, arg4, arg1, arg5);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg5 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (class127.field2465 > arg3) {
                var11 = class127.field2465;
                var10 = (class127.field2465 * var8 >> 12) + var9;
            } else if (class252.field4407 >= arg3) {
                var10 = arg5;
                var11 = arg3;
            } else {
                var10 = (class252.field4407 * var8 >> 12) + var9;
                var11 = class252.field4407;
            }
            if (var10 < class182.field3344) {
                var11 = (class182.field3344 - var9 << 12) / var8;
                var10 = class182.field3344;
            } else if (class201.field3593 < var10) {
                var10 = class201.field3593;
                var11 = (class201.field3593 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (arg1 < class127.field2465) {
                var12 = (class127.field2465 * var8 >> 12) + var9;
                var13 = class127.field2465;
            } else if (class252.field4407 >= arg1) {
                var12 = arg2;
                var13 = arg1;
            } else {
                var12 = var9 + (class252.field4407 * var8 >> 12);
                var13 = class252.field4407;
            }
            if (class182.field3344 > var12) {
                var12 = class182.field3344;
                var13 = (class182.field3344 - var9 << 12) / var8;
            } else if (class201.field3593 < var12) {
                var12 = class201.field3593;
                var13 = (class201.field3593 - var9 << 12) / var8;
            }
            if (arg0 != 928944748) {
                field16 = null;
            }
            class71.method521(var11, (byte) -61, var13, var10, arg4, var12);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIBI)V")
    private final void method7(int arg0, int arg1, byte arg2, int arg3) {
        this.field11[arg1][arg3] = class3.method27(this.field11[arg1][arg3], arg0);
        if (arg2 <= -29) {
            field6++;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public final void method8(int arg0) {
        field18++;
        for (int var2 = 0; var2 < this.field23; var2++) {
            for (int var3 = 0; var3 < this.field24; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field23 - 5) || var3 >= this.field24 - 5) {
                    this.field11[var2][var3] = 16777215;
                } else {
                    this.field11[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 <= 33) {
            this.method1(64, 118, -107, 83, 119, -41, -59, 52, 95);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BII)V")
    public final void method9(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field10;
        field8++;
        int var5 = arg2 - this.field15;
        this.field11[var5][var4] = class7.method50(this.field11[var5][var4], -262145);
        if (arg0 < 15) {
            field26 = 75;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field28++;
        if (arg7 != 0) {
            field16 = null;
        }
        if (arg5 == 1) {
            if (arg2 == arg3 && arg0 == arg6) {
                return true;
            }
        } else if (arg2 <= arg3 && arg3 <= arg2 - (1 - arg5) && arg0 >= arg0 && arg0 <= (arg0 + arg5 - 1)) {
            return true;
        }
        int var9 = arg0 - this.field10;
        int var10 = arg6 - this.field10;
        int var11 = arg2 - this.field15;
        int var12 = arg3 - this.field15;
        if (arg5 == 1) {
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var12 + 1 == var11 && var9 == var10 && (this.field11[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field11[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field11[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var9 - 1) == var10 && (this.field11[var11][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field11[var11][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field11[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var12 + 1 == var11 && var9 == var10 && (this.field11[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var9 + 1 == var10 && (this.field11[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var11 == var12 && (var9 + 1) == var10 && (this.field11[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var9 - 1 == var10 && (this.field11[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if (var12 - 1 == var11 && var9 == var10 && (this.field11[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var11 && var9 == var10 && (this.field11[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg5 + var11 - 1;
            int var14 = var10 + arg5 - 1;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if (var12 + 1 == var11 && var9 >= var10 && var9 <= var14 && (this.field11[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && (var9 - arg5) == var10 && (this.field11[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var12 - arg5 == var11 && var9 >= var10 && var9 <= var14 && (this.field11[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && (var9 - arg5) == var10 && (this.field11[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var12 - arg5) == var11 && var9 >= var10 && var9 <= var14 && (this.field11[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && var9 + 1 == var10 && (this.field11[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var12 + 1 == var11 && var10 <= var9 && var14 >= var9 && (this.field11[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var9 + 1 == var10 && (this.field11[var12][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var12 >= var11 && var12 <= var13 && (var9 + 1) == var10 && (this.field11[var12][var10] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var11 && var12 <= var13 && (var9 - arg5) == var10 && (this.field11[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg5 == var11 && var10 <= var9 && var9 <= var14 && (this.field11[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 >= var10 && var14 >= var9 && (this.field11[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZIIIBI)V")
    public final void method11(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var7 = arg5 - this.field10;
        field7++;
        int var8 = arg2 - this.field15;
        if (arg1 == 0) {
            if (arg3 == 0) {
                this.method7(128, var8, (byte) -115, var7);
                this.method7(8, var8 - 1, (byte) -79, var7);
            }
            if (arg3 == 1) {
                this.method7(2, var8, (byte) -107, var7);
                this.method7(32, var8, (byte) -71, var7 + 1);
            }
            if (arg3 == 2) {
                this.method7(8, var8, (byte) -85, var7);
                this.method7(128, var8 + 1, (byte) -88, var7);
            }
            if (arg3 == 3) {
                this.method7(32, var8, (byte) -32, var7);
                this.method7(2, var8, (byte) -40, var7 - 1);
            }
        }
        int var9 = -61 % ((1 - arg4) / 42);
        if (arg1 == 1 || arg1 == 3) {
            if (arg3 == 0) {
                this.method7(1, var8, (byte) -105, var7);
                this.method7(16, var8 - 1, (byte) -112, var7 + 1);
            }
            if (arg3 == 1) {
                this.method7(4, var8, (byte) -42, var7);
                this.method7(64, var8 + 1, (byte) -87, var7 + 1);
            }
            if (arg3 == 2) {
                this.method7(16, var8, (byte) -101, var7);
                this.method7(1, var8 + 1, (byte) -89, var7 - 1);
            }
            if (arg3 == 3) {
                this.method7(64, var8, (byte) -69, var7);
                this.method7(4, var8 - 1, (byte) -74, var7 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg3 == 0) {
                this.method7(130, var8, (byte) -82, var7);
                this.method7(8, var8 - 1, (byte) -43, var7);
                this.method7(32, var8, (byte) -68, var7 + 1);
            }
            if (arg3 == 1) {
                this.method7(10, var8, (byte) -93, var7);
                this.method7(32, var8, (byte) -43, var7 + 1);
                this.method7(128, var8 + 1, (byte) -85, var7);
            }
            if (arg3 == 2) {
                this.method7(40, var8, (byte) -84, var7);
                this.method7(128, var8 + 1, (byte) -100, var7);
                this.method7(2, var8, (byte) -67, var7 - 1);
            }
            if (arg3 == 3) {
                this.method7(160, var8, (byte) -47, var7);
                this.method7(2, var8, (byte) -48, var7 - 1);
                this.method7(8, var8 - 1, (byte) -114, var7);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg1 == 0) {
            if (arg3 == 0) {
                this.method7(65536, var8, (byte) -47, var7);
                this.method7(4096, var8 - 1, (byte) -119, var7);
            }
            if (arg3 == 1) {
                this.method7(1024, var8, (byte) -30, var7);
                this.method7(16384, var8, (byte) -113, var7 + 1);
            }
            if (arg3 == 2) {
                this.method7(4096, var8, (byte) -69, var7);
                this.method7(65536, var8 + 1, (byte) -58, var7);
            }
            if (arg3 == 3) {
                this.method7(16384, var8, (byte) -61, var7);
                this.method7(1024, var8, (byte) -87, var7 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg3 == 0) {
                this.method7(512, var8, (byte) -113, var7);
                this.method7(8192, var8 - 1, (byte) -52, var7 + 1);
            }
            if (arg3 == 1) {
                this.method7(2048, var8, (byte) -63, var7);
                this.method7(32768, var8 + 1, (byte) -76, var7 + 1);
            }
            if (arg3 == 2) {
                this.method7(8192, var8, (byte) -55, var7);
                this.method7(512, var8 + 1, (byte) -94, var7 - 1);
            }
            if (arg3 == 3) {
                this.method7(32768, var8, (byte) -57, var7);
                this.method7(2048, var8 - 1, (byte) -126, var7 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method7(66560, var8, (byte) -84, var7);
            this.method7(4096, var8 - 1, (byte) -59, var7);
            this.method7(16384, var8, (byte) -92, var7 + 1);
        }
        if (arg3 == 1) {
            this.method7(5120, var8, (byte) -35, var7);
            this.method7(16384, var8, (byte) -85, var7 + 1);
            this.method7(65536, var8 + 1, (byte) -122, var7);
        }
        if (arg3 == 2) {
            this.method7(20480, var8, (byte) -101, var7);
            this.method7(65536, var8 + 1, (byte) -39, var7);
            this.method7(1024, var8, (byte) -63, var7 - 1);
        }
        if (arg3 == 3) {
            this.method7(81920, var8, (byte) -92, var7);
            this.method7(1024, var8, (byte) -84, var7 - 1);
            this.method7(4096, var8 - 1, (byte) -33, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIZII)Z")
    public final boolean method12(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field13++;
        if (arg3 == 1) {
            if (arg0 == arg1 && arg2 == arg7) {
                return true;
            }
        } else if (arg0 <= arg1 && arg0 + arg3 - 1 >= arg1 && arg2 <= arg2 && (arg2 + arg3 - 1) >= arg2) {
            return true;
        }
        int var9 = arg1 - this.field15;
        int var10 = arg7 - this.field10;
        int var11 = arg0 - this.field15;
        int var12 = arg2 - this.field10;
        if (!arg5) {
            this.method7(124, -57, (byte) -13, 30);
        }
        if (arg3 == 1) {
            if (arg4 == 0) {
                if (arg6 == 0) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field11[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field11[var11][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 == var11 && var12 + 1 == var10) {
                        return true;
                    }
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field11[var11][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field11[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field11[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field11[var11][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field11[var11][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field11[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg6 == 0) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field11[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field11[var11][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field11[var11][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field11[var11][var10] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field11[var11][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field11[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field11[var11][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field11[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var9 == var11 && var12 + 1 == var10 && (this.field11[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field11[var11][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var11 && var10 == var12 && (this.field11[var11][var10] & 0x8) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var10 == var12 && (this.field11[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg3 + var11 - 1;
            int var14 = arg3 + var10 - 1;
            if (arg4 == 0) {
                if (arg6 == 0) {
                    if (var9 - arg3 == var11 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var12 + 1 == var10 && (this.field11[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var12 - arg3 == var10 && (this.field11[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if (var11 <= var9 && var13 >= var9 && (var12 + 1) == var10) {
                        return true;
                    }
                    if ((var9 - arg3) == var11 && var10 <= var12 && var12 <= var14 && (this.field11[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 >= var10 && var14 >= var12 && (this.field11[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var9 + 1 == var11 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && (var12 + 1) == var10 && (this.field11[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var12 - arg3 == var10 && (this.field11[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var11 <= var9 && var13 >= var9 && (var12 - arg3) == var10) {
                        return true;
                    }
                    if ((var9 - arg3) == var11 && var12 >= var10 && var12 <= var14 && (this.field11[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 >= var10 && var14 >= var12 && (this.field11[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg6 == 0) {
                    if (var9 - arg3 == var11 && var12 >= var10 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var12 + 1) == var10) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 >= var10 && var14 >= var12 && (this.field11[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var12 - arg3 == var10 && (this.field11[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 1) {
                    if ((var9 - arg3) == var11 && var12 >= var10 && var14 >= var12 && (this.field11[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && var12 + 1 == var10) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var12 - arg3 == var10 && (this.field11[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg6 == 2) {
                    if (var9 - arg3 == var11 && var12 >= var10 && var14 >= var12 && (this.field11[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && var12 + 1 == var10 && (this.field11[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var12 - arg3 == var10) {
                        return true;
                    }
                } else if (arg6 == 3) {
                    if (var9 - arg3 == var11 && var12 >= var10 && var14 >= var12) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var12 + 1) == var10 && (this.field11[var9][var10] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 >= var10 && var12 <= var14 && (this.field11[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var12 - arg3 == var10) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var9 >= var11 && var9 <= var13 && var12 + 1 == var10 && (this.field11[var9][var10] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 <= var9 && var13 >= var9 && (var12 - arg3) == var10 && (this.field11[var9][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if ((var9 - arg3) == var11 && var10 <= var12 && var14 >= var12 && (this.field11[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var12 >= var10 && var14 >= var12 && (this.field11[var11][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIBIIIII)Z")
    private final boolean method13(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field21++;
        int var11 = arg0 + arg6;
        int var12 = arg1 + arg5;
        int var13 = arg8 + arg9;
        int var14 = 46 % ((arg4 - 49) / 51);
        int var15 = arg2 + arg7;
        if (arg5 <= arg6 && var12 > arg6) {
            if (arg9 == var15 && (arg3 & 0x4) == 0) {
                int var16 = arg6;
                int var17 = var12 < var11 ? var12 : var11;
                while (var17 > var16) {
                    if ((this.field11[var16 - this.field15][var15 - this.field10 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var16++;
                }
            } else if (arg2 == var13 && (arg3 & 0x1) == 0) {
                int var18 = var12 < var11 ? var12 : var11;
                for (int var19 = arg6; var19 < var18; var19++) {
                    if ((this.field11[var19 - this.field15][arg2 - this.field10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg5 < var11 && var12 >= var11) {
            if (arg9 == var15 && (arg3 & 0x4) == 0) {
                for (int var20 = arg5; var20 < var11; var20++) {
                    if ((this.field11[var20 - this.field15][var15 - this.field10 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg2 == var13 && (arg3 & 0x1) == 0) {
                for (int var21 = arg5; var21 < var11; var21++) {
                    if ((this.field11[var21 - this.field15][arg2 - this.field10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg9 <= arg2 && var13 > arg2) {
            if (arg5 == var11 && (arg3 & 0x8) == 0) {
                int var22 = arg2;
                int var23 = var13 >= var15 ? var15 : var13;
                while (var23 > var22) {
                    if ((this.field11[var11 - this.field15 - 1][var22 - this.field10] & 0x8) == 0) {
                        return true;
                    }
                    var22++;
                }
            } else if (arg6 == var12 && (arg3 & 0x2) == 0) {
                int var24 = arg2;
                int var25 = var13 < var15 ? var13 : var15;
                while (var24 < var25) {
                    if ((this.field11[arg6 - this.field15][var24 - this.field10] & 0x80) == 0) {
                        return true;
                    }
                    var24++;
                }
            }
        } else if (arg9 < var15 && var13 >= var15) {
            if (arg5 == var11 && (arg3 & 0x8) == 0) {
                for (int var26 = arg9; var26 < var15; var26++) {
                    if ((this.field11[var11 - this.field15 - 1][var26 - this.field10] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg6 == var12 && (arg3 & 0x2) == 0) {
                for (int var27 = arg9; var27 < var15; var27++) {
                    if ((this.field11[arg6 - this.field15][var27 - this.field10] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIBIIZ)V")
    public final void method14(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg4 - this.field15;
        int var8 = arg3 - this.field10;
        field25++;
        if (arg2 != -29) {
            this.method18(false, 36, -115, (byte) -14, -37, -38);
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method5(-116, var7, 128, var8);
                this.method5(116, var7 - 1, 8, var8);
            }
            if (arg0 == 1) {
                this.method5(arg2 - 95, var7, 2, var8);
                this.method5(arg2 ^ 0xFFFFFFD2, var7, 32, var8 + 1);
            }
            if (arg0 == 2) {
                this.method5(arg2 + 155, var7, 8, var8);
                this.method5(122, var7 + 1, 128, var8);
            }
            if (arg0 == 3) {
                this.method5(arg2 ^ 0xFFFFFFC3, var7, 32, var8);
                this.method5(-79, var7, 2, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method5(-104, var7, 1, var8);
                this.method5(arg2 ^ 0xFFFFFF86, var7 - 1, 16, var8 + 1);
            }
            if (arg0 == 1) {
                this.method5(113, var7, 4, var8);
                this.method5(-111, var7 + 1, 64, var8 + 1);
            }
            if (arg0 == 2) {
                this.method5(56, var7, 16, var8);
                this.method5(118, var7 + 1, 1, var8 - 1);
            }
            if (arg0 == 3) {
                this.method5(-74, var7, 64, var8);
                this.method5(78, var7 - 1, 4, var8 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method5(-88, var7, 130, var8);
                this.method5(-107, var7 - 1, 8, var8);
                this.method5(arg2 ^ 0x64, var7, 32, var8 + 1);
            }
            if (arg0 == 1) {
                this.method5(-88, var7, 10, var8);
                this.method5(109, var7, 32, var8 + 1);
                this.method5(-106, var7 + 1, 128, var8);
            }
            if (arg0 == 2) {
                this.method5(-69, var7, 40, var8);
                this.method5(arg2 - 61, var7 - -1, 128, var8);
                this.method5(-115, var7, 2, var8 - 1);
            }
            if (arg0 == 3) {
                this.method5(-120, var7, 160, var8);
                this.method5(arg2 - 88, var7, 2, var8 - 1);
                this.method5(-76, var7 - 1, 8, var8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method5(113, var7, 65536, var8);
                this.method5(113, var7 - 1, 4096, var8);
            }
            if (arg0 == 1) {
                this.method5(114, var7, 1024, var8);
                this.method5(arg2 ^ 0x75, var7, 16384, var8 + 1);
            }
            if (arg0 == 2) {
                this.method5(79, var7, 4096, var8);
                this.method5(-125, var7 + 1, 65536, var8);
            }
            if (arg0 == 3) {
                this.method5(arg2 + 121, var7, 16384, var8);
                this.method5(105, var7, 1024, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method5(120, var7, 512, var8);
                this.method5(arg2 - 73, var7 + -1, 8192, var8 + 1);
            }
            if (arg0 == 1) {
                this.method5(117, var7, 2048, var8);
                this.method5(-119, var7 + 1, 32768, var8 + 1);
            }
            if (arg0 == 2) {
                this.method5(-95, var7, 8192, var8);
                this.method5(-97, var7 + 1, 512, var8 - 1);
            }
            if (arg0 == 3) {
                this.method5(-93, var7, 32768, var8);
                this.method5(arg2 ^ 0x51, var7 - 1, 2048, var8 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method5(-99, var7, 66560, var8);
            this.method5(54, var7 - 1, 4096, var8);
            this.method5(42, var7, 16384, var8 + 1);
        }
        if (arg0 == 1) {
            this.method5(78, var7, 5120, var8);
            this.method5(arg2 + 146, var7, 16384, var8 + 1);
            this.method5(-113, var7 + 1, 65536, var8);
        }
        if (arg0 == 2) {
            this.method5(-118, var7, 20480, var8);
            this.method5(-123, var7 + 1, 65536, var8);
            this.method5(-91, var7, 1024, var8 - 1);
        }
        if (arg0 == 3) {
            this.method5(89, var7, 81920, var8);
            this.method5(124, var7, 1024, var8 - 1);
            this.method5(119, var7 - 1, 4096, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIB)Lhh;")
    public static final class163 method15(int arg0, int arg1, byte arg2) {
        int var3 = 117 / ((arg2 + 25) / 53);
        field9++;
        int var4 = arg1 - arg0;
        if (var4 < -9) {
            return class129.field2511;
        } else if (var4 < -6) {
            return class126.field2431;
        } else if (var4 < -3) {
            return class102.field1960;
        } else if (var4 < 0) {
            return class94.field1772;
        } else if (var4 > 9) {
            return class93.field1761;
        } else if (var4 > 6) {
            return class191.field3496;
        } else if (var4 > 3) {
            return class217.field3941;
        } else if (var4 > 0) {
            return class135.field2618;
        } else {
            return class134.field2596;
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(II)V")
    public class1(int arg0, int arg1) {
        this.field23 = arg0;
        this.field15 = 0;
        this.field10 = 0;
        this.field24 = arg1;
        this.field11 = new int[this.field23][this.field24];
        this.method8(84);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(BII)V")
    public final void method16(byte arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field10;
        if (arg0 != -36) {
            this.field15 = -31;
        }
        field27++;
        int var5 = arg1 - this.field15;
        this.field11[var5][var4] = class3.method27(this.field11[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZIBIII)V")
    public final void method17(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        int var8 = arg6 - this.field10;
        int var9 = arg2 - this.field15;
        field17++;
        if (arg5 == 1 || arg5 == 3) {
            int var10 = arg0;
            arg0 = arg4;
            arg4 = var10;
        }
        int var11 = 256;
        if (arg1) {
            var11 += 131072;
        }
        if (arg3 >= -64) {
            this.method14(8, 66, (byte) 37, -108, 26, false);
        }
        for (int var12 = var9; var12 < var9 + arg0; var12++) {
            if (var12 >= 0 && var12 < this.field23) {
                for (int var13 = var8; var13 < (var8 + arg4); var13++) {
                    if (var13 >= 0 && var13 < this.field24) {
                        this.method5(-116, var12, var11, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZIIBII)V")
    public final void method18(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1++;
        int var7 = arg4 - this.field15;
        int var8 = 256;
        int var9 = arg1 - this.field10;
        if (arg0) {
            var8 += 131072;
        }
        if (arg3 != 23) {
            return;
        }
        for (int var10 = var7; var10 < (arg2 + var7); var10++) {
            if (var10 >= 0 && var10 < this.field23) {
                for (int var11 = var9; var11 < (arg5 + var9); var11++) {
                    if (var11 >= 0 && this.field24 > var11) {
                        this.method7(var8, var10, (byte) -61, var11);
                    }
                }
            }
        }
    }
}
