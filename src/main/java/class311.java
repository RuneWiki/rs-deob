import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class311 {

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    private int field5011;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    private int field5007;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "I")
    private int field5003;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    private int field5008;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "[[I")
    public int[][] field5006;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4999 = "shake:";

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field5005 = -1;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIB)V")
    public final void method2090(int arg0, int arg1, byte arg2) {
        int var4 = arg1 - this.field5007;
        field5000++;
        int var5 = arg0 - this.field5008;
        if (arg2 < 114) {
            this.field5011 = 28;
        }
        this.field5006[var4][var5] = class15.method84(this.field5006[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public final void method2091(byte arg0) {
        if (arg0 != 88) {
            this.field5011 = -75;
        }
        for (int var2 = 0; var2 < this.field5011; var2++) {
            for (int var3 = 0; var3 < this.field5003; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field5011 - 5 || var3 >= (this.field5003 - 5)) {
                    this.field5006[var2][var3] = 16777215;
                } else {
                    this.field5006[var2][var3] = 2097152;
                }
            }
        }
        field4996++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBII)V")
    private final void method2092(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == 61) {
            this.field5006[arg2][arg0] = class15.method84(this.field5006[arg2][arg0], ~arg3);
            field5010++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
    public final void method2093(int arg0, int arg1, int arg2) {
        field5016++;
        int var4 = arg0 - this.field5007;
        int var5 = arg2 - this.field5008;
        if (arg1 == 128) {
            this.field5006[var4][var5] = class312.method2107(this.field5006[var4][var5], 262144);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIIBI)Z")
    public final boolean method2094(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field4997++;
        if (arg4 == 1) {
            if (arg1 == arg5 && arg2 == arg3) {
                return true;
            }
        } else if (arg1 >= arg5 && arg1 <= arg5 + arg4 - 1 && arg2 >= arg2 && arg2 + arg4 - 1 >= arg2) {
            return true;
        }
        int var9 = arg3 - this.field5008;
        int var10 = arg1 - this.field5007;
        int var11 = arg5 - this.field5007;
        int var12 = arg2 - this.field5008;
        if (arg4 == 1) {
            if (arg7 == 0) {
                if (arg0 == 0) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field5006[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field5006[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field5006[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field5006[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field5006[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field5006[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field5006[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field5006[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg0 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field5006[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field5006[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field5006[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field5006[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field5006[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field5006[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field5006[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field5006[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var10 == var11 && var12 + 1 == var9 && (this.field5006[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var12 - 1 == var9 && (this.field5006[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var11 && var9 == var12 && (this.field5006[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 == var12 && (this.field5006[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg4 - 1;
            int var14 = arg4 + var9 - 1;
            if (arg7 == 0) {
                if (arg0 == 0) {
                    if (var10 - arg4 == var11 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var12 + 1 == var9 && (this.field5006[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var12 - arg4) == var9 && (this.field5006[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var11 <= var10 && var13 >= var10 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var10 - arg4 == var11 && var12 >= var9 && var12 <= var14 && (this.field5006[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var14 && (this.field5006[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 + 1 == var11 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var12 + 1 == var9 && (this.field5006[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 - arg4) == var9 && (this.field5006[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 >= var11 && var13 >= var10 && var12 - arg4 == var9) {
                        return true;
                    }
                    if ((var10 - arg4) == var11 && var9 <= var12 && var14 >= var12 && (this.field5006[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 <= var12 && var14 >= var12 && (this.field5006[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 2) {
                if (arg0 == 0) {
                    if ((var10 - arg4) == var11 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var14 >= var12 && (this.field5006[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 - arg4) == var9 && (this.field5006[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 1) {
                    if (var10 - arg4 == var11 && var12 >= var9 && var14 >= var12 && (this.field5006[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var12 - arg4 == var9 && (this.field5006[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg0 == 2) {
                    if (var10 - arg4 == var11 && var9 <= var12 && var14 >= var12 && (this.field5006[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var12 + 1 == var9 && (this.field5006[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var12 - arg4 == var9) {
                        return true;
                    }
                } else if (arg0 == 3) {
                    if (var10 - arg4 == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var12 + 1 == var9 && (this.field5006[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var9 && var12 <= var14 && (this.field5006[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var12 - arg4) == var9) {
                        return true;
                    }
                }
            }
            if (arg7 == 9) {
                if (var11 <= var10 && var13 >= var10 && var12 + 1 == var9 && (this.field5006[var10][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var10 && var13 >= var10 && var12 - arg4 == var9 && (this.field5006[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var10 - arg4) == var11 && var9 <= var12 && var14 >= var12 && (this.field5006[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var12 >= var9 && var12 <= var14 && (this.field5006[var11][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return arg6 == -94 ? false : false;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZIIZIB)V")
    public final void method2095(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, byte arg6) {
        field5004++;
        int var8 = arg5 - this.field5007;
        if (arg6 != -62) {
            return;
        }
        int var9 = arg3 - this.field5008;
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method2100(-22643, 128, var8, var9);
                this.method2100(-22643, 8, var8 - 1, var9);
            }
            if (arg0 == 1) {
                this.method2100(arg6 - 22581, 2, var8, var9);
                this.method2100(-22643, 32, var8, var9 + 1);
            }
            if (arg0 == 2) {
                this.method2100(-22643, 8, var8, var9);
                this.method2100(arg6 - 22581, 128, var8 + 1, var9);
            }
            if (arg0 == 3) {
                this.method2100(-22643, 32, var8, var9);
                this.method2100(-22643, 2, var8, var9 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method2100(-22643, 1, var8, var9);
                this.method2100(-22643, 16, var8 - 1, var9 + 1);
            }
            if (arg0 == 1) {
                this.method2100(arg6 - 22581, 4, var8, var9);
                this.method2100(-22643, 64, var8 + 1, var9 + 1);
            }
            if (arg0 == 2) {
                this.method2100(-22643, 16, var8, var9);
                this.method2100(-22643, 1, var8 + 1, var9 + -1);
            }
            if (arg0 == 3) {
                this.method2100(arg6 - 22581, 64, var8, var9);
                this.method2100(-22643, 4, var8 - 1, var9 + -1);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method2100(-22643, 130, var8, var9);
                this.method2100(-22643, 8, var8 - 1, var9);
                this.method2100(-22643, 32, var8, var9 + 1);
            }
            if (arg0 == 1) {
                this.method2100(-22643, 10, var8, var9);
                this.method2100(-22643, 32, var8, var9 + 1);
                this.method2100(-22643, 128, var8 + 1, var9);
            }
            if (arg0 == 2) {
                this.method2100(-22643, 40, var8, var9);
                this.method2100(-22643, 128, var8 + 1, var9);
                this.method2100(-22643, 2, var8, var9 - 1);
            }
            if (arg0 == 3) {
                this.method2100(-22643, 160, var8, var9);
                this.method2100(-22643, 2, var8, var9 - 1);
                this.method2100(arg6 - 22581, 8, var8 - 1, var9);
            }
        }
        if (arg4) {
            if (arg2 == 0) {
                if (arg0 == 0) {
                    this.method2100(-22643, 65536, var8, var9);
                    this.method2100(-22643, 4096, var8 - 1, var9);
                }
                if (arg0 == 1) {
                    this.method2100(arg6 ^ 0x584F, 1024, var8, var9);
                    this.method2100(-22643, 16384, var8, var9 + 1);
                }
                if (arg0 == 2) {
                    this.method2100(-22643, 4096, var8, var9);
                    this.method2100(-22643, 65536, var8 + 1, var9);
                }
                if (arg0 == 3) {
                    this.method2100(-22643, 16384, var8, var9);
                    this.method2100(-22643, 1024, var8, var9 - 1);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg0 == 0) {
                    this.method2100(-22643, 512, var8, var9);
                    this.method2100(arg6 ^ 0x584F, 8192, var8 - 1, var9 + 1);
                }
                if (arg0 == 1) {
                    this.method2100(-22643, 2048, var8, var9);
                    this.method2100(-22643, 32768, var8 + 1, var9 + 1);
                }
                if (arg0 == 2) {
                    this.method2100(arg6 - 22581, 8192, var8, var9);
                    this.method2100(arg6 - 22581, 512, var8 + 1, var9 + -1);
                }
                if (arg0 == 3) {
                    this.method2100(arg6 - 22581, 32768, var8, var9);
                    this.method2100(-22643, 2048, var8 - 1, var9 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg0 == 0) {
                    this.method2100(-22643, 66560, var8, var9);
                    this.method2100(arg6 ^ 0x584F, 4096, var8 - 1, var9);
                    this.method2100(arg6 - 22581, 16384, var8, var9 + 1);
                }
                if (arg0 == 1) {
                    this.method2100(arg6 - 22581, 5120, var8, var9);
                    this.method2100(-22643, 16384, var8, var9 + 1);
                    this.method2100(-22643, 65536, var8 + 1, var9);
                }
                if (arg0 == 2) {
                    this.method2100(-22643, 20480, var8, var9);
                    this.method2100(-22643, 65536, var8 + 1, var9);
                    this.method2100(-22643, 1024, var8, var9 - 1);
                }
                if (arg0 == 3) {
                    this.method2100(-22643, 81920, var8, var9);
                    this.method2100(-22643, 1024, var8, var9 - 1);
                    this.method2100(arg6 ^ 0x584F, 4096, var8 - 1, var9);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method2100(arg6 ^ 0x584F, 536870912, var8, var9);
                this.method2100(arg6 ^ 0x584F, 33554432, var8 - 1, var9);
            }
            if (arg0 == 1) {
                this.method2100(-22643, 8388608, var8, var9);
                this.method2100(-22643, 134217728, var8, var9 + 1);
            }
            if (arg0 == 2) {
                this.method2100(-22643, 33554432, var8, var9);
                this.method2100(-22643, 536870912, var8 + 1, var9);
            }
            if (arg0 == 3) {
                this.method2100(arg6 - 22581, 134217728, var8, var9);
                this.method2100(-22643, 8388608, var8, var9 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method2100(-22643, 4194304, var8, var9);
                this.method2100(-22643, 67108864, var8 - 1, var9 - -1);
            }
            if (arg0 == 1) {
                this.method2100(-22643, 16777216, var8, var9);
                this.method2100(-22643, 268435456, var8 + 1, var9 + 1);
            }
            if (arg0 == 2) {
                this.method2100(-22643, 67108864, var8, var9);
                this.method2100(arg6 ^ 0x584F, 4194304, var8 + 1, var9 - 1);
            }
            if (arg0 == 3) {
                this.method2100(-22643, 268435456, var8, var9);
                this.method2100(-22643, 16777216, var8 - 1, var9 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method2100(arg6 ^ 0x584F, 545259520, var8, var9);
            this.method2100(arg6 - 22581, 33554432, var8 - 1, var9);
            this.method2100(-22643, 134217728, var8, var9 + 1);
        }
        if (arg0 == 1) {
            this.method2100(-22643, 41943040, var8, var9);
            this.method2100(arg6 - 22581, 134217728, var8, var9 + 1);
            this.method2100(-22643, 536870912, var8 + 1, var9);
        }
        if (arg0 == 2) {
            this.method2100(-22643, 167772160, var8, var9);
            this.method2100(-22643, 536870912, var8 + 1, var9);
            this.method2100(arg6 ^ 0x584F, 8388608, var8, var9 - 1);
        }
        if (arg0 == 3) {
            this.method2100(-22643, 671088640, var8, var9);
            this.method2100(-22643, 8388608, var8, var9 - 1);
            this.method2100(-22643, 33554432, var8 - 1, var9);
            return;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIZZIZI)V")
    public final void method2096(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5, boolean arg6, int arg7) {
        int var9 = arg1 - this.field5008;
        int var10 = 256;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg7;
            arg7 = arg5;
            arg5 = var11;
        }
        if (arg6) {
            var10 |= 0x20000;
        }
        int var12 = arg0 - this.field5007;
        if (arg3) {
            var10 |= 0x40000000;
        }
        field5001++;
        for (int var13 = var12; var13 < (var12 + arg7); var13++) {
            if (var13 >= 0 && this.field5011 > var13) {
                for (int var14 = var9; var14 < arg5 + var9; var14++) {
                    if (var14 >= 0 && this.field5003 > var14) {
                        this.method2092(var14, (byte) 61, var13, var10);
                    }
                }
            }
        }
        if (!arg4) {
            field5014 = 29;
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(III)V")
    public static final void method2097(int arg0, int arg1, int arg2) {
        field5017++;
        class222 var3 = class4.method33(arg0, -118);
        int var4 = var3.field3732;
        if (arg2 != -4) {
            method2101((byte) -97, (String) null);
        }
        int var5 = var3.field3730;
        int var6 = var3.field3726;
        int var7 = class270.field4489[var5 - var4];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var4;
        class280.method1960((byte) -119, var8 & arg1 << var4 | ~var8 & class12.field230[var6], var6);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIIZIZ)V")
    public final void method2098(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int var8 = arg2 - this.field5007;
        field4998++;
        int var9 = arg5 - this.field5008;
        if (!arg0) {
            this.method2099(-1, -49, -94, -10, 72, (byte) 15, -46, -102, -103, -88);
        }
        if (arg1 == 0) {
            if (arg3 == 0) {
                this.method2092(var9, (byte) 61, var8, 128);
                this.method2092(var9, (byte) 61, var8 - 1, 8);
            }
            if (arg3 == 1) {
                this.method2092(var9, (byte) 61, var8, 2);
                this.method2092(var9 + 1, (byte) 61, var8, 32);
            }
            if (arg3 == 2) {
                this.method2092(var9, (byte) 61, var8, 8);
                this.method2092(var9, (byte) 61, var8 + 1, 128);
            }
            if (arg3 == 3) {
                this.method2092(var9, (byte) 61, var8, 32);
                this.method2092(var9 - 1, (byte) 61, var8, 2);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg3 == 0) {
                this.method2092(var9, (byte) 61, var8, 1);
                this.method2092(var9 + 1, (byte) 61, var8 - 1, 16);
            }
            if (arg3 == 1) {
                this.method2092(var9, (byte) 61, var8, 4);
                this.method2092(var9 + 1, (byte) 61, var8 + 1, 64);
            }
            if (arg3 == 2) {
                this.method2092(var9, (byte) 61, var8, 16);
                this.method2092(var9 - 1, (byte) 61, var8 + 1, 1);
            }
            if (arg3 == 3) {
                this.method2092(var9, (byte) 61, var8, 64);
                this.method2092(var9 - 1, (byte) 61, var8 - 1, 4);
            }
        }
        if (arg1 == 2) {
            if (arg3 == 0) {
                this.method2092(var9, (byte) 61, var8, 130);
                this.method2092(var9, (byte) 61, var8 - 1, 8);
                this.method2092(var9 + 1, (byte) 61, var8, 32);
            }
            if (arg3 == 1) {
                this.method2092(var9, (byte) 61, var8, 10);
                this.method2092(var9 + 1, (byte) 61, var8, 32);
                this.method2092(var9, (byte) 61, var8 + 1, 128);
            }
            if (arg3 == 2) {
                this.method2092(var9, (byte) 61, var8, 40);
                this.method2092(var9, (byte) 61, var8 + 1, 128);
                this.method2092(var9 - 1, (byte) 61, var8, 2);
            }
            if (arg3 == 3) {
                this.method2092(var9, (byte) 61, var8, 160);
                this.method2092(var9 - 1, (byte) 61, var8, 2);
                this.method2092(var9, (byte) 61, var8 - 1, 8);
            }
        }
        if (arg4) {
            if (arg1 == 0) {
                if (arg3 == 0) {
                    this.method2092(var9, (byte) 61, var8, 65536);
                    this.method2092(var9, (byte) 61, var8 - 1, 4096);
                }
                if (arg3 == 1) {
                    this.method2092(var9, (byte) 61, var8, 1024);
                    this.method2092(var9 + 1, (byte) 61, var8, 16384);
                }
                if (arg3 == 2) {
                    this.method2092(var9, (byte) 61, var8, 4096);
                    this.method2092(var9, (byte) 61, var8 + 1, 65536);
                }
                if (arg3 == 3) {
                    this.method2092(var9, (byte) 61, var8, 16384);
                    this.method2092(var9 - 1, (byte) 61, var8, 1024);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg3 == 0) {
                    this.method2092(var9, (byte) 61, var8, 512);
                    this.method2092(var9 + 1, (byte) 61, var8 - 1, 8192);
                }
                if (arg3 == 1) {
                    this.method2092(var9, (byte) 61, var8, 2048);
                    this.method2092(var9 + 1, (byte) 61, var8 + 1, 32768);
                }
                if (arg3 == 2) {
                    this.method2092(var9, (byte) 61, var8, 8192);
                    this.method2092(var9 - 1, (byte) 61, var8 + 1, 512);
                }
                if (arg3 == 3) {
                    this.method2092(var9, (byte) 61, var8, 32768);
                    this.method2092(var9 - 1, (byte) 61, var8 - 1, 2048);
                }
            }
            if (arg1 == 2) {
                if (arg3 == 0) {
                    this.method2092(var9, (byte) 61, var8, 66560);
                    this.method2092(var9, (byte) 61, var8 - 1, 4096);
                    this.method2092(var9 + 1, (byte) 61, var8, 16384);
                }
                if (arg3 == 1) {
                    this.method2092(var9, (byte) 61, var8, 5120);
                    this.method2092(var9 + 1, (byte) 61, var8, 16384);
                    this.method2092(var9, (byte) 61, var8 + 1, 65536);
                }
                if (arg3 == 2) {
                    this.method2092(var9, (byte) 61, var8, 20480);
                    this.method2092(var9, (byte) 61, var8 + 1, 65536);
                    this.method2092(var9 - 1, (byte) 61, var8, 1024);
                }
                if (arg3 == 3) {
                    this.method2092(var9, (byte) 61, var8, 81920);
                    this.method2092(var9 - 1, (byte) 61, var8, 1024);
                    this.method2092(var9, (byte) 61, var8 - 1, 4096);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg1 == 0) {
            if (arg3 == 0) {
                this.method2092(var9, (byte) 61, var8, 536870912);
                this.method2092(var9, (byte) 61, var8 - 1, 33554432);
            }
            if (arg3 == 1) {
                this.method2092(var9, (byte) 61, var8, 8388608);
                this.method2092(var9 + 1, (byte) 61, var8, 134217728);
            }
            if (arg3 == 2) {
                this.method2092(var9, (byte) 61, var8, 33554432);
                this.method2092(var9, (byte) 61, var8 + 1, 536870912);
            }
            if (arg3 == 3) {
                this.method2092(var9, (byte) 61, var8, 134217728);
                this.method2092(var9 - 1, (byte) 61, var8, 8388608);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg3 == 0) {
                this.method2092(var9, (byte) 61, var8, 4194304);
                this.method2092(var9 + 1, (byte) 61, var8 - 1, 67108864);
            }
            if (arg3 == 1) {
                this.method2092(var9, (byte) 61, var8, 16777216);
                this.method2092(var9 + 1, (byte) 61, var8 + 1, 268435456);
            }
            if (arg3 == 2) {
                this.method2092(var9, (byte) 61, var8, 67108864);
                this.method2092(var9 - 1, (byte) 61, var8 + 1, 4194304);
            }
            if (arg3 == 3) {
                this.method2092(var9, (byte) 61, var8, 268435456);
                this.method2092(var9 - 1, (byte) 61, var8 - 1, 16777216);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg3 == 0) {
            this.method2092(var9, (byte) 61, var8, 545259520);
            this.method2092(var9, (byte) 61, var8 - 1, 33554432);
            this.method2092(var9 + 1, (byte) 61, var8, 134217728);
        }
        if (arg3 == 1) {
            this.method2092(var9, (byte) 61, var8, 41943040);
            this.method2092(var9 + 1, (byte) 61, var8, 134217728);
            this.method2092(var9, (byte) 61, var8 + 1, 536870912);
        }
        if (arg3 == 2) {
            this.method2092(var9, (byte) 61, var8, 167772160);
            this.method2092(var9, (byte) 61, var8 + 1, 536870912);
            this.method2092(var9 - 1, (byte) 61, var8, 8388608);
        }
        if (arg3 == 3) {
            this.method2092(var9, (byte) 61, var8, 671088640);
            this.method2092(var9 - 1, (byte) 61, var8, 8388608);
            this.method2092(var9, (byte) 61, var8 - 1, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIBIIII)Z")
    private final boolean method2099(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field5015++;
        int var11 = arg0 + arg7;
        int var12 = arg1 + arg8;
        if (arg5 != -82) {
            return false;
        }
        int var13 = arg2 + arg3;
        int var14 = arg4 + arg6;
        if (arg7 == var12 && (arg9 & 0x2) == 0) {
            int var15 = arg6 >= arg3 ? arg6 : arg3;
            int var16 = var13 < var14 ? var13 : var14;
            while (var16 > var15) {
                if ((this.field5006[var12 - this.field5007 - 1][var15 - this.field5008] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg8 == var11 && (arg9 & 0x8) == 0) {
            int var17 = var14 > var13 ? var13 : var14;
            for (int var18 = arg6 < arg3 ? arg3 : arg6; var18 < var17; var18++) {
                if ((this.field5006[arg8 - this.field5007][var18 - this.field5008] & 0x80) == 0) {
                    return true;
                }
            }
        } else if (arg3 == var14 && (arg9 & 0x1) == 0) {
            int var19 = arg7 > arg8 ? arg7 : arg8;
            int var20 = var12 > var11 ? var11 : var12;
            while (var19 < var20) {
                if ((this.field5006[var19 - this.field5007][var14 - (this.field5008 + 1)] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg6 == var13 && (arg9 & 0x4) == 0) {
            int var21 = arg8 < arg7 ? arg7 : arg8;
            int var22 = var12 <= var11 ? var12 : var11;
            while (var21 < var22) {
                if ((this.field5006[var21 - this.field5007][arg6 - this.field5008] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIII)V")
    private final void method2100(int arg0, int arg1, int arg2, int arg3) {
        this.field5006[arg2][arg3] = class312.method2107(this.field5006[arg2][arg3], arg1);
        if (arg0 == -22643) {
            field4995++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLjava/lang/String;)[B")
    public static final byte[] method2101(byte arg0, String arg1) {
        field5013++;
        int var2 = arg1.length();
        int var3 = 79 % ((arg0 + 8) / 36);
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var6 > '\u0000' && var6 < '\u0080' || var6 >= ' ' && var6 <= 'ÿ') {
                var4[var5] = (byte) var6;
            } else if (var6 == '€') {
                var4[var5] = -128;
            } else if (var6 == '‚') {
                var4[var5] = -126;
            } else if (var6 == 'ƒ') {
                var4[var5] = -125;
            } else if (var6 == '„') {
                var4[var5] = -124;
            } else if (var6 == '…') {
                var4[var5] = -123;
            } else if (var6 == '†') {
                var4[var5] = -122;
            } else if (var6 == '‡') {
                var4[var5] = -121;
            } else if (var6 == 'ˆ') {
                var4[var5] = -120;
            } else if (var6 == '‰') {
                var4[var5] = -119;
            } else if (var6 == 'Š') {
                var4[var5] = -118;
            } else if (var6 == '‹') {
                var4[var5] = -117;
            } else if (var6 == 'Œ') {
                var4[var5] = -116;
            } else if (var6 == 'Ž') {
                var4[var5] = -114;
            } else if (var6 == '‘') {
                var4[var5] = -111;
            } else if (var6 == '’') {
                var4[var5] = -110;
            } else if (var6 == '“') {
                var4[var5] = -109;
            } else if (var6 == '”') {
                var4[var5] = -108;
            } else if (var6 == '•') {
                var4[var5] = -107;
            } else if (var6 == '–') {
                var4[var5] = -106;
            } else if (var6 == '—') {
                var4[var5] = -105;
            } else if (var6 == '˜') {
                var4[var5] = -104;
            } else if (var6 == '™') {
                var4[var5] = -103;
            } else if (var6 == 'š') {
                var4[var5] = -102;
            } else if (var6 == '›') {
                var4[var5] = -101;
            } else if (var6 == 'œ') {
                var4[var5] = -100;
            } else if (var6 == 'ž') {
                var4[var5] = -98;
            } else if (var6 == 'Ÿ') {
                var4[var5] = -97;
            } else {
                var4[var5] = 63;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZIIIZ)V")
    public final void method2102(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg3 - this.field5008;
        int var9 = arg5 - this.field5007;
        field5002++;
        int var10 = 256;
        if (arg2) {
            var10 |= 0x20000;
        }
        if (arg6) {
            var10 |= 0x40000000;
        }
        int var11 = var9;
        if (arg1 != 1) {
            field5005 = 88;
        }
        while (arg0 + var9 > var11) {
            if (var11 >= 0 && this.field5011 > var11) {
                for (int var12 = var8; var12 < arg4 + var8; var12++) {
                    if (var12 >= 0 && this.field5003 > var12) {
                        this.method2100(-22643, var10, var11, var12);
                    }
                }
            }
            var11++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIBIIIIII)Z")
    public final boolean method2103(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4994++;
        if (arg6 > 1) {
            return class253.method1835(arg0, arg3, arg6, arg1, arg6, arg4, arg5, (byte) 95, arg8) ? true : this.method2099(arg6, arg5, arg6, arg0, arg1, (byte) -82, arg4, arg8, arg3, arg7);
        }
        int var10 = arg3 + arg5 - 1;
        if (arg2 != 17) {
            return false;
        }
        int var11 = arg1 + arg4 - 1;
        if (arg8 >= arg3 && arg8 <= var10 && arg0 >= arg4 && arg0 <= var11) {
            return true;
        } else if (arg3 - 1 == arg8 && arg4 <= arg0 && var11 >= arg0 && (this.field5006[arg8 - this.field5007][arg0 - this.field5008] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg8 && arg4 <= arg0 && arg0 <= var11 && (this.field5006[arg8 - this.field5007][arg0 - this.field5008] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg0 && arg3 <= arg8 && arg8 <= var10 && (this.field5006[arg8 - this.field5007][arg0 - this.field5008] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg0 && arg8 >= arg3 && arg8 <= var10 && (this.field5006[arg8 - this.field5007][arg0 - this.field5008] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(III)V")
    public final void method2104(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field5008;
        field5009++;
        int var5 = arg2 - this.field5007;
        if (arg0 != 1) {
            this.field5008 = -15;
        }
        this.field5006[var5][var4] = class312.method2107(this.field5006[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBIIIIII)Z")
    public final boolean method2105(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5012++;
        if (arg4 == 1) {
            if (arg0 == arg5 && arg3 == arg7) {
                return true;
            }
        } else if (arg0 <= arg5 && (arg0 + arg4 - 1) >= arg5 && arg3 <= arg3 && arg3 <= (arg3 + arg4 - 1)) {
            return true;
        }
        int var9 = arg7 - this.field5008;
        int var10 = arg3 - this.field5008;
        int var11 = arg0 - this.field5007;
        if (arg1 < 112) {
            return true;
        }
        int var12 = arg5 - this.field5007;
        if (arg4 == 1) {
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field5006[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field5006[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field5006[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9 && (this.field5006[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field5006[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field5006[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field5006[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field5006[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var11 == var12 && var10 + 1 == var9 && (this.field5006[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && var10 - 1 == var9 && (this.field5006[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var11 && var9 == var10 && (this.field5006[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field5006[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg4 + var11 - 1;
            int var14 = arg4 + var9 - 1;
            if (arg6 == 6 || arg6 == 7) {
                if (arg6 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var12 + 1) == var11 && var10 >= var9 && var14 >= var10 && (this.field5006[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && (var10 - arg4) == var9 && (this.field5006[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var12 - arg4) == var11 && var9 <= var10 && var14 >= var10 && (this.field5006[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && (var10 - arg4) == var9 && (this.field5006[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var12 - arg4) == var11 && var10 >= var9 && var10 <= var14 && (this.field5006[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var10 + 1 == var9 && (this.field5006[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var12 + 1) == var11 && var9 <= var10 && var14 >= var10 && (this.field5006[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && var10 + 1 == var9 && (this.field5006[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 8) {
                if (var11 <= var12 && var12 <= var13 && var10 + 1 == var9 && (this.field5006[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 <= var12 && var13 >= var12 && (var10 - arg4) == var9 && (this.field5006[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg4 == var11 && var10 >= var9 && var14 >= var10 && (this.field5006[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 <= var10 && var10 <= var14 && (this.field5006[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method2106(int arg0) {
        field4999 = null;
        if (arg0 > -11) {
            field5005 = 122;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(II)V")
    public class311(int arg0, int arg1) {
        this.field5011 = arg0;
        this.field5007 = 0;
        this.field5003 = arg1;
        this.field5008 = 0;
        this.field5006 = new int[this.field5011][this.field5003];
        this.method2091((byte) 88);
    }
}
