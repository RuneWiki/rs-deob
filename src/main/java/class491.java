import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class491 {

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "Lfa;")
    public static class371 field6897;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public int field6891;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public int field6898;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public int field6899;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
    public int field6904;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
    public static int field6909;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tf", name = "z", descriptor = "Ljava/lang/Class;")
    public static Class field6910;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tf", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field6911;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tf", name = "B", descriptor = "Ljava/lang/Class;")
    public static Class field6912;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "[[I")
    public int[][] field6890;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2879(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class332("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field6897 = new class371(64);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIBLki;)J", line = 3)
    public static final long method2860(int arg0, int arg1, byte arg2, class218 arg3) {
        field6887++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        if (arg2 != 99) {
            return -115L;
        }
        class271 var10 = class206.field3124.method338((byte) 119, arg3.method257(false));
        long var11 = (long) (arg3.method250((byte) 116) | 0x10000 << 14 | arg0 | arg1 << 7 | arg3.method244((byte) -21) << 20);
        if (var10.field4053 == 0) {
            var11 |= var8;
        }
        if (var10.field4067 == 1) {
            var11 |= var4;
        }
        if (var10.field4006) {
            var11 |= var6;
        }
        return var11 | (long) arg3.method257(false) << 32;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIII)Z", line = 35)
    public final boolean method2861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6907++;
        if (arg2 == 1) {
            if (arg0 == arg6 && arg4 == arg5) {
                return true;
            }
        } else if (arg6 <= arg0 && arg6 + arg2 - 1 >= arg0 && arg5 >= arg5 && arg5 <= (arg5 + arg2 - 1)) {
            return true;
        }
        int var9 = arg6 - this.field6898;
        int var10 = arg0 - this.field6898;
        int var11 = arg4 - this.field6904;
        int var12 = arg5 - this.field6904;
        if (arg1 != 26021) {
            this.method2863(114, -55, -114);
        }
        if (arg2 == 1) {
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if ((var10 + 1) == var9 && var11 == var12 && (this.field6890[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field6890[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field6890[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field6890[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field6890[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field6890[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var10 + 1 == var9 && var11 == var12 && (this.field6890[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field6890[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var9 == var10 && (var12 + 1) == var11 && (this.field6890[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var12 - 1 == var11 && (this.field6890[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var9 && var11 == var12 && (this.field6890[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var9 && var11 == var12 && (this.field6890[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var9 - 1;
            int var14 = var11 + arg2 - 1;
            if (arg3 == 6 || arg3 == 7) {
                if (arg3 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var10 + 1 == var9 && var12 >= var11 && var12 <= var14 && (this.field6890[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var13 >= var10 && (var12 - arg2) == var11 && (this.field6890[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var10 - arg2 == var9 && var11 <= var12 && var12 <= var14 && (this.field6890[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var12 - arg2) == var11 && (this.field6890[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var10 - arg2 == var9 && var11 <= var12 && var12 <= var14 && (this.field6890[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 + 1 == var11 && (this.field6890[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var10 + 1 == var9 && var11 <= var12 && var12 <= var14 && (this.field6890[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && var12 + 1 == var11 && (this.field6890[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 8) {
                if (var10 >= var9 && var13 >= var10 && (var12 + 1) == var11 && (this.field6890[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var10 && var13 >= var10 && (var12 - arg2) == var11 && (this.field6890[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if (var10 - arg2 == var9 && var12 >= var11 && var12 <= var14 && (this.field6890[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var12 >= var11 && var12 <= var14 && (this.field6890[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 228)
    public static final void method2862(byte arg0) {
        class400 var1 = class269.field3975;
        synchronized (class269.field3975) {
            class269.field3975.method2401((byte) -104);
            if (arg0 != -21) {
                method2871(-94);
            }
        }
        field6892++;
        class400 var2 = class452.field6417;
        synchronized (class452.field6417) {
            class452.field6417.method2401((byte) -116);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V", line = 250)
    public final void method2863(int arg0, int arg1, int arg2) {
        field6888++;
        if (arg1 > -51) {
            field6897 = null;
        }
        int var4 = arg2 - this.field6898;
        int var5 = arg0 - this.field6904;
        this.field6890[var4][var5] = class412.method2463(this.field6890[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZIIIIBZ)V", line = 263)
    public final void method2864(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, boolean arg7) {
        field6906++;
        int var9 = 256;
        if (arg1) {
            var9 |= 0x20000;
        }
        if (arg6 != -61) {
            this.method2861(102, 57, 14, 59, 96, 21, -23, -124);
        }
        int var10 = arg0 - this.field6898;
        int var11 = arg3 - this.field6904;
        if (arg7) {
            var9 |= 0x40000000;
        }
        if (arg5 == 1 || arg5 == 3) {
            int var12 = arg2;
            arg2 = arg4;
            arg4 = var12;
        }
        for (int var13 = var10; var13 < (arg2 + var10); var13++) {
            if (var13 >= 0 && var13 < this.field6899) {
                for (int var14 = var11; var14 < (var11 + arg4); var14++) {
                    if (var14 >= 0 && var14 < this.field6891) {
                        this.method2875(arg6 + 750, var13, var14, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(III)V", line = 316)
    public final void method2865(int arg0, int arg1, int arg2) {
        field6905++;
        int var4 = arg1 - this.field6904;
        int var5 = arg2 - this.field6898;
        this.field6890[var5][var4] = class412.method2463(this.field6890[var5][var4], arg0);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(IIIIIIII)Z", line = 327)
    public final boolean method2866(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6908++;
        if (arg7 == 1) {
            if (arg0 == arg6 && arg1 == arg4) {
                return true;
            }
        } else if (arg0 >= arg6 && arg0 <= arg6 + arg7 - 1 && arg1 <= arg1 && arg1 <= arg1 + arg7 - 1) {
            return true;
        }
        int var9 = arg4 - this.field6904;
        if (arg5 != 2883848) {
            this.field6898 = 96;
        }
        int var10 = arg0 - this.field6898;
        int var11 = arg6 - this.field6898;
        int var12 = arg1 - this.field6904;
        if (arg7 == 1) {
            if (arg2 == 0) {
                if (arg3 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field6890[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field6890[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field6890[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field6890[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field6890[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field6890[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field6890[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field6890[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field6890[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9 && (this.field6890[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field6890[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9 && (this.field6890[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field6890[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var12 + 1) == var9 && (this.field6890[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var12 - 1) == var9) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var12 + 1 == var9 && (this.field6890[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field6890[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var12 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var10 == var11 && (var12 + 1) == var9 && (this.field6890[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && (var12 - 1) == var9 && (this.field6890[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var11 && var9 == var12 && (this.field6890[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 == var12 && (this.field6890[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg7 + var11 - 1;
            int var14 = var9 + arg7 - 1;
            if (arg2 == 0) {
                if (arg3 == 0) {
                    if ((var10 - arg7) == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var12 + 1) == var9 && (this.field6890[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 - arg7) == var9 && (this.field6890[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var11 <= var10 && var13 >= var10 && var12 + 1 == var9) {
                        return true;
                    }
                    if ((var10 - arg7) == var11 && var12 >= var9 && var12 <= var14 && (this.field6890[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var12 <= var14 && (this.field6890[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var10 + 1 == var11 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var12 + 1 == var9 && (this.field6890[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var12 - arg7 == var9 && (this.field6890[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 >= var11 && var13 >= var10 && var12 - arg7 == var9) {
                        return true;
                    }
                    if ((var10 - arg7) == var11 && var12 >= var9 && var12 <= var14 && (this.field6890[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var9 && var12 <= var14 && (this.field6890[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg3 == 0) {
                    if ((var10 - arg7) == var11 && var9 <= var12 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var12 + 1 == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var9 && var12 <= var14 && (this.field6890[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var12 - arg7) == var9 && (this.field6890[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var10 - arg7) == var11 && var12 >= var9 && var12 <= var14 && (this.field6890[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 + 1) == var9) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 >= var9 && var12 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var12 - arg7) == var9 && (this.field6890[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var10 - arg7) == var11 && var12 >= var9 && var14 >= var12 && (this.field6890[var13][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var12 + 1 == var9 && (this.field6890[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 >= var9 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var12 - arg7 == var9) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if (var10 - arg7 == var11 && var9 <= var12 && var14 >= var12) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var12 + 1) == var9 && (this.field6890[var10][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 <= var12 && var12 <= var14 && (this.field6890[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var12 - arg7 == var9) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var10 >= var11 && var13 >= var10 && (var12 + 1) == var9 && (this.field6890[var10][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var10 && var13 >= var10 && (var12 - arg7) == var9 && (this.field6890[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var10 - arg7 == var11 && var12 >= var9 && var12 <= var14 && (this.field6890[var13][var12] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 <= var12 && var14 >= var12 && (this.field6890[var11][var12] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILng;ILjava/awt/Canvas;Lcp;)Ltq;", line = 697)
    public static final class63 method2867(int arg0, int arg1, class153 arg2, int arg3, Canvas arg4, class481 arg5) {
        if (arg3 != -5576) {
            return null;
        }
        field6894++;
        try {
            Class var6 = Class.forName("nm");
            Constructor var7 = var6.getConstructor(field6910 == null ? (field6910 = method2879("java.awt.Canvas")) : field6910, field6911 == null ? (field6911 = method2879("cp")) : field6911, Integer.TYPE, Integer.TYPE, field6912 == null ? (field6912 = method2879("ng")) : field6912);
            return (class63) var7.newInstance(arg4, arg5, Integer.valueOf(arg1), new Integer(arg0), arg2);
        } catch (Exception var8) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZIIIZII)V", line = 725)
    public final void method2868(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = arg5 - this.field6904;
        int var9 = arg2 - this.field6898;
        field6896++;
        if (arg3 == 0) {
            if (arg6 == 0) {
                this.method2878(var9, 12081, var8, 128);
                this.method2878(var9 - 1, 12081, var8, 8);
            }
            if (arg6 == 1) {
                this.method2878(var9, 12081, var8, 2);
                this.method2878(var9, 12081, var8 + 1, 32);
            }
            if (arg6 == 2) {
                this.method2878(var9, 12081, var8, 8);
                this.method2878(var9 + 1, 12081, var8, 128);
            }
            if (arg6 == 3) {
                this.method2878(var9, 12081, var8, 32);
                this.method2878(var9, 12081, var8 - 1, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg6 == 0) {
                this.method2878(var9, 12081, var8, 1);
                this.method2878(var9 - 1, 12081, var8 + 1, 16);
            }
            if (arg6 == 1) {
                this.method2878(var9, 12081, var8, 4);
                this.method2878(var9 + 1, 12081, var8 + 1, 64);
            }
            if (arg6 == 2) {
                this.method2878(var9, 12081, var8, 16);
                this.method2878(var9 + 1, 12081, var8 - 1, 1);
            }
            if (arg6 == 3) {
                this.method2878(var9, 12081, var8, 64);
                this.method2878(var9 - 1, 12081, var8 - 1, 4);
            }
        }
        if (arg3 == 2) {
            if (arg6 == 0) {
                this.method2878(var9, 12081, var8, 130);
                this.method2878(var9 - 1, 12081, var8, 8);
                this.method2878(var9, 12081, var8 + 1, 32);
            }
            if (arg6 == 1) {
                this.method2878(var9, 12081, var8, 10);
                this.method2878(var9, 12081, var8 + 1, 32);
                this.method2878(var9 + 1, 12081, var8, 128);
            }
            if (arg6 == 2) {
                this.method2878(var9, 12081, var8, 40);
                this.method2878(var9 + 1, 12081, var8, 128);
                this.method2878(var9, 12081, var8 - 1, 2);
            }
            if (arg6 == 3) {
                this.method2878(var9, 12081, var8, 160);
                this.method2878(var9, 12081, var8 - 1, 2);
                this.method2878(var9 - 1, 12081, var8, 8);
            }
        }
        if (arg0) {
            if (arg3 == 0) {
                if (arg6 == 0) {
                    this.method2878(var9, 12081, var8, 65536);
                    this.method2878(var9 - 1, 12081, var8, 4096);
                }
                if (arg6 == 1) {
                    this.method2878(var9, 12081, var8, 1024);
                    this.method2878(var9, 12081, var8 + 1, 16384);
                }
                if (arg6 == 2) {
                    this.method2878(var9, 12081, var8, 4096);
                    this.method2878(var9 + 1, 12081, var8, 65536);
                }
                if (arg6 == 3) {
                    this.method2878(var9, 12081, var8, 16384);
                    this.method2878(var9, 12081, var8 - 1, 1024);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg6 == 0) {
                    this.method2878(var9, 12081, var8, 512);
                    this.method2878(var9 - 1, 12081, var8 + 1, 8192);
                }
                if (arg6 == 1) {
                    this.method2878(var9, 12081, var8, 2048);
                    this.method2878(var9 + 1, 12081, var8 + 1, 32768);
                }
                if (arg6 == 2) {
                    this.method2878(var9, 12081, var8, 8192);
                    this.method2878(var9 + 1, 12081, var8 - 1, 512);
                }
                if (arg6 == 3) {
                    this.method2878(var9, 12081, var8, 32768);
                    this.method2878(var9 - 1, 12081, var8 - 1, 2048);
                }
            }
            if (arg3 == 2) {
                if (arg6 == 0) {
                    this.method2878(var9, 12081, var8, 66560);
                    this.method2878(var9 - 1, 12081, var8, 4096);
                    this.method2878(var9, 12081, var8 + 1, 16384);
                }
                if (arg6 == 1) {
                    this.method2878(var9, 12081, var8, 5120);
                    this.method2878(var9, 12081, var8 + 1, 16384);
                    this.method2878(var9 + 1, 12081, var8, 65536);
                }
                if (arg6 == 2) {
                    this.method2878(var9, 12081, var8, 20480);
                    this.method2878(var9 + 1, 12081, var8, 65536);
                    this.method2878(var9, 12081, var8 - 1, 1024);
                }
                if (arg6 == 3) {
                    this.method2878(var9, 12081, var8, 81920);
                    this.method2878(var9, 12081, var8 - 1, 1024);
                    this.method2878(var9 - 1, 12081, var8, 4096);
                }
            }
        }
        if (arg4) {
            if (arg3 == 0) {
                if (arg6 == 0) {
                    this.method2878(var9, 12081, var8, 536870912);
                    this.method2878(var9 - 1, 12081, var8, 33554432);
                }
                if (arg6 == 1) {
                    this.method2878(var9, 12081, var8, 8388608);
                    this.method2878(var9, 12081, var8 + 1, 134217728);
                }
                if (arg6 == 2) {
                    this.method2878(var9, 12081, var8, 33554432);
                    this.method2878(var9 + 1, 12081, var8, 536870912);
                }
                if (arg6 == 3) {
                    this.method2878(var9, 12081, var8, 134217728);
                    this.method2878(var9, 12081, var8 - 1, 8388608);
                }
            }
            if (arg3 == 1 || arg3 == 3) {
                if (arg6 == 0) {
                    this.method2878(var9, 12081, var8, 4194304);
                    this.method2878(var9 - 1, 12081, var8 + 1, 67108864);
                }
                if (arg6 == 1) {
                    this.method2878(var9, 12081, var8, 16777216);
                    this.method2878(var9 + 1, 12081, var8 + 1, 268435456);
                }
                if (arg6 == 2) {
                    this.method2878(var9, 12081, var8, 67108864);
                    this.method2878(var9 + 1, 12081, var8 - 1, 4194304);
                }
                if (arg6 == 3) {
                    this.method2878(var9, 12081, var8, 268435456);
                    this.method2878(var9 - 1, 12081, var8 - 1, 16777216);
                }
            }
            if (arg3 == 2) {
                if (arg6 == 0) {
                    this.method2878(var9, 12081, var8, 545259520);
                    this.method2878(var9 - 1, 12081, var8, 33554432);
                    this.method2878(var9, 12081, var8 + 1, 134217728);
                }
                if (arg6 == 1) {
                    this.method2878(var9, 12081, var8, 41943040);
                    this.method2878(var9, 12081, var8 + 1, 134217728);
                    this.method2878(var9 + 1, 12081, var8, 536870912);
                }
                if (arg6 == 2) {
                    this.method2878(var9, 12081, var8, 167772160);
                    this.method2878(var9 + 1, 12081, var8, 536870912);
                    this.method2878(var9, 12081, var8 - 1, 8388608);
                }
                if (arg6 == 3) {
                    this.method2878(var9, 12081, var8, 671088640);
                    this.method2878(var9, 12081, var8 - 1, 8388608);
                    this.method2878(var9 - 1, 12081, var8, 33554432);
                }
            }
        }
        if (arg1 > -81) {
            this.method2878(87, 64, -31, -1);
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(III)V", line = 1034)
    public final void method2869(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field6904;
        field6901++;
        int var5 = arg2 - this.field6898;
        this.field6890[var5][var4] = class347.method2139(this.field6890[var5][var4], 2097152);
        if (arg0 != 24279) {
            this.field6899 = 75;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 1047)
    public final void method2870(int arg0) {
        for (int var2 = 0; var2 < this.field6899; var2++) {
            for (int var3 = 0; var3 < this.field6891; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field6899 - 5 || var3 >= this.field6891 - 5) {
                    this.field6890[var2][var3] = -1;
                } else {
                    this.field6890[var2][var3] = 2097152;
                }
            }
        }
        if (arg0 >= -108) {
            this.method2870(38);
        }
        field6886++;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 1079)
    public static void method2871(int arg0) {
        int var1 = -124 % ((59 - arg0) / 37);
        field6897 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZIZIIZ)V", line = 1095)
    public final void method2872(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field6903++;
        int var8 = 256;
        if (arg6) {
            var8 |= 0x20000;
        }
        int var9 = arg0 - this.field6898;
        if (arg1) {
            var8 |= 0x40000000;
        }
        int var10 = arg4 - this.field6904;
        int var11 = var9;
        if (arg3) {
            this.method2875(-16, -125, -84, 111);
        }
        while (var11 < arg5 + var9) {
            if (var11 >= 0 && var11 < this.field6899) {
                for (int var12 = var10; var12 < (arg2 + var10); var12++) {
                    if (var12 >= 0 && var12 < this.field6891) {
                        this.method2878(var11, 12081, var12, var8);
                    }
                }
            }
            var11++;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIZZ)V", line = 1147)
    public final void method2873(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        field6900++;
        int var8 = arg1 - this.field6898;
        int var9 = arg3 - this.field6904;
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method2875(689, var8, var9, 128);
                this.method2875(689, var8 - 1, var9, 8);
            }
            if (arg0 == 1) {
                this.method2875(689, var8, var9, 2);
                this.method2875(689, var8, var9 + 1, 32);
            }
            if (arg0 == 2) {
                this.method2875(689, var8, var9, 8);
                this.method2875(arg2 ^ 0xFFFFFD4C, var8 + 1, var9, 128);
            }
            if (arg0 == 3) {
                this.method2875(689, var8, var9, 32);
                this.method2875(689, var8, var9 - 1, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method2875(689, var8, var9, 1);
                this.method2875(arg2 + 692, var8 + -1, var9 + 1, 16);
            }
            if (arg0 == 1) {
                this.method2875(689, var8, var9, 4);
                this.method2875(689, var8 + 1, var9 + 1, 64);
            }
            if (arg0 == 2) {
                this.method2875(689, var8, var9, 16);
                this.method2875(689, var8 + 1, var9 + -1, 1);
            }
            if (arg0 == 3) {
                this.method2875(689, var8, var9, 64);
                this.method2875(689, var8 - 1, var9 + -1, 4);
            }
        }
        if (~arg4 == arg2) {
            if (arg0 == 0) {
                this.method2875(arg2 ^ 0xFFFFFD4C, var8, var9, 130);
                this.method2875(689, var8 - 1, var9, 8);
                this.method2875(arg2 + 692, var8, var9 + 1, 32);
            }
            if (arg0 == 1) {
                this.method2875(689, var8, var9, 10);
                this.method2875(689, var8, var9 + 1, 32);
                this.method2875(689, var8 + 1, var9, 128);
            }
            if (arg0 == 2) {
                this.method2875(arg2 + 692, var8, var9, 40);
                this.method2875(689, var8 + 1, var9, 128);
                this.method2875(689, var8, var9 - 1, 2);
            }
            if (arg0 == 3) {
                this.method2875(arg2 + 692, var8, var9, 160);
                this.method2875(arg2 + 692, var8, var9 - 1, 2);
                this.method2875(689, var8 - 1, var9, 8);
            }
        }
        if (arg5) {
            if (arg4 == 0) {
                if (arg0 == 0) {
                    this.method2875(689, var8, var9, 65536);
                    this.method2875(689, var8 - 1, var9, 4096);
                }
                if (arg0 == 1) {
                    this.method2875(689, var8, var9, 1024);
                    this.method2875(arg2 ^ 0xFFFFFD4C, var8, var9 + 1, 16384);
                }
                if (arg0 == 2) {
                    this.method2875(689, var8, var9, 4096);
                    this.method2875(689, var8 + 1, var9, 65536);
                }
                if (arg0 == 3) {
                    this.method2875(arg2 ^ 0xFFFFFD4C, var8, var9, 16384);
                    this.method2875(689, var8, var9 - 1, 1024);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg0 == 0) {
                    this.method2875(689, var8, var9, 512);
                    this.method2875(689, var8 - 1, var9 + 1, 8192);
                }
                if (arg0 == 1) {
                    this.method2875(689, var8, var9, 2048);
                    this.method2875(689, var8 + 1, var9 + 1, 32768);
                }
                if (arg0 == 2) {
                    this.method2875(689, var8, var9, 8192);
                    this.method2875(arg2 ^ 0xFFFFFD4C, var8 + 1, var9 + -1, 512);
                }
                if (arg0 == 3) {
                    this.method2875(arg2 + 692, var8, var9, 32768);
                    this.method2875(689, var8 - 1, var9 + -1, 2048);
                }
            }
            if (arg4 == 2) {
                if (arg0 == 0) {
                    this.method2875(689, var8, var9, 66560);
                    this.method2875(689, var8 - 1, var9, 4096);
                    this.method2875(arg2 + 692, var8, var9 + 1, 16384);
                }
                if (arg0 == 1) {
                    this.method2875(689, var8, var9, 5120);
                    this.method2875(689, var8, var9 + 1, 16384);
                    this.method2875(689, var8 + 1, var9, 65536);
                }
                if (arg0 == 2) {
                    this.method2875(689, var8, var9, 20480);
                    this.method2875(arg2 + 692, var8 + 1, var9, 65536);
                    this.method2875(689, var8, var9 - 1, 1024);
                }
                if (arg0 == 3) {
                    this.method2875(arg2 + 692, var8, var9, 81920);
                    this.method2875(689, var8, var9 - 1, 1024);
                    this.method2875(689, var8 - 1, var9, 4096);
                }
            }
        }
        if (!arg6) {
            return;
        }
        if (arg4 == 0) {
            if (arg0 == 0) {
                this.method2875(arg2 ^ 0xFFFFFD4C, var8, var9, 536870912);
                this.method2875(689, var8 - 1, var9, 33554432);
            }
            if (arg0 == 1) {
                this.method2875(689, var8, var9, 8388608);
                this.method2875(689, var8, var9 + 1, 134217728);
            }
            if (arg0 == 2) {
                this.method2875(arg2 ^ 0xFFFFFD4C, var8, var9, 33554432);
                this.method2875(689, var8 + 1, var9, 536870912);
            }
            if (arg0 == 3) {
                this.method2875(689, var8, var9, 134217728);
                this.method2875(689, var8, var9 - 1, 8388608);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg0 == 0) {
                this.method2875(689, var8, var9, 4194304);
                this.method2875(689, var8 - 1, var9 + 1, 67108864);
            }
            if (arg0 == 1) {
                this.method2875(689, var8, var9, 16777216);
                this.method2875(arg2 ^ 0xFFFFFD4C, var8 + 1, var9 + 1, 268435456);
            }
            if (arg0 == 2) {
                this.method2875(arg2 + 692, var8, var9, 67108864);
                this.method2875(689, var8 + 1, var9 + -1, 4194304);
            }
            if (arg0 == 3) {
                this.method2875(689, var8, var9, 268435456);
                this.method2875(arg2 ^ 0xFFFFFD4C, var8 - 1, var9 + -1, 16777216);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method2875(arg2 ^ 0xFFFFFD4C, var8, var9, 545259520);
            this.method2875(689, var8 - 1, var9, 33554432);
            this.method2875(689, var8, var9 + 1, 134217728);
        }
        if (arg0 == 1) {
            this.method2875(689, var8, var9, 41943040);
            this.method2875(arg2 ^ 0xFFFFFD4C, var8, var9 + 1, 134217728);
            this.method2875(arg2 + 692, var8 + 1, var9, 536870912);
        }
        if (arg0 == 2) {
            this.method2875(arg2 ^ 0xFFFFFD4C, var8, var9, 167772160);
            this.method2875(arg2 + 692, var8 + 1, var9, 536870912);
            this.method2875(689, var8, var9 - 1, 8388608);
        }
        if (arg0 == 3) {
            this.method2875(689, var8, var9, 671088640);
            this.method2875(689, var8, var9 - 1, 8388608);
            this.method2875(arg2 ^ 0xFFFFFD4C, var8 - 1, var9, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIIII)Z", line = 1449)
    public final boolean method2874(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6885++;
        if (arg7 > 1) {
            return class146.method992(arg2, arg7, arg3, arg7, arg4, arg6, arg5, arg0, false) ? true : this.method2876(arg0, arg7, arg4, arg7, arg6, arg5, (byte) -38, arg1, arg2, arg3);
        }
        int var10 = arg2 + arg3 - 1;
        int var11 = arg5 + arg0 - 1;
        if (arg8 != -25971) {
            return false;
        } else if (arg3 <= arg4 && arg4 <= var10 && arg5 <= arg6 && var11 >= arg6) {
            return true;
        } else if ((arg3 - 1) == arg4 && arg5 <= arg6 && arg6 <= var11 && (this.field6890[arg4 - this.field6898][arg6 - this.field6904] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if ((var10 + 1) == arg4 && arg5 <= arg6 && var11 >= arg6 && (this.field6890[arg4 - this.field6898][arg6 - this.field6904] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg5 - 1 == arg6 && arg4 >= arg3 && arg4 <= var10 && (this.field6890[arg4 - this.field6898][arg6 - this.field6904] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg6 && arg3 <= arg4 && arg4 <= var10 && (this.field6890[arg4 - this.field6898][arg6 - this.field6904] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII)V", line = 1491)
    private final void method2875(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 689) {
            field6889++;
            this.field6890[arg1][arg2] = class412.method2463(this.field6890[arg1][arg2], ~arg3);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIBIII)Z", line = 1510)
    public final boolean method2876(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field6909++;
        int var11 = arg1 + arg2;
        int var12 = arg3 + arg4;
        if (arg6 != -38) {
            this.method2866(96, 64, 36, -42, -126, 17, 51, -106);
        }
        int var13 = arg8 + arg9;
        int var14 = arg5 + arg0;
        if (arg2 == var13 && (arg7 & 0x2) == 0) {
            int var15 = arg5 < arg4 ? arg4 : arg5;
            int var16 = var14 > var12 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field6890[var13 - this.field6898 - 1][var15 - this.field6904] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg9 == var11 && (arg7 & 0x8) == 0) {
            int var17 = arg4 <= arg5 ? arg5 : arg4;
            int var18 = var12 < var14 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field6890[arg9 - this.field6898][var17 - this.field6904] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg4 == var14 && (arg7 & 0x1) == 0) {
            int var19 = arg2 > arg9 ? arg2 : arg9;
            int var20 = var11 >= var13 ? var13 : var11;
            while (var20 > var19) {
                if ((this.field6890[var19 - this.field6898][var14 - this.field6904 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg5 == var12 && (arg7 & 0x4) == 0) {
            int var21 = arg9 >= arg2 ? arg9 : arg2;
            int var22 = var13 > var11 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field6890[var21 - this.field6898][arg5 - this.field6904] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(III)V", line = 1608)
    public final void method2877(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            this.field6891 = 94;
        }
        int var4 = arg2 - this.field6904;
        field6893++;
        int var5 = arg0 - this.field6898;
        this.field6890[var5][var4] = class347.method2139(this.field6890[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(IIII)V", line = 1626)
    private final void method2878(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 12081) {
            this.method2865(-107, 57, -28);
        }
        field6895++;
        this.field6890[arg0][arg2] = class347.method2139(this.field6890[arg0][arg2], arg3);
    }
}
