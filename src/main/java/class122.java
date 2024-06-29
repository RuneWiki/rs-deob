import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class122 {

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    private int field2655 = 0;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    private int field2663 = 0;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
    private int field2665;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    private int field2644;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "[[I")
    public int[][] field2662;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Llc;")
    public static class69 field2639 = class69.method470((byte) -120, "scrollbar");

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static volatile int field2640 = 0;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "Llc;")
    public static class69 field2650 = class69.method470((byte) -95, "Take @lre@");

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field2654 = 128;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "Llc;")
    public static class69 field2657 = class69.method470((byte) -124, "Chat panel redrawn");

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Llc;")
    public static class69 field2659 = class69.method470((byte) -103, "scroll:");

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field2656 = 0;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Llc;")
    public static class69 field2636 = class69.method470((byte) -123, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field2660 = 0;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Llc;")
    public static class69 field2642 = class69.method470((byte) -103, "Import complete");

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "Llc;")
    public static class69 field2668 = class69.method470((byte) -124, "Aug");

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    public static int field2666 = 2;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "Llc;")
    public static class69 field2669 = class69.method470((byte) -108, "Walk here");

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Lkc;")
    public static class63 field2647;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "[Lcb;")
    public static class15[] field2670;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZIIIII)V")
    public final void method899(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2643++;
        int var8 = arg5 - this.field2663;
        int var9 = 256;
        if (arg4 != 4681) {
            this.method899(-56, false, -95, -22, 42, 97, 18);
        }
        if (arg6 == 1 || arg6 == 3) {
            int var10 = arg2;
            arg2 = arg3;
            arg3 = var10;
        }
        int var11 = arg0 - this.field2655;
        if (arg1) {
            var9 += 131072;
        }
        for (int var12 = var11; var12 < var11 + arg2; var12++) {
            if (var12 >= 0 && this.field2665 > var12) {
                for (int var13 = var8; var13 < var8 + arg3; var13++) {
                    if (var13 >= 0 && this.field2644 > var13) {
                        this.method909(var13, var9, var12, 181);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
    public static final Class method900(String arg0, boolean arg1) throws ClassNotFoundException {
        field2661++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else {
            if (!arg1) {
                field2640 = 84;
            }
            if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBII)V")
    private final void method901(int arg0, byte arg1, int arg2, int arg3) {
        field2658++;
        this.field2662[arg2][arg3] = class23.method151(this.field2662[arg2][arg3], 16777215 - arg0);
        if (arg1 >= -74) {
            this.method905(-30, 85, 4, -127, false, -45);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public final void method902(int arg0) {
        for (int var2 = 0; var2 < this.field2665; var2++) {
            for (int var3 = 0; var3 < this.field2644; var3++) {
                if (var2 == 0 || var3 == 0 || this.field2665 - 1 == var2 || this.field2644 - 1 == var3) {
                    this.field2662[var2][var3] = 16777215;
                } else {
                    this.field2662[var2][var3] = 16777216;
                }
            }
        }
        if (arg0 == -5148) {
            field2641++;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIZI)Z")
    public final boolean method903(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field2645++;
        if (arg1 == arg3 && arg2 == arg4) {
            return true;
        }
        int var8 = arg1 - this.field2655;
        if (arg5) {
            field2653 = 0;
        }
        int var9 = arg3 - this.field2655;
        int var10 = arg4 - this.field2663;
        int var11 = arg2 - this.field2663;
        if (arg6 == 6 || arg6 == 7) {
            if (arg6 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var8 + 1 == var9 && var10 == var11 && (this.field2662[var9][var11] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field2662[var9][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var8 - 1 == var9 && var10 == var11 && (this.field2662[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field2662[var9][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var8 - 1 == var9 && var10 == var11 && (this.field2662[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field2662[var9][var11] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var8 + 1 == var9 && var10 == var11 && (this.field2662[var9][var11] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field2662[var9][var11] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 8) {
            if (var8 == var9 && var10 + 1 == var11 && (this.field2662[var9][var11] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var10 - 1 == var11 && (this.field2662[var9][var11] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var9 && var10 == var11 && (this.field2662[var9][var11] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var9 && var10 == var11 && (this.field2662[var9][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method904(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2664++;
        int var9 = arg1 + arg6 - 1;
        int var10 = arg0 + arg4 - 1;
        if (arg3 >= arg0 && arg3 <= var10 && arg1 <= arg7 && var9 >= arg7) {
            return true;
        } else if (arg0 - 1 == arg3 && arg7 >= arg1 && arg7 <= var9 && (this.field2662[arg3 - this.field2655][arg7 - this.field2663] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if (arg5 + var10 == arg3 && arg1 <= arg7 && arg7 <= var9 && (this.field2662[arg3 - this.field2655][arg7 - this.field2663] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg7 && arg0 <= arg3 && arg3 <= var10 && (this.field2662[arg3 - this.field2655][arg7 - this.field2663] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return var9 + 1 == arg7 && arg3 >= arg0 && arg3 <= var10 && (this.field2662[arg3 - this.field2655][arg7 - this.field2663] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIZI)V")
    public final void method905(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg0 - this.field2663;
        int var8 = arg2 - this.field2655;
        int var9 = -103 / ((arg5 + 62) / 40);
        field2646++;
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method909(var7, 128, var8, 181);
                this.method909(var7, 8, var8 - 1, 181);
            }
            if (arg1 == 1) {
                this.method909(var7, 2, var8, 181);
                this.method909(var7 + 1, 32, var8, 181);
            }
            if (arg1 == 2) {
                this.method909(var7, 8, var8, 181);
                this.method909(var7, 128, var8 + 1, 181);
            }
            if (arg1 == 3) {
                this.method909(var7, 32, var8, 181);
                this.method909(var7 - 1, 2, var8, 181);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method909(var7, 1, var8, 181);
                this.method909(var7 + 1, 16, var8 - 1, 181);
            }
            if (arg1 == 1) {
                this.method909(var7, 4, var8, 181);
                this.method909(var7 + 1, 64, var8 + 1, 181);
            }
            if (arg1 == 2) {
                this.method909(var7, 16, var8, 181);
                this.method909(var7 - 1, 1, var8 + 1, 181);
            }
            if (arg1 == 3) {
                this.method909(var7, 64, var8, 181);
                this.method909(var7 - 1, 4, var8 - 1, 181);
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method909(var7, 130, var8, 181);
                this.method909(var7, 8, var8 - 1, 181);
                this.method909(var7 + 1, 32, var8, 181);
            }
            if (arg1 == 1) {
                this.method909(var7, 10, var8, 181);
                this.method909(var7 + 1, 32, var8, 181);
                this.method909(var7, 128, var8 + 1, 181);
            }
            if (arg1 == 2) {
                this.method909(var7, 40, var8, 181);
                this.method909(var7, 128, var8 + 1, 181);
                this.method909(var7 - 1, 2, var8, 181);
            }
            if (arg1 == 3) {
                this.method909(var7, 160, var8, 181);
                this.method909(var7 - 1, 2, var8, 181);
                this.method909(var7, 8, var8 - 1, 181);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method909(var7, 65536, var8, 181);
                this.method909(var7, 4096, var8 - 1, 181);
            }
            if (arg1 == 1) {
                this.method909(var7, 1024, var8, 181);
                this.method909(var7 + 1, 16384, var8, 181);
            }
            if (arg1 == 2) {
                this.method909(var7, 4096, var8, 181);
                this.method909(var7, 65536, var8 + 1, 181);
            }
            if (arg1 == 3) {
                this.method909(var7, 16384, var8, 181);
                this.method909(var7 - 1, 1024, var8, 181);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method909(var7, 512, var8, 181);
                this.method909(var7 + 1, 8192, var8 - 1, 181);
            }
            if (arg1 == 1) {
                this.method909(var7, 2048, var8, 181);
                this.method909(var7 + 1, 32768, var8 + 1, 181);
            }
            if (arg1 == 2) {
                this.method909(var7, 8192, var8, 181);
                this.method909(var7 - 1, 512, var8 + 1, 181);
            }
            if (arg1 == 3) {
                this.method909(var7, 32768, var8, 181);
                this.method909(var7 - 1, 2048, var8 - 1, 181);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method909(var7, 66560, var8, 181);
            this.method909(var7, 4096, var8 - 1, 181);
            this.method909(var7 + 1, 16384, var8, 181);
        }
        if (arg1 == 1) {
            this.method909(var7, 5120, var8, 181);
            this.method909(var7 + 1, 16384, var8, 181);
            this.method909(var7, 65536, var8 + 1, 181);
        }
        if (arg1 == 2) {
            this.method909(var7, 20480, var8, 181);
            this.method909(var7, 65536, var8 + 1, 181);
            this.method909(var7 - 1, 1024, var8, 181);
        }
        if (arg1 == 3) {
            this.method909(var7, 81920, var8, 181);
            this.method909(var7 - 1, 1024, var8, 181);
            this.method909(var7, 4096, var8 - 1, 181);
            return;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public static void method906(int arg0) {
        field2650 = null;
        field2670 = null;
        field2669 = null;
        field2642 = null;
        field2657 = null;
        field2659 = null;
        field2668 = null;
        field2647 = null;
        field2639 = null;
        field2636 = null;
        if (arg0 != 1) {
            method911(-52);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIBZI)V")
    public final void method907(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6) {
        int var8 = arg6 - this.field2655;
        field2651++;
        if (arg3 == 1 || arg3 == 3) {
            int var9 = arg0;
            arg0 = arg2;
            arg2 = var9;
        }
        int var10 = 256;
        if (arg5) {
            var10 += 131072;
        }
        int var11 = arg1 - this.field2663;
        if (arg4 != 27) {
            return;
        }
        for (int var12 = var8; var12 < arg0 + var8; var12++) {
            if (var12 >= 0 && var12 < this.field2665) {
                for (int var13 = var11; var13 < arg2 + var11; var13++) {
                    if (var13 >= 0 && this.field2644 > var13) {
                        this.method901(var10, (byte) -93, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BII)V")
    public final void method908(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field2655;
        field2637++;
        int var5 = arg2 - this.field2663;
        this.field2662[var4][var5] = class107.method795(this.field2662[var4][var5], 2097152);
        if (arg0 < 4) {
            field2666 = -107;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)V")
    private final void method909(int arg0, int arg1, int arg2, int arg3) {
        this.field2662[arg2][arg0] = class107.method795(this.field2662[arg2][arg0], arg1);
        if (arg3 != 181) {
            field2650 = null;
        }
        field2649++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIZIII)V")
    public final void method910(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg5 - this.field2663;
        field2652++;
        int var8 = arg0 - this.field2655;
        if (arg4 != -5146) {
            return;
        }
        if (arg1 == 0) {
            if (arg3 == 0) {
                this.method901(128, (byte) -124, var8, var7);
                this.method901(8, (byte) -127, var8 - 1, var7);
            }
            if (arg3 == 1) {
                this.method901(2, (byte) -105, var8, var7);
                this.method901(32, (byte) -94, var8, var7 + 1);
            }
            if (arg3 == 2) {
                this.method901(8, (byte) -124, var8, var7);
                this.method901(128, (byte) -105, var8 + 1, var7);
            }
            if (arg3 == 3) {
                this.method901(32, (byte) -128, var8, var7);
                this.method901(2, (byte) -114, var8, var7 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg3 == 0) {
                this.method901(1, (byte) -76, var8, var7);
                this.method901(16, (byte) -124, var8 - 1, var7 + 1);
            }
            if (arg3 == 1) {
                this.method901(4, (byte) -81, var8, var7);
                this.method901(64, (byte) -122, var8 + 1, var7 - -1);
            }
            if (arg3 == 2) {
                this.method901(16, (byte) -101, var8, var7);
                this.method901(1, (byte) -88, var8 + 1, var7 - 1);
            }
            if (arg3 == 3) {
                this.method901(64, (byte) -88, var8, var7);
                this.method901(4, (byte) -87, var8 - 1, var7 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg3 == 0) {
                this.method901(130, (byte) -78, var8, var7);
                this.method901(8, (byte) -89, var8 - 1, var7);
                this.method901(32, (byte) -75, var8, var7 + 1);
            }
            if (arg3 == 1) {
                this.method901(10, (byte) -101, var8, var7);
                this.method901(32, (byte) -113, var8, var7 + 1);
                this.method901(128, (byte) -110, var8 + 1, var7);
            }
            if (arg3 == 2) {
                this.method901(40, (byte) -95, var8, var7);
                this.method901(128, (byte) -86, var8 + 1, var7);
                this.method901(2, (byte) -99, var8, var7 - 1);
            }
            if (arg3 == 3) {
                this.method901(160, (byte) -84, var8, var7);
                this.method901(2, (byte) -96, var8, var7 - 1);
                this.method901(8, (byte) -108, var8 - 1, var7);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg1 == 0) {
            if (arg3 == 0) {
                this.method901(65536, (byte) -108, var8, var7);
                this.method901(4096, (byte) -118, var8 - 1, var7);
            }
            if (arg3 == 1) {
                this.method901(1024, (byte) -78, var8, var7);
                this.method901(16384, (byte) -120, var8, var7 + 1);
            }
            if (arg3 == 2) {
                this.method901(4096, (byte) -94, var8, var7);
                this.method901(65536, (byte) -112, var8 + 1, var7);
            }
            if (arg3 == 3) {
                this.method901(16384, (byte) -121, var8, var7);
                this.method901(1024, (byte) -76, var8, var7 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg3 == 0) {
                this.method901(512, (byte) -80, var8, var7);
                this.method901(8192, (byte) -100, var8 - 1, var7 + 1);
            }
            if (arg3 == 1) {
                this.method901(2048, (byte) -118, var8, var7);
                this.method901(32768, (byte) -126, var8 + 1, var7 + 1);
            }
            if (arg3 == 2) {
                this.method901(8192, (byte) -128, var8, var7);
                this.method901(512, (byte) -96, var8 + 1, var7 + -1);
            }
            if (arg3 == 3) {
                this.method901(32768, (byte) -94, var8, var7);
                this.method901(2048, (byte) -78, var8 - 1, var7 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method901(66560, (byte) -79, var8, var7);
            this.method901(4096, (byte) -89, var8 - 1, var7);
            this.method901(16384, (byte) -81, var8, var7 + 1);
        }
        if (arg3 == 1) {
            this.method901(5120, (byte) -101, var8, var7);
            this.method901(16384, (byte) -81, var8, var7 + 1);
            this.method901(65536, (byte) -110, var8 + 1, var7);
        }
        if (arg3 == 2) {
            this.method901(20480, (byte) -113, var8, var7);
            this.method901(65536, (byte) -124, var8 + 1, var7);
            this.method901(1024, (byte) -112, var8, var7 - 1);
        }
        if (arg3 == 3) {
            this.method901(81920, (byte) -115, var8, var7);
            this.method901(1024, (byte) -105, var8, var7 - 1);
            this.method901(4096, (byte) -128, var8 - 1, var7);
            return;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
    public static final void method911(int arg0) {
        field2638++;
        if (class50.field1094 > 0) {
            class82.method592(true);
            return;
        }
        class89.method626(40, (byte) 112);
        if (arg0 != 797) {
            method911(-71);
        }
        class102.field2211 = class106.field2298;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIIIIII)Z")
    public final boolean method912(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2667++;
        if (arg2 == arg6 && arg3 == arg5) {
            return true;
        }
        int var8 = arg3 - this.field2663;
        int var9 = arg2 - this.field2655;
        if (arg0) {
            return false;
        }
        int var10 = arg6 - this.field2655;
        int var11 = arg5 - this.field2663;
        if (arg1 == 0) {
            if (arg4 == 0) {
                if (var9 - 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field2662[var10][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field2662[var10][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var9 - 1 == var10 && var8 == var11 && (this.field2662[var10][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field2662[var10][var11] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var9 + 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field2662[var10][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field2662[var10][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
                if (var9 - 1 == var10 && var8 == var11 && (this.field2662[var10][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field2662[var10][var11] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 2) {
            if (arg4 == 0) {
                if (var9 - 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field2662[var10][var11] & 0x1280180) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field2662[var10][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field2662[var10][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11 && (this.field2662[var10][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field2662[var10][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field2662[var10][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var9 - 1 == var10 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var8 + 1 == var11 && (this.field2662[var10][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 + 1 == var10 && var8 == var11 && (this.field2662[var10][var11] & 0x1280180) == 0) {
                    return true;
                }
                if (var9 == var10 && var8 - 1 == var11) {
                    return true;
                }
            }
        }
        if (arg1 == 9) {
            if (var9 == var10 && var8 + 1 == var11 && (this.field2662[var10][var11] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var8 - 1 == var11 && (this.field2662[var10][var11] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var10 && var8 == var11 && (this.field2662[var10][var11] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var10 && var8 == var11 && (this.field2662[var10][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IBI)V")
    public final void method913(int arg0, byte arg1, int arg2) {
        field2648++;
        if (arg1 > -90) {
            this.method902(-26);
        }
        int var4 = arg2 - this.field2663;
        int var5 = arg0 - this.field2655;
        this.field2662[var5][var4] = class23.method151(this.field2662[var5][var4], 14680063);
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(II)V")
    public class122(int arg0, int arg1) {
        this.field2665 = arg0;
        this.field2644 = arg1;
        this.field2662 = new int[this.field2665][this.field2644];
        this.method902(-5148);
    }
}
