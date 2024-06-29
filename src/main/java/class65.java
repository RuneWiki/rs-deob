import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class65 {

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "I")
    private int field1250;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    private int field1228;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    private int field1243;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "[[I")
    public int[][] field1234;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    private int field1246;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Ltg;")
    public static class184 field1230 = class135.method812("Abbrechen", 3);

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "Ltg;")
    private static class184 field1232 = class135.method812("Please check your message)2centre for details)3", 3);

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public static int field1247 = 0;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "Ltg;")
    public static class184 field1229 = field1232;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "[Lre;")
    public static class164[] field1248 = new class164[100];

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "Lnd;")
    public static class127 field1244 = new class127(64);

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "Loe;")
    public static class137 field1238;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
    public final void method371(int arg0, int arg1, int arg2) {
        if (arg1 > 99) {
            int var4 = arg2 - this.field1228;
            field1233++;
            int var5 = arg0 - this.field1246;
            this.field1234[var4][var5] = class123.method748(this.field1234[var4][var5], 262144);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method372(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1225++;
        if (arg4 == arg5 && arg0 == arg2) {
            return true;
        }
        if (arg6 > -84) {
            this.method376(29, 36, -118, -57, false, -102, 88);
        }
        int var8 = arg4 - this.field1228;
        int var9 = arg0 - this.field1246;
        int var10 = arg5 - this.field1228;
        int var11 = arg2 - this.field1246;
        if (arg3 == 0) {
            if (arg1 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field1234[var8][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field1234[var8][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var8 == var10 && var9 + 1 == var11) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1234[var8][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1234[var8][var11] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field1234[var8][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field1234[var8][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var8 == var10 && var9 - 1 == var11) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field1234[var8][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1234[var8][var11] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1234[var8][var11] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field1234[var8][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1234[var8][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field1234[var8][var11] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field1234[var8][var11] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field1234[var8][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field1234[var8][var11] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field1234[var8][var11] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11) {
                    return true;
                }
            }
        }
        if (arg3 == 9) {
            if (var8 == var10 && var9 + 1 == var11 && (this.field1234[var8][var11] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var9 - 1 == var11 && (this.field1234[var8][var11] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field1234[var8][var11] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field1234[var8][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIZIIB)V")
    public final void method373(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        field1241++;
        int var7 = arg0 - this.field1246;
        int var8 = arg4 - this.field1228;
        if (arg3 == 0) {
            if (arg1 == 0) {
                this.method381((byte) -47, var8, 128, var7);
                this.method381((byte) -47, var8 - 1, 8, var7);
            }
            if (arg1 == 1) {
                this.method381((byte) -47, var8, 2, var7);
                this.method381((byte) -47, var8, 32, var7 + 1);
            }
            if (arg1 == 2) {
                this.method381((byte) -47, var8, 8, var7);
                this.method381((byte) -47, var8 + 1, 128, var7);
            }
            if (arg1 == 3) {
                this.method381((byte) -47, var8, 32, var7);
                this.method381((byte) -47, var8, 2, var7 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg1 == 0) {
                this.method381((byte) -47, var8, 1, var7);
                this.method381((byte) -47, var8 - 1, 16, var7 + 1);
            }
            if (arg1 == 1) {
                this.method381((byte) -47, var8, 4, var7);
                this.method381((byte) -47, var8 + 1, 64, var7 + 1);
            }
            if (arg1 == 2) {
                this.method381((byte) -47, var8, 16, var7);
                this.method381((byte) -47, var8 + 1, 1, var7 - 1);
            }
            if (arg1 == 3) {
                this.method381((byte) -47, var8, 64, var7);
                this.method381((byte) -47, var8 - 1, 4, var7 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                this.method381((byte) -47, var8, 130, var7);
                this.method381((byte) -47, var8 - 1, 8, var7);
                this.method381((byte) -47, var8, 32, var7 + 1);
            }
            if (arg1 == 1) {
                this.method381((byte) -47, var8, 10, var7);
                this.method381((byte) -47, var8, 32, var7 + 1);
                this.method381((byte) -47, var8 + 1, 128, var7);
            }
            if (arg1 == 2) {
                this.method381((byte) -47, var8, 40, var7);
                this.method381((byte) -47, var8 + 1, 128, var7);
                this.method381((byte) -47, var8, 2, var7 - 1);
            }
            if (arg1 == 3) {
                this.method381((byte) -47, var8, 160, var7);
                this.method381((byte) -47, var8, 2, var7 - 1);
                this.method381((byte) -47, var8 - 1, 8, var7);
            }
        }
        if (arg2) {
            if (arg3 == 0) {
                if (arg1 == 0) {
                    this.method381((byte) -47, var8, 65536, var7);
                    this.method381((byte) -47, var8 - 1, 4096, var7);
                }
                if (arg1 == 1) {
                    this.method381((byte) -47, var8, 1024, var7);
                    this.method381((byte) -47, var8, 16384, var7 + 1);
                }
                if (arg1 == 2) {
                    this.method381((byte) -47, var8, 4096, var7);
                    this.method381((byte) -47, var8 + 1, 65536, var7);
                }
                if (arg1 == 3) {
                    this.method381((byte) -47, var8, 16384, var7);
                    this.method381((byte) -47, var8, 1024, var7 - 1);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg1 == 0) {
                    this.method381((byte) -47, var8, 512, var7);
                    this.method381((byte) -47, var8 - 1, 8192, var7 + 1);
                }
                if (arg1 == 1) {
                    this.method381((byte) -47, var8, 2048, var7);
                    this.method381((byte) -47, var8 + 1, 32768, var7 + 1);
                }
                if (arg1 == 2) {
                    this.method381((byte) -47, var8, 8192, var7);
                    this.method381((byte) -47, var8 + 1, 512, var7 - 1);
                }
                if (arg1 == 3) {
                    this.method381((byte) -47, var8, 32768, var7);
                    this.method381((byte) -47, var8 - 1, 2048, var7 - 1);
                }
            }
            if (arg3 == 2) {
                if (arg1 == 0) {
                    this.method381((byte) -47, var8, 66560, var7);
                    this.method381((byte) -47, var8 - 1, 4096, var7);
                    this.method381((byte) -47, var8, 16384, var7 + 1);
                }
                if (arg1 == 1) {
                    this.method381((byte) -47, var8, 5120, var7);
                    this.method381((byte) -47, var8, 16384, var7 + 1);
                    this.method381((byte) -47, var8 + 1, 65536, var7);
                }
                if (arg1 == 2) {
                    this.method381((byte) -47, var8, 20480, var7);
                    this.method381((byte) -47, var8 + 1, 65536, var7);
                    this.method381((byte) -47, var8, 1024, var7 - 1);
                }
                if (arg1 == 3) {
                    this.method381((byte) -47, var8, 81920, var7);
                    this.method381((byte) -47, var8, 1024, var7 - 1);
                    this.method381((byte) -47, var8 - 1, 4096, var7);
                }
            }
        }
        if (arg5 > -99) {
            field1232 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(IIIIIII)Z")
    public final boolean method374(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1235++;
        if (arg1 == arg4 && arg0 == arg2) {
            return true;
        }
        int var8 = 92 / ((48 - arg6) / 63);
        int var9 = arg2 - this.field1246;
        int var10 = arg1 - this.field1228;
        int var11 = arg0 - this.field1246;
        int var12 = arg4 - this.field1228;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg3 = arg3 + 2 & 0x3;
            }
            if (arg3 == 0) {
                if (var12 + 1 == var10 && var9 == var11 && (this.field1234[var10][var11] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var12 && var9 - 1 == var11 && (this.field1234[var10][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var12 - 1 == var10 && var9 == var11 && (this.field1234[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var12 && var9 - 1 == var11 && (this.field1234[var10][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var12 - 1 == var10 && var9 == var11 && (this.field1234[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var12 && var9 + 1 == var11 && (this.field1234[var10][var11] & 0x20) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var12 + 1 == var10 && var9 == var11 && (this.field1234[var10][var11] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var12 && var9 + 1 == var11 && (this.field1234[var10][var11] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg5 == 8) {
            if (var10 == var12 && var9 + 1 == var11 && (this.field1234[var10][var11] & 0x20) == 0) {
                return true;
            }
            if (var10 == var12 && var9 - 1 == var11 && (this.field1234[var10][var11] & 0x2) == 0) {
                return true;
            }
            if (var12 - 1 == var10 && var9 == var11 && (this.field1234[var10][var11] & 0x8) == 0) {
                return true;
            }
            if (var12 + 1 == var10 && var9 == var11 && (this.field1234[var10][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public static void method375(byte arg0) {
        field1248 = null;
        field1244 = null;
        field1230 = null;
        field1232 = null;
        if (arg0 == 14) {
            field1238 = null;
            field1229 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIZII)V")
    public final void method376(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg2 != -1) {
            return;
        }
        field1237++;
        int var8 = arg0 - this.field1246;
        int var9 = arg3 - this.field1228;
        if (arg5 == 1 || arg5 == 3) {
            int var10 = arg1;
            arg1 = arg6;
            arg6 = var10;
        }
        int var11 = 256;
        if (arg4) {
            var11 += 131072;
        }
        for (int var12 = var9; var12 < arg1 + var9; var12++) {
            if (var12 >= 0 && var12 < this.field1250) {
                for (int var13 = var8; var13 < arg6 + var8; var13++) {
                    if (var13 >= 0 && this.field1243 > var13) {
                        this.method380(var13, var12, var11, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(III)V")
    public final void method377(int arg0, int arg1, int arg2) {
        field1236++;
        int var4 = 37 / ((-arg2 - 51) / 52);
        int var5 = arg0 - this.field1228;
        int var6 = arg1 - this.field1246;
        this.field1234[var5][var6] = class10.method61(this.field1234[var5][var6], -262145);
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(III)V")
    public final void method378(int arg0, int arg1, int arg2) {
        if (arg1 >= 0) {
            this.method377(116, -18, -125);
        }
        int var4 = arg2 - this.field1228;
        int var5 = arg0 - this.field1246;
        field1242++;
        this.field1234[var4][var5] = class123.method748(this.field1234[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
    public final void method379(byte arg0) {
        field1239++;
        if (arg0 != -67) {
            return;
        }
        for (int var2 = 0; var2 < this.field1250; var2++) {
            for (int var3 = 0; var3 < this.field1243; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field1250 - 5 || var3 >= this.field1243 - 5) {
                    this.field1234[var2][var3] = 16777215;
                } else {
                    this.field1234[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII)V")
    private final void method380(int arg0, int arg1, int arg2, int arg3) {
        this.field1234[arg1][arg0] = class10.method61(this.field1234[arg1][arg0], ~arg2);
        field1226++;
        if (arg3 != -1) {
            field1238 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BIII)V")
    private final void method381(byte arg0, int arg1, int arg2, int arg3) {
        this.field1234[arg1][arg3] = class123.method748(this.field1234[arg1][arg3], arg2);
        field1245++;
        if (arg0 != -47) {
            this.method380(-109, 52, 26, -116);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1249++;
        int var9 = arg0 + arg5 - 1;
        int var10 = arg2 + arg4 - 1;
        if (arg0 <= arg7 && arg7 <= var9 && arg2 <= arg3 && arg3 <= var10) {
            return true;
        } else if (arg0 - 1 == arg7 && arg3 >= arg2 && arg3 <= var10 && (this.field1234[arg7 - this.field1228][arg3 - this.field1246] & 0x8) == 0 && (arg6 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg7 && arg3 >= arg2 && arg3 <= var10 && (this.field1234[arg7 - this.field1228][arg3 - this.field1246] & 0x80) == 0 && (arg6 & 0x2) == 0) {
            return true;
        } else if (arg2 - 1 == arg3 && arg7 >= arg0 && arg7 <= var9 && (this.field1234[arg7 - this.field1228][arg3 - this.field1246] & 0x2) == 0 && (arg6 & 0x4) == 0) {
            return true;
        } else if (var10 + 1 == arg3 && arg0 <= arg7 && var9 >= arg7 && (this.field1234[arg7 - this.field1228][arg3 - this.field1246] & 0x20) == 0 && (arg6 & 0x1) == 0) {
            return true;
        } else {
            if (arg1 != -26754) {
                this.method381((byte) -104, 52, -85, 89);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZIIIII)V")
    public final void method383(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1231++;
        int var7 = arg1 - this.field1228;
        int var8 = arg2 - this.field1246;
        int var9 = 256;
        if (arg0) {
            var9 += 131072;
        }
        for (int var10 = var7; var10 < arg4 + var7; var10++) {
            if (var10 >= 0 && var10 < this.field1250) {
                for (int var11 = var8; var11 < arg3 + var8; var11++) {
                    if (var11 >= 0 && var11 < this.field1243) {
                        this.method381((byte) -47, var10, var9, var11);
                    }
                }
            }
        }
        if (arg5 < 86) {
            this.field1243 = 5;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIZZI)V")
    public final void method384(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        int var7 = arg2 - this.field1228;
        int var8 = arg5 - this.field1246;
        field1227++;
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method380(var8, var7, 128, -1);
                this.method380(var8, var7 - 1, 8, -1);
            }
            if (arg1 == 1) {
                this.method380(var8, var7, 2, -1);
                this.method380(var8 + 1, var7, 32, -1);
            }
            if (arg1 == 2) {
                this.method380(var8, var7, 8, -1);
                this.method380(var8, var7 + 1, 128, -1);
            }
            if (arg1 == 3) {
                this.method380(var8, var7, 32, -1);
                this.method380(var8 - 1, var7, 2, -1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method380(var8, var7, 1, -1);
                this.method380(var8 + 1, var7 + -1, 16, -1);
            }
            if (arg1 == 1) {
                this.method380(var8, var7, 4, -1);
                this.method380(var8 + 1, var7 - -1, 64, -1);
            }
            if (arg1 == 2) {
                this.method380(var8, var7, 16, -1);
                this.method380(var8 - 1, var7 + 1, 1, -1);
            }
            if (arg1 == 3) {
                this.method380(var8, var7, 64, -1);
                this.method380(var8 - 1, var7 + -1, 4, -1);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method380(var8, var7, 130, -1);
                this.method380(var8, var7 - 1, 8, -1);
                this.method380(var8 + 1, var7, 32, -1);
            }
            if (arg1 == 1) {
                this.method380(var8, var7, 10, -1);
                this.method380(var8 + 1, var7, 32, -1);
                this.method380(var8, var7 + 1, 128, -1);
            }
            if (arg1 == 2) {
                this.method380(var8, var7, 40, -1);
                this.method380(var8, var7 + 1, 128, -1);
                this.method380(var8 - 1, var7, 2, -1);
            }
            if (arg1 == 3) {
                this.method380(var8, var7, 160, -1);
                this.method380(var8 - 1, var7, 2, -1);
                this.method380(var8, var7 - 1, 8, -1);
            }
        }
        if (arg4) {
            this.method382(28, 107, 120, -102, 3, 11, -35, -51);
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method380(var8, var7, 65536, -1);
                this.method380(var8, var7 - 1, 4096, -1);
            }
            if (arg1 == 1) {
                this.method380(var8, var7, 1024, -1);
                this.method380(var8 + 1, var7, 16384, -1);
            }
            if (arg1 == 2) {
                this.method380(var8, var7, 4096, -1);
                this.method380(var8, var7 + 1, 65536, -1);
            }
            if (arg1 == 3) {
                this.method380(var8, var7, 16384, -1);
                this.method380(var8 - 1, var7, 1024, -1);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method380(var8, var7, 512, -1);
                this.method380(var8 + 1, var7 + -1, 8192, -1);
            }
            if (arg1 == 1) {
                this.method380(var8, var7, 2048, -1);
                this.method380(var8 + 1, var7 + 1, 32768, -1);
            }
            if (arg1 == 2) {
                this.method380(var8, var7, 8192, -1);
                this.method380(var8 - 1, var7 + 1, 512, -1);
            }
            if (arg1 == 3) {
                this.method380(var8, var7, 32768, -1);
                this.method380(var8 - 1, var7 + -1, 2048, -1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method380(var8, var7, 66560, -1);
            this.method380(var8, var7 - 1, 4096, -1);
            this.method380(var8 + 1, var7, 16384, -1);
        }
        if (arg1 == 1) {
            this.method380(var8, var7, 5120, -1);
            this.method380(var8 + 1, var7, 16384, -1);
            this.method380(var8, var7 + 1, 65536, -1);
        }
        if (arg1 == 2) {
            this.method380(var8, var7, 20480, -1);
            this.method380(var8, var7 + 1, 65536, -1);
            this.method380(var8 - 1, var7, 1024, -1);
        }
        if (arg1 == 3) {
            this.method380(var8, var7, 81920, -1);
            this.method380(var8 - 1, var7, 1024, -1);
            this.method380(var8, var7 - 1, 4096, -1);
            return;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(II)V")
    public class65(int arg0, int arg1) {
        this.field1250 = arg0;
        this.field1228 = 0;
        this.field1243 = arg1;
        this.field1234 = new int[this.field1250][this.field1243];
        this.field1246 = 0;
        this.method379((byte) -67);
    }
}
