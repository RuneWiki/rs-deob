import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class8 {

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    private int field141 = 0;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    private int field138;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    private int field148;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    private int field152;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "[[I")
    public int[][] field142;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Z")
    public static boolean field140 = true;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "Lnk;")
    public static class95 field151 = new class95();

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "[I")
    public static int[] field153 = new int[5];

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "Lsc;")
    public static class181 field155 = class149.method967(255, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public static int field157 = 0;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    public static int field158 = 1;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field159 = 0;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "Ljh;")
    public static class250 field156;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIIIII)V")
    public final void method57(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = arg4 - this.field141;
        int var9 = 256;
        int var10 = arg5 - this.field152;
        field139++;
        if (arg0 == 1 || arg0 == 3) {
            int var11 = arg3;
            arg3 = arg2;
            arg2 = var11;
        }
        if (arg1) {
            var9 += 131072;
        }
        if (arg6 != 8657) {
            this.method60(101, -54, -2, 50, 50, 93, 11, -50);
        }
        for (int var12 = var8; var12 < (arg3 + var8); var12++) {
            if (var12 >= 0 && var12 < this.field138) {
                for (int var13 = var10; var13 < (var10 + arg2); var13++) {
                    if (var13 >= 0 && this.field148 > var13) {
                        this.method66(var9, var13, 17436672, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Ljb;ZIZLjb;)Lcc;")
    public static final class32 method58(class11 arg0, boolean arg1, int arg2, boolean arg3, class11 arg4) {
        boolean var5 = true;
        int[] var6 = arg0.method100(arg2, arg1);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg0.method91(var6[var7], arg1, arg2);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg3) {
                    var10 = arg4.method91(var9, arg1, 0);
                } else {
                    var10 = arg4.method91(0, true, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        field133++;
        if (!var5) {
            return null;
        }
        try {
            return new class32(arg0, arg4, arg2, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method59(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg7 != 1) {
            method58((class11) null, true, 20, false, (class11) null);
        }
        field132++;
        if (arg1 < arg2 + arg6 && arg1 + arg5 > arg2) {
            return (arg3 + arg8) > arg0 && arg8 < (arg0 + arg4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method60(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field131++;
        if (arg5 == 1) {
            if (arg2 == arg4 && arg1 == arg3) {
                return true;
            }
        } else if (arg2 <= arg4 && arg4 <= (arg2 + arg5 - 1) && arg3 >= arg3 && arg3 + arg5 - 1 >= arg3) {
            return true;
        }
        if (arg6 <= 115) {
            field136 = 67;
        }
        int var9 = arg2 - this.field141;
        int var10 = arg1 - this.field152;
        int var11 = arg4 - this.field141;
        int var12 = arg3 - this.field152;
        if (arg5 == 1) {
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field142[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 - 1) == var10 && (this.field142[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field142[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 - 1 == var10 && (this.field142[var9][var10] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var11 - 1) == var9 && var10 == var12 && (this.field142[var9][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var12 + 1 == var10 && (this.field142[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var11 + 1) == var9 && var10 == var12 && (this.field142[var9][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var12 + 1) == var10 && (this.field142[var9][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var9 == var11 && (var12 + 1) == var10 && (this.field142[var9][var10] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var12 - 1 == var10 && (this.field142[var9][var10] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - 1) == var9 && var10 == var12 && (this.field142[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 == var12 && (this.field142[var9][var10] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var9 - (1 - arg5);
            int var14 = var10 + arg5 - 1;
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg0 = arg0 + 2 & 0x3;
                }
                if (arg0 == 0) {
                    if ((var11 + 1) == var9 && var10 <= var12 && var14 >= var12 && (this.field142[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && (var12 - arg5) == var10 && (this.field142[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 - arg5 == var9 && var10 <= var12 && var14 >= var12 && (this.field142[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var12 - arg5 == var10 && (this.field142[var11][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var11 - arg5 == var9 && var10 <= var12 && var12 <= var14 && (this.field142[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var11 <= var13 && var12 + 1 == var10 && (this.field142[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if ((var11 + 1) == var9 && var12 >= var10 && var14 >= var12 && (this.field142[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var11 && var13 >= var11 && (var12 + 1) == var10 && (this.field142[var11][var10] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var11 >= var9 && var13 >= var11 && (var12 + 1) == var10 && (this.field142[var11][var10] & 0x20) == 0) {
                    return true;
                }
                if (var11 >= var9 && var11 <= var13 && var12 - arg5 == var10 && (this.field142[var11][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var11 - arg5) == var9 && var12 >= var10 && var14 >= var12 && (this.field142[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var11 + 1) == var9 && var10 <= var12 && var14 >= var12 && (this.field142[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIZII)V")
    public final void method61(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg0 - this.field152;
        int var8 = arg5 - this.field141;
        field134++;
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method66(128, var7, arg2 ^ 0x10A4FFB, var8);
                this.method66(8, var7, 17436672, var8 - 1);
            }
            if (arg4 == 1) {
                this.method66(2, var7, 17436672, var8);
                this.method66(32, var7 + 1, 17436672, var8);
            }
            if (arg4 == 2) {
                this.method66(8, var7, 17436672, var8);
                this.method66(128, var7, 17436672, var8 + 1);
            }
            if (arg4 == 3) {
                this.method66(32, var7, 17436672, var8);
                this.method66(2, var7 - 1, arg2 ^ 0x10A4FFB, var8);
            }
        }
        if (arg2 != 24571) {
            return;
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method66(1, var7, 17436672, var8);
                this.method66(16, var7 + 1, 17436672, var8 - 1);
            }
            if (arg4 == 1) {
                this.method66(4, var7, 17436672, var8);
                this.method66(64, var7 + 1, arg2 ^ 0x10A4FFB, var8 + 1);
            }
            if (arg4 == 2) {
                this.method66(16, var7, 17436672, var8);
                this.method66(1, var7 - 1, 17436672, var8 + 1);
            }
            if (arg4 == 3) {
                this.method66(64, var7, 17436672, var8);
                this.method66(4, var7 - 1, 17436672, var8 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg4 == 0) {
                this.method66(130, var7, arg2 ^ 0x10A4FFB, var8);
                this.method66(8, var7, 17436672, var8 - 1);
                this.method66(32, var7 + 1, 17436672, var8);
            }
            if (arg4 == 1) {
                this.method66(10, var7, 17436672, var8);
                this.method66(32, var7 + 1, 17436672, var8);
                this.method66(128, var7, 17436672, var8 + 1);
            }
            if (arg4 == 2) {
                this.method66(40, var7, 17436672, var8);
                this.method66(128, var7, 17436672, var8 + 1);
                this.method66(2, var7 - 1, 17436672, var8);
            }
            if (arg4 == 3) {
                this.method66(160, var7, 17436672, var8);
                this.method66(2, var7 - 1, arg2 + 17412101, var8);
                this.method66(8, var7, 17436672, var8 - 1);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method66(65536, var7, arg2 ^ 0x10A4FFB, var8);
                this.method66(4096, var7, 17436672, var8 - 1);
            }
            if (arg4 == 1) {
                this.method66(1024, var7, arg2 ^ 0x10A4FFB, var8);
                this.method66(16384, var7 + 1, 17436672, var8);
            }
            if (arg4 == 2) {
                this.method66(4096, var7, 17436672, var8);
                this.method66(65536, var7, 17436672, var8 + 1);
            }
            if (arg4 == 3) {
                this.method66(16384, var7, 17436672, var8);
                this.method66(1024, var7 - 1, 17436672, var8);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method66(512, var7, arg2 + 17412101, var8);
                this.method66(8192, var7 + 1, 17436672, var8 - 1);
            }
            if (arg4 == 1) {
                this.method66(2048, var7, arg2 + 17412101, var8);
                this.method66(32768, var7 + 1, 17436672, var8 + 1);
            }
            if (arg4 == 2) {
                this.method66(8192, var7, arg2 + 17412101, var8);
                this.method66(512, var7 - 1, arg2 + 17412101, var8 + 1);
            }
            if (arg4 == 3) {
                this.method66(32768, var7, 17436672, var8);
                this.method66(2048, var7 - 1, 17436672, var8 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method66(66560, var7, 17436672, var8);
            this.method66(4096, var7, 17436672, var8 - 1);
            this.method66(16384, var7 + 1, 17436672, var8);
        }
        if (arg4 == 1) {
            this.method66(5120, var7, arg2 + 17412101, var8);
            this.method66(16384, var7 + 1, 17436672, var8);
            this.method66(65536, var7, arg2 + 17412101, var8 - -1);
        }
        if (arg4 == 2) {
            this.method66(20480, var7, 17436672, var8);
            this.method66(65536, var7, 17436672, var8 + 1);
            this.method66(1024, var7 - 1, 17436672, var8);
        }
        if (arg4 == 3) {
            this.method66(81920, var7, arg2 + 17412101, var8);
            this.method66(1024, var7 - 1, arg2 + 17412101, var8);
            this.method66(4096, var7, 17436672, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZIZI)V")
    public final void method62(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        field144++;
        int var7 = arg1 - this.field152;
        int var8 = arg3 - this.field141;
        int var9 = 256;
        if (arg2) {
            var9 += 131072;
        }
        int var10 = var8;
        if (!arg4) {
            field159 = -32;
        }
        while ((arg0 + var8) > var10) {
            if (var10 >= 0 && this.field138 > var10) {
                for (int var11 = var7; var11 < arg5 + var7; var11++) {
                    if (var11 >= 0 && var11 < this.field148) {
                        this.method69(true, var10, var11, var9);
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIZ)V")
    public final void method63(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field145++;
        int var7 = arg1 - this.field141;
        if (arg2 != 7834) {
            this.method73(-112, 19, 115, -97, -63, 40, 99, -13, -53, -58);
        }
        int var8 = arg0 - this.field152;
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method69(true, var7, var8, 128);
                this.method69(true, var7 - 1, var8, 8);
            }
            if (arg4 == 1) {
                this.method69(true, var7, var8, 2);
                this.method69(true, var7, var8 + 1, 32);
            }
            if (arg4 == 2) {
                this.method69(true, var7, var8, 8);
                this.method69(true, var7 + 1, var8, 128);
            }
            if (arg4 == 3) {
                this.method69(true, var7, var8, 32);
                this.method69(true, var7, var8 - 1, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method69(true, var7, var8, 1);
                this.method69(true, var7 - 1, var8 + 1, 16);
            }
            if (arg4 == 1) {
                this.method69(true, var7, var8, 4);
                this.method69(true, var7 + 1, var8 - -1, 64);
            }
            if (arg4 == 2) {
                this.method69(true, var7, var8, 16);
                this.method69(true, var7 + 1, var8 - 1, 1);
            }
            if (arg4 == 3) {
                this.method69(true, var7, var8, 64);
                this.method69(true, var7 - 1, var8 + -1, 4);
            }
        }
        if (arg3 == 2) {
            if (arg4 == 0) {
                this.method69(true, var7, var8, 130);
                this.method69(true, var7 - 1, var8, 8);
                this.method69(true, var7, var8 + 1, 32);
            }
            if (arg4 == 1) {
                this.method69(true, var7, var8, 10);
                this.method69(true, var7, var8 + 1, 32);
                this.method69(true, var7 + 1, var8, 128);
            }
            if (arg4 == 2) {
                this.method69(true, var7, var8, 40);
                this.method69(true, var7 + 1, var8, 128);
                this.method69(true, var7, var8 - 1, 2);
            }
            if (arg4 == 3) {
                this.method69(true, var7, var8, 160);
                this.method69(true, var7, var8 - 1, 2);
                this.method69(true, var7 - 1, var8, 8);
            }
        }
        if (!arg5) {
            return;
        }
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method69(true, var7, var8, 65536);
                this.method69(true, var7 - 1, var8, 4096);
            }
            if (arg4 == 1) {
                this.method69(true, var7, var8, 1024);
                this.method69(true, var7, var8 + 1, 16384);
            }
            if (arg4 == 2) {
                this.method69(true, var7, var8, 4096);
                this.method69(true, var7 + 1, var8, 65536);
            }
            if (arg4 == 3) {
                this.method69(true, var7, var8, 16384);
                this.method69(true, var7, var8 - 1, 1024);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method69(true, var7, var8, 512);
                this.method69(true, var7 - 1, var8 + 1, 8192);
            }
            if (arg4 == 1) {
                this.method69(true, var7, var8, 2048);
                this.method69(true, var7 + 1, var8 - -1, 32768);
            }
            if (arg4 == 2) {
                this.method69(true, var7, var8, 8192);
                this.method69(true, var7 + 1, var8 - 1, 512);
            }
            if (arg4 == 3) {
                this.method69(true, var7, var8, 32768);
                this.method69(true, var7 - 1, var8 + -1, 2048);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method69(true, var7, var8, 66560);
            this.method69(true, var7 - 1, var8, 4096);
            this.method69(true, var7, var8 + 1, 16384);
        }
        if (arg4 == 1) {
            this.method69(true, var7, var8, 5120);
            this.method69(true, var7, var8 + 1, 16384);
            this.method69(true, var7 + 1, var8, 65536);
        }
        if (arg4 == 2) {
            this.method69(true, var7, var8, 20480);
            this.method69(true, var7 + 1, var8, 65536);
            this.method69(true, var7, var8 - 1, 1024);
        }
        if (arg4 == 3) {
            this.method69(true, var7, var8, 81920);
            this.method69(true, var7, var8 - 1, 1024);
            this.method69(true, var7 - 1, var8, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBI)V")
    public final void method64(int arg0, byte arg1, int arg2) {
        field147++;
        int var4 = arg0 - this.field141;
        int var5 = arg2 - this.field152;
        this.field142[var4][var5] = class185.method1291(this.field142[var4][var5], 2097152);
        if (arg1 <= 32) {
            this.field138 = -118;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
    public final void method65(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field141;
        if (arg2 < 62) {
            field151 = null;
        }
        int var5 = arg1 - this.field152;
        this.field142[var4][var5] = class5.method43(this.field142[var4][var5], -262145);
        field129++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
    private final void method66(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 17436672) {
            field150++;
            this.field142[arg3][arg1] = class5.method43(this.field142[arg3][arg1], ~arg0);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
    public static void method67(byte arg0) {
        field151 = null;
        field156 = null;
        field153 = null;
        if (arg0 < 42) {
            method58((class11) null, false, -107, false, (class11) null);
        }
        field155 = null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
    public final void method68(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field152;
        field146++;
        int var5 = arg1 - this.field141;
        this.field142[var5][var4] = class185.method1291(this.field142[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZIII)V")
    private final void method69(boolean arg0, int arg1, int arg2, int arg3) {
        field130++;
        this.field142[arg1][arg2] = class185.method1291(this.field142[arg1][arg2], arg3);
        if (!arg0) {
            field153 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIIIIII)Z")
    public final boolean method70(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field149++;
        if (arg7 == 1) {
            if (arg0 == arg5 && arg3 == arg6) {
                return true;
            }
        } else if (arg0 <= arg5 && arg5 <= (arg0 + arg7 - 1) && arg6 >= arg6 && (arg6 + arg7 - 1) >= arg6) {
            return true;
        }
        int var9 = arg3 - this.field152;
        int var10 = arg5 - this.field141;
        int var11 = arg0 - this.field141;
        if (arg1) {
            this.field142 = null;
        }
        int var12 = arg6 - this.field152;
        if (arg7 == 1) {
            if (arg4 == 0) {
                if (arg2 == 0) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field142[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field142[var11][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field142[var11][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field142[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field142[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field142[var11][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field142[var11][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field142[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg2 == 0) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field142[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field142[var11][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field142[var11][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field142[var11][var9] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field142[var11][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field142[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field142[var11][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field142[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var10 == var11 && var12 + 1 == var9 && (this.field142[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var12 - 1) == var9 && (this.field142[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var11 && var9 == var12 && (this.field142[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 == var12 && (this.field142[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg7 - 1;
            int var14 = arg7 + var9 - 1;
            if (arg4 == 0) {
                if (arg2 == 0) {
                    if (var10 - arg7 == var11 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var12 + 1) == var9 && (this.field142[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 - arg7) == var9 && (this.field142[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var11 <= var10 && var13 >= var10 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var10 - arg7) == var11 && var9 <= var12 && var14 >= var12 && (this.field142[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var9 && var14 >= var12 && (this.field142[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 + 1 == var11 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var12 + 1) == var9 && (this.field142[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var12 - arg7) == var9 && (this.field142[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var11 <= var10 && var10 <= var13 && (var12 - arg7) == var9) {
                        return true;
                    }
                    if (var10 - arg7 == var11 && var12 >= var9 && var14 >= var12 && (this.field142[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var9 && var14 >= var12 && (this.field142[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg2 == 0) {
                    if (var10 - arg7 == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var14 && (this.field142[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var12 - arg7) == var9 && (this.field142[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var10 - arg7) == var11 && var12 >= var9 && var12 <= var14 && (this.field142[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var12 - arg7 == var9 && (this.field142[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var10 - arg7 == var11 && var12 >= var9 && var14 >= var12 && (this.field142[var13][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var12 + 1 == var9 && (this.field142[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var12 - arg7 == var9) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var10 - arg7) == var11 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 + 1) == var9 && (this.field142[var10][var9] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 <= var12 && var12 <= var14 && (this.field142[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var12 - arg7 == var9) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var11 <= var10 && var10 <= var13 && var12 + 1 == var9 && (this.field142[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 >= var11 && var10 <= var13 && var12 - arg7 == var9 && (this.field142[var10][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var10 - arg7 == var11 && var12 >= var9 && var12 <= var14 && (this.field142[var13][var12] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var14 && (this.field142[var11][var12] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public final void method71(int arg0) {
        if (arg0 < 56) {
            field157 = -29;
        }
        for (int var2 = 0; var2 < this.field138; var2++) {
            for (int var3 = 0; var3 < this.field148; var3++) {
                if (var2 == 0 || var3 == 0 || this.field138 - 5 <= var2 || var3 >= this.field148 - 5) {
                    this.field142[var2][var3] = 16777215;
                } else {
                    this.field142[var2][var3] = 16777216;
                }
            }
        }
        field135++;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIIIIIIII)Z")
    public final boolean method72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field137++;
        if (arg3 > 1) {
            return this.method59(arg7, arg8, arg0, arg6, arg3, arg3, arg5, 1, arg1) ? true : this.method73(arg8, arg1, arg2, arg7, arg5, arg0, arg6, arg3, arg3, 76);
        }
        if (arg4 != -30832) {
            this.method72(91, 14, 32, -70, -91, -38, 104, 77, 55);
        }
        int var10 = arg0 + arg5 - 1;
        int var11 = arg1 + arg6 - 1;
        if (arg8 >= arg0 && arg8 <= var10 && arg7 >= arg1 && var11 >= arg7) {
            return true;
        } else if (arg0 - 1 == arg8 && arg1 <= arg7 && arg7 <= var11 && (this.field142[arg8 - this.field141][arg7 - this.field152] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg8 && arg7 >= arg1 && arg7 <= var11 && (this.field142[arg8 - this.field141][arg7 - this.field152] & 0x80) == 0 && (arg2 & 0x2) == 0) {
            return true;
        } else if (arg1 - 1 == arg7 && arg8 >= arg0 && arg8 <= var10 && (this.field142[arg8 - this.field141][arg7 - this.field152] & 0x2) == 0 && (arg2 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg7 && arg0 <= arg8 && var10 >= arg8 && (this.field142[arg8 - this.field141][arg7 - this.field152] & 0x20) == 0 && (arg2 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method73(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field143++;
        int var11 = 6 / ((arg9 + 22) / 43);
        int var12 = arg0 + arg7;
        int var13 = arg4 + arg5;
        int var14 = arg3 + arg8;
        int var15 = arg1 + arg6;
        if (arg0 >= arg5 && var13 > arg0) {
            if (arg1 == var14 && (arg2 & 0x4) == 0) {
                int var16 = arg0;
                int var17 = var12 <= var13 ? var12 : var13;
                while (var16 < var17) {
                    if ((this.field142[var16 - this.field141][var14 - this.field152 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var16++;
                }
            } else if (arg3 == var15 && (arg2 & 0x1) == 0) {
                int var18 = arg0;
                int var19 = var12 <= var13 ? var12 : var13;
                while (var19 > var18) {
                    if ((this.field142[var18 - this.field141][arg3 - this.field152] & 0x20) == 0) {
                        return true;
                    }
                    var18++;
                }
            }
        } else if (var12 > arg5 && var12 <= var13) {
            if (arg1 == var14 && (arg2 & 0x4) == 0) {
                for (int var20 = arg5; var20 < var12; var20++) {
                    if ((this.field142[var20 - this.field141][var14 - this.field152 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg3 == var15 && (arg2 & 0x1) == 0) {
                for (int var21 = arg5; var21 < var12; var21++) {
                    if ((this.field142[var21 - this.field141][arg3 - this.field152] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg1 <= arg3 && var15 > arg3) {
            if (arg5 == var12 && (arg2 & 0x8) == 0) {
                int var22 = var14 > var15 ? var15 : var14;
                for (int var23 = arg3; var23 < var22; var23++) {
                    if ((this.field142[var12 - this.field141 - 1][var23 - this.field152] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg0 == var13 && (arg2 & 0x2) == 0) {
                int var24 = var15 >= var14 ? var14 : var15;
                for (int var25 = arg3; var25 < var24; var25++) {
                    if ((this.field142[arg0 - this.field141][var25 - this.field152] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        } else if (var14 > arg1 && var14 <= var15) {
            if (arg5 == var12 && (arg2 & 0x8) == 0) {
                for (int var26 = arg1; var26 < var14; var26++) {
                    if ((this.field142[var12 - this.field141 - 1][var26 - this.field152] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg0 == var13 && (arg2 & 0x2) == 0) {
                for (int var27 = arg1; var27 < var14; var27++) {
                    if ((this.field142[arg0 - this.field141][var27 - this.field152] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(II)V")
    public class8(int arg0, int arg1) {
        this.field138 = arg0;
        this.field148 = arg1;
        this.field152 = 0;
        this.field142 = new int[this.field138][this.field148];
        this.method71(81);
    }
}
