import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class251 {

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "Lwv;")
    public static class535 field4283 = new class535("runescape", 0);

    @OriginalMember(owner = "client!ir", name = "A", descriptor = "I")
    public static int field4292 = 0;

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "Llo;")
    public static class306 field4293 = new class306(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public int field4266;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
    public int field4271;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public int field4274;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "I")
    public int field4290;

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "[[I")
    public int[][] field4288;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "[[Lec;")
    public static class68[][] field4291;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method1697(int arg0, String arg1) {
        field4275++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        int var4 = 0;
        if (arg0 != 2883872) {
            return null;
        }
        while (var4 < var2) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1698(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4267++;
        if (arg4 == 1) {
            if (arg5 == arg6 && arg0 == arg2) {
                return true;
            }
        } else if (arg6 >= arg5 && arg6 <= (arg5 + arg4 - 1) && arg2 >= arg2 && arg2 <= arg2 + arg4 - 1) {
            return true;
        }
        if (arg1 < 48) {
            return false;
        }
        int var9 = arg0 - this.field4271;
        int var10 = arg2 - this.field4271;
        int var11 = arg5 - this.field4274;
        int var12 = arg6 - this.field4274;
        if (arg4 == 1) {
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field4288[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field4288[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field4288[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field4288[var11][var9] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field4288[var11][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9 && (this.field4288[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field4288[var11][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field4288[var11][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var11 == var12 && (var10 + 1) == var9 && (this.field4288[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && (var10 - 1) == var9 && (this.field4288[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var11 && var9 == var10 && (this.field4288[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field4288[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg4 + var11 - 1;
            int var14 = arg4 + var9 - 1;
            if (arg7 == 6 || arg7 == 7) {
                if (arg7 == 7) {
                    arg3 = arg3 + 2 & 0x3;
                }
                if (arg3 == 0) {
                    if ((var12 + 1) == var11 && var9 <= var10 && var10 <= var14 && (this.field4288[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && (var10 - arg4) == var9 && (this.field4288[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 1) {
                    if (var12 - arg4 == var11 && var10 >= var9 && var10 <= var14 && (this.field4288[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && var10 - arg4 == var9 && (this.field4288[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg3 == 2) {
                    if ((var12 - arg4) == var11 && var9 <= var10 && var14 >= var10 && (this.field4288[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var10 + 1 == var9 && (this.field4288[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg3 == 3) {
                    if ((var12 + 1) == var11 && var10 >= var9 && var10 <= var14 && (this.field4288[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && (var10 + 1) == var9 && (this.field4288[var12][var9] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg7 == 8) {
                if (var11 <= var12 && var12 <= var13 && (var10 + 1) == var9 && (this.field4288[var12][var9] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var11 && var13 >= var12 && (var10 - arg4) == var9 && (this.field4288[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if (var12 - arg4 == var11 && var10 >= var9 && var14 >= var10 && (this.field4288[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var11 && var10 >= var9 && var14 >= var10 && (this.field4288[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIII)V")
    private final void method1699(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= -29) {
            this.field4288[arg2][arg3] = class338.method2141(this.field4288[arg2][arg3], arg1);
            field4279++;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BII)V")
    public final void method1700(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field4271;
        if (arg0 != -23) {
            this.method1700((byte) 16, 70, -126);
        }
        field4276++;
        int var5 = arg2 - this.field4274;
        this.field4288[var5][var4] = class338.method2141(this.field4288[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIIIIIZ)Z")
    public final boolean method1701(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field4296++;
        if (arg4 > 1) {
            return class239.method1640(arg4, arg2, arg3, arg0, arg7, arg6, false, arg1, arg4) ? true : this.method1715(arg4, arg1, arg2, arg3, arg0, arg4, -94, arg6, arg7, arg5);
        } else if (arg8) {
            return false;
        } else {
            int var10 = arg1 + arg6 - 1;
            int var11 = arg7 + arg2 - 1;
            if (arg3 >= arg6 && var10 >= arg3 && arg2 <= arg0 && arg0 <= var11) {
                return true;
            } else if (arg6 - 1 == arg3 && arg2 <= arg0 && arg0 <= var11 && (this.field4288[arg3 - this.field4274][arg0 - this.field4271] & 0x8) == 0 && (arg5 & 0x8) == 0) {
                return true;
            } else if ((var10 + 1) == arg3 && arg0 >= arg2 && arg0 <= var11 && (this.field4288[arg3 - this.field4274][arg0 - this.field4271] & 0x80) == 0 && (arg5 & 0x2) == 0) {
                return true;
            } else if ((arg2 - 1) == arg0 && arg3 >= arg6 && var10 >= arg3 && (this.field4288[arg3 - this.field4274][arg0 - this.field4271] & 0x2) == 0 && (arg5 & 0x4) == 0) {
                return true;
            } else {
                return var11 + 1 == arg0 && arg3 >= arg6 && arg3 <= var10 && (this.field4288[arg3 - this.field4274][arg0 - this.field4271] & 0x20) == 0 && (arg5 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IBI)V")
    public final void method1702(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field4271;
        field4278++;
        int var5 = arg0 - this.field4274;
        if (arg1 <= 1) {
            field4297 = 42;
        }
        this.field4288[var5][var4] = class344.method2224(this.field4288[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method1703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4273++;
        if (arg7 == 1) {
            if (arg0 == arg5 && arg3 == arg6) {
                return true;
            }
        } else if (arg5 <= arg0 && (arg5 + arg7 - 1) >= arg0 && arg3 <= arg3 && arg3 <= arg3 + arg7 - 1) {
            return true;
        }
        int var9 = arg6 - this.field4271;
        int var10 = arg3 - this.field4271;
        int var11 = arg5 - this.field4274;
        int var12 = arg0 - this.field4274;
        if (arg7 == 1) {
            if (arg2 == 0) {
                if (arg1 == 0) {
                    if ((var12 - 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field4288[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field4288[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 == var12 && var10 + 1 == var9) {
                        return true;
                    }
                    if (var12 - 1 == var11 && var9 == var10 && (this.field4288[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field4288[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 + 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field4288[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field4288[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 == var12 && (var10 - 1) == var9) {
                        return true;
                    }
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field4288[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field4288[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    if ((var12 - 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10 && (this.field4288[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field4288[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 - 1 == var11 && var9 == var10 && (this.field4288[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && (var10 + 1) == var9) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9 && (this.field4288[var11][var9] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var12 - 1) == var11 && var9 == var10 && (this.field4288[var11][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field4288[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && (var10 - 1) == var9) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var12 - 1) == var11 && var9 == var10) {
                        return true;
                    }
                    if (var11 == var12 && var10 + 1 == var9 && (this.field4288[var11][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 == var10 && (this.field4288[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 == var12 && var10 - 1 == var9) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var11 == var12 && var10 + 1 == var9 && (this.field4288[var11][var9] & 0x20) == 0) {
                    return true;
                }
                if (var11 == var12 && (var10 - 1) == var9 && (this.field4288[var11][var9] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var11 && var9 == var10 && (this.field4288[var11][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var9 == var10 && (this.field4288[var11][var9] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg7 - 1;
            int var14 = arg7 + var9 - 1;
            if (arg2 == 0) {
                if (arg1 == 0) {
                    if ((var12 - arg7) == var11 && var9 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && (var10 + 1) == var9 && (this.field4288[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var10 - arg7 == var9 && (this.field4288[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 <= var12 && var12 <= var13 && (var10 + 1) == var9) {
                        return true;
                    }
                    if (var12 - arg7 == var11 && var9 <= var10 && var14 >= var10 && (this.field4288[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 <= var10 && var14 >= var10 && (this.field4288[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var12 + 1) == var11 && var10 >= var9 && var10 <= var14) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && (var10 + 1) == var9 && (this.field4288[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var10 - arg7 == var9 && (this.field4288[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 <= var12 && var13 >= var12 && var10 - arg7 == var9) {
                        return true;
                    }
                    if (var12 - arg7 == var11 && var10 >= var9 && var10 <= var14 && (this.field4288[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var10 >= var9 && var14 >= var10 && (this.field4288[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg2 == 2) {
                if (arg1 == 0) {
                    if ((var12 - arg7) == var11 && var10 >= var9 && var14 >= var10) {
                        return true;
                    }
                    if (var11 <= var12 && var12 <= var13 && var10 + 1 == var9) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 <= var10 && var14 >= var10 && (this.field4288[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var10 - arg7 == var9 && (this.field4288[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 - arg7 == var11 && var9 <= var10 && var14 >= var10 && (this.field4288[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var12 && var13 >= var12 && var10 + 1 == var9) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var9 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && (var10 - arg7) == var9 && (this.field4288[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 - arg7 == var11 && var10 >= var9 && var10 <= var14 && (this.field4288[var13][var10] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && (var10 + 1) == var9 && (this.field4288[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var11 && var9 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && (var10 - arg7) == var9) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var12 - arg7 == var11 && var10 >= var9 && var14 >= var10) {
                        return true;
                    }
                    if (var12 >= var11 && var13 >= var12 && var10 + 1 == var9 && (this.field4288[var12][var9] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var11 && var10 >= var9 && var10 <= var14 && (this.field4288[var11][var10] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var11 && var12 <= var13 && var10 - arg7 == var9) {
                        return true;
                    }
                }
            }
            if (arg2 == 9) {
                if (var11 <= var12 && var12 <= var13 && var10 + 1 == var9 && (this.field4288[var12][var9] & 0x2C0120) == 0) {
                    return true;
                }
                if (var11 <= var12 && var13 >= var12 && var10 - arg7 == var9 && (this.field4288[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var12 - arg7) == var11 && var10 >= var9 && var14 >= var10 && (this.field4288[var13][var10] & 0x2C0108) == 0) {
                    return true;
                }
                if ((var12 + 1) == var11 && var10 >= var9 && var10 <= var14 && (this.field4288[var11][var10] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return arg4 > -32;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4284++;
        if (class468.method2782(arg3, -24955)) {
            if (arg6 == -1) {
                if (field4291[arg3] == null) {
                    class111.method801(arg1, true, arg0, -1, arg7, arg8, arg4, class508.field7389[arg3], arg2, arg5);
                } else {
                    class111.method801(arg1, true, arg0, -1, arg7, arg8, arg4, field4291[arg3], arg2, arg5);
                }
            }
        } else if (arg1 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class445.field6633[var9] = true;
            }
        } else {
            class445.field6633[arg1] = true;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)V")
    public final void method1705(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field4274;
        int var5 = arg1 - this.field4271;
        field4277++;
        this.field4288[var4][var5] = class344.method2224(this.field4288[var4][var5], arg2);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
    public final void method1706(int arg0) {
        if (arg0 <= 75) {
            method1697(-55, null);
        }
        field4269++;
        for (int var2 = 0; var2 < this.field4266; var2++) {
            for (int var3 = 0; var3 < this.field4290; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= (this.field4266 - 5) || this.field4290 - 5 <= var3) {
                    this.field4288[var2][var3] = -1;
                } else {
                    this.field4288[var2][var3] = 2097152;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZZIZIII)V")
    public final void method1707(boolean arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg4 - this.field4274;
        int var9 = arg6 - this.field4271;
        field4287++;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method1712((byte) 106, var9, var8, 128);
                this.method1712((byte) -86, var9, var8 - 1, 8);
            }
            if (arg5 == 1) {
                this.method1712((byte) 101, var9, var8, 2);
                this.method1712((byte) -50, var9 + 1, var8, 32);
            }
            if (arg5 == 2) {
                this.method1712((byte) -62, var9, var8, 8);
                this.method1712((byte) 95, var9, var8 + 1, 128);
            }
            if (arg5 == 3) {
                this.method1712((byte) 111, var9, var8, 32);
                this.method1712((byte) -90, var9 - 1, var8, 2);
            }
        }
        if (!arg3) {
            this.method1715(-87, -59, 32, -66, -34, -62, 44, -64, 64, 83);
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method1712((byte) 105, var9, var8, 1);
                this.method1712((byte) -27, var9 + 1, var8 + -1, 16);
            }
            if (arg5 == 1) {
                this.method1712((byte) -25, var9, var8, 4);
                this.method1712((byte) -39, var9 + 1, var8 + 1, 64);
            }
            if (arg5 == 2) {
                this.method1712((byte) 87, var9, var8, 16);
                this.method1712((byte) -87, var9 - 1, var8 + 1, 1);
            }
            if (arg5 == 3) {
                this.method1712((byte) 111, var9, var8, 64);
                this.method1712((byte) 93, var9 - 1, var8 + -1, 4);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method1712((byte) 83, var9, var8, 130);
                this.method1712((byte) 98, var9, var8 - 1, 8);
                this.method1712((byte) 98, var9 + 1, var8, 32);
            }
            if (arg5 == 1) {
                this.method1712((byte) -72, var9, var8, 10);
                this.method1712((byte) -117, var9 + 1, var8, 32);
                this.method1712((byte) -102, var9, var8 + 1, 128);
            }
            if (arg5 == 2) {
                this.method1712((byte) 118, var9, var8, 40);
                this.method1712((byte) -96, var9, var8 + 1, 128);
                this.method1712((byte) -106, var9 - 1, var8, 2);
            }
            if (arg5 == 3) {
                this.method1712((byte) 115, var9, var8, 160);
                this.method1712((byte) -63, var9 - 1, var8, 2);
                this.method1712((byte) 127, var9, var8 - 1, 8);
            }
        }
        if (arg1) {
            if (arg2 == 0) {
                if (arg5 == 0) {
                    this.method1712((byte) 110, var9, var8, 65536);
                    this.method1712((byte) 114, var9, var8 - 1, 4096);
                }
                if (arg5 == 1) {
                    this.method1712((byte) 92, var9, var8, 1024);
                    this.method1712((byte) -63, var9 + 1, var8, 16384);
                }
                if (arg5 == 2) {
                    this.method1712((byte) 107, var9, var8, 4096);
                    this.method1712((byte) 112, var9, var8 + 1, 65536);
                }
                if (arg5 == 3) {
                    this.method1712((byte) -53, var9, var8, 16384);
                    this.method1712((byte) -49, var9 - 1, var8, 1024);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg5 == 0) {
                    this.method1712((byte) -61, var9, var8, 512);
                    this.method1712((byte) -23, var9 + 1, var8 + -1, 8192);
                }
                if (arg5 == 1) {
                    this.method1712((byte) 115, var9, var8, 2048);
                    this.method1712((byte) -49, var9 + 1, var8 - -1, 32768);
                }
                if (arg5 == 2) {
                    this.method1712((byte) 104, var9, var8, 8192);
                    this.method1712((byte) -113, var9 - 1, var8 - -1, 512);
                }
                if (arg5 == 3) {
                    this.method1712((byte) 98, var9, var8, 32768);
                    this.method1712((byte) 102, var9 - 1, var8 + -1, 2048);
                }
            }
            if (arg2 == 2) {
                if (arg5 == 0) {
                    this.method1712((byte) 116, var9, var8, 66560);
                    this.method1712((byte) 126, var9, var8 - 1, 4096);
                    this.method1712((byte) 124, var9 + 1, var8, 16384);
                }
                if (arg5 == 1) {
                    this.method1712((byte) -38, var9, var8, 5120);
                    this.method1712((byte) -111, var9 + 1, var8, 16384);
                    this.method1712((byte) -57, var9, var8 + 1, 65536);
                }
                if (arg5 == 2) {
                    this.method1712((byte) -78, var9, var8, 20480);
                    this.method1712((byte) -119, var9, var8 + 1, 65536);
                    this.method1712((byte) 94, var9 - 1, var8, 1024);
                }
                if (arg5 == 3) {
                    this.method1712((byte) -87, var9, var8, 81920);
                    this.method1712((byte) -47, var9 - 1, var8, 1024);
                    this.method1712((byte) -89, var9, var8 - 1, 4096);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method1712((byte) 92, var9, var8, 536870912);
                this.method1712((byte) -34, var9, var8 - 1, 33554432);
            }
            if (arg5 == 1) {
                this.method1712((byte) 118, var9, var8, 8388608);
                this.method1712((byte) -57, var9 + 1, var8, 134217728);
            }
            if (arg5 == 2) {
                this.method1712((byte) -36, var9, var8, 33554432);
                this.method1712((byte) -47, var9, var8 + 1, 536870912);
            }
            if (arg5 == 3) {
                this.method1712((byte) -77, var9, var8, 134217728);
                this.method1712((byte) -61, var9 - 1, var8, 8388608);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method1712((byte) 123, var9, var8, 4194304);
                this.method1712((byte) 79, var9 + 1, var8 - 1, 67108864);
            }
            if (arg5 == 1) {
                this.method1712((byte) 113, var9, var8, 16777216);
                this.method1712((byte) -36, var9 + 1, var8 + 1, 268435456);
            }
            if (arg5 == 2) {
                this.method1712((byte) -109, var9, var8, 67108864);
                this.method1712((byte) 103, var9 - 1, var8 + 1, 4194304);
            }
            if (arg5 == 3) {
                this.method1712((byte) 123, var9, var8, 268435456);
                this.method1712((byte) 110, var9 - 1, var8 + -1, 16777216);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method1712((byte) -91, var9, var8, 545259520);
            this.method1712((byte) 90, var9, var8 - 1, 33554432);
            this.method1712((byte) 121, var9 + 1, var8, 134217728);
        }
        if (arg5 == 1) {
            this.method1712((byte) -52, var9, var8, 41943040);
            this.method1712((byte) 116, var9 + 1, var8, 134217728);
            this.method1712((byte) 116, var9, var8 + 1, 536870912);
        }
        if (arg5 == 2) {
            this.method1712((byte) 121, var9, var8, 167772160);
            this.method1712((byte) -55, var9, var8 + 1, 536870912);
            this.method1712((byte) 91, var9 - 1, var8, 8388608);
        }
        if (arg5 == 3) {
            this.method1712((byte) -56, var9, var8, 671088640);
            this.method1712((byte) -25, var9 - 1, var8, 8388608);
            this.method1712((byte) 118, var9, var8 - 1, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
    public static final void method1708(byte arg0) {
        field4282++;
        if (arg0 != 54) {
            method1697(-80, null);
        }
        if (class275.field4529 == null) {
            return;
        }
        if (class275.field4529.field2692 == 1) {
            class275.field4529 = null;
            return;
        }
        if (class275.field4529.field2692 == 2) {
            class280.method1836(true, class340.field5326, 2, class517.field7659);
            class275.field4529 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZIIIZII)V")
    public final void method1709(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field4280++;
        int var9 = 256;
        if (arg1) {
            var9 |= 0x20000;
        }
        if (arg0 == 1 || arg0 == 3) {
            int var10 = arg7;
            arg7 = arg6;
            arg6 = var10;
        }
        if (arg5) {
            var9 |= 0x40000000;
        }
        int var11 = arg2 - this.field4274;
        int var12 = arg4 - this.field4271;
        int var13 = var11;
        if (arg3 > -15) {
            field4291 = null;
        }
        while (var13 < (arg7 + var11)) {
            if (var13 >= 0 && var13 < this.field4266) {
                for (int var14 = var12; var14 < (arg6 + var12); var14++) {
                    if (var14 >= 0 && this.field4290 > var14) {
                        this.method1712((byte) -71, var14, var13, var9);
                    }
                }
            }
            var13++;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZBZIIII)V")
    public final void method1710(boolean arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field4268++;
        int var8 = 256;
        if (arg2) {
            var8 |= 0x20000;
        }
        int var9 = arg6 - this.field4271;
        int var10 = arg4 - this.field4274;
        if (arg0) {
            var8 |= 0x40000000;
        }
        if (arg1 <= 10) {
            return;
        }
        for (int var11 = var10; var11 < (var10 + arg5); var11++) {
            if (var11 >= 0 && this.field4266 > var11) {
                for (int var12 = var9; var12 < (arg3 + var9); var12++) {
                    if (var12 >= 0 && var12 < this.field4290) {
                        this.method1699(-50, var8, var11, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILnv;IIII)Ljava/awt/Frame;")
    public static final Frame method1711(int arg0, class493 arg1, int arg2, int arg3, int arg4, int arg5) {
        field4289++;
        if (!arg1.method2871(-83)) {
            return null;
        }
        if (arg4 == 0) {
            class502[] var6 = class465.method2766(arg1, -128);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field7332 == arg5 && var6[var8].field7330 == arg3 && (arg0 == 0 || var6[var8].field7333 == arg0) && (!var7 || var6[var8].field7331 > arg4)) {
                    var7 = true;
                    arg4 = var6[var8].field7331;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class169 var9 = arg1.method2881(arg4, arg3, 13056, arg0, arg5);
        while (var9.field2692 == 0) {
            class444.method2667(-28210, 10L);
        }
        Frame var10 = (Frame) var9.field2695;
        if (var10 == null) {
            return null;
        } else if (~var9.field2692 == arg2) {
            class26.method190(var10, arg1, -115);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BIII)V")
    private final void method1712(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = -87 / ((28 - arg0) / 50);
        field4270++;
        this.field4288[arg2][arg1] = class344.method2224(this.field4288[arg2][arg1], ~arg3);
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(III)V")
    public final void method1713(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field4274;
        int var5 = arg2 - this.field4271;
        field4272++;
        this.field4288[var4][var5] = class338.method2141(this.field4288[var4][var5], arg1);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZIIIIZI)V")
    public final void method1714(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg1 - this.field4274;
        int var9 = arg2 - this.field4271;
        field4281++;
        if (arg4 == 0) {
            if (arg6 == 0) {
                this.method1699(-57, 128, var8, var9);
                this.method1699(-46, 8, var8 - 1, var9);
            }
            if (arg6 == 1) {
                this.method1699(-85, 2, var8, var9);
                this.method1699(-61, 32, var8, var9 + 1);
            }
            if (arg6 == 2) {
                this.method1699(-120, 8, var8, var9);
                this.method1699(-94, 128, var8 + 1, var9);
            }
            if (arg6 == 3) {
                this.method1699(-84, 32, var8, var9);
                this.method1699(-88, 2, var8, var9 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg6 == 0) {
                this.method1699(arg3 - 536870991, 1, var8, var9);
                this.method1699(-99, 16, var8 - 1, var9 + 1);
            }
            if (arg6 == 1) {
                this.method1699(-58, 4, var8, var9);
                this.method1699(-113, 64, var8 + 1, var9 + 1);
            }
            if (arg6 == 2) {
                this.method1699(-47, 16, var8, var9);
                this.method1699(-93, 1, var8 + 1, var9 + -1);
            }
            if (arg6 == 3) {
                this.method1699(-91, 64, var8, var9);
                this.method1699(arg3 ^ 0xDFFFFFB4, 4, var8 - 1, var9 + -1);
            }
        }
        if (arg4 == 2) {
            if (arg6 == 0) {
                this.method1699(-47, 130, var8, var9);
                this.method1699(-85, 8, var8 - 1, var9);
                this.method1699(-71, 32, var8, var9 + 1);
            }
            if (arg6 == 1) {
                this.method1699(-113, 10, var8, var9);
                this.method1699(-91, 32, var8, var9 + 1);
                this.method1699(-33, 128, var8 + 1, var9);
            }
            if (arg6 == 2) {
                this.method1699(-59, 40, var8, var9);
                this.method1699(-112, 128, var8 + 1, var9);
                this.method1699(-99, 2, var8, var9 - 1);
            }
            if (arg6 == 3) {
                this.method1699(-68, 160, var8, var9);
                this.method1699(-44, 2, var8, var9 - 1);
                this.method1699(-90, 8, var8 - 1, var9);
            }
        }
        if (arg5) {
            if (arg4 == 0) {
                if (arg6 == 0) {
                    this.method1699(arg3 - 536870963, 65536, var8, var9);
                    this.method1699(-95, 4096, var8 - 1, var9);
                }
                if (arg6 == 1) {
                    this.method1699(-50, 1024, var8, var9);
                    this.method1699(-39, 16384, var8, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method1699(-104, 4096, var8, var9);
                    this.method1699(-119, 65536, var8 + 1, var9);
                }
                if (arg6 == 3) {
                    this.method1699(arg3 ^ 0xDFFFFF88, 16384, var8, var9);
                    this.method1699(-57, 1024, var8, var9 - 1);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg6 == 0) {
                    this.method1699(-102, 512, var8, var9);
                    this.method1699(-89, 8192, var8 - 1, var9 + 1);
                }
                if (arg6 == 1) {
                    this.method1699(-106, 2048, var8, var9);
                    this.method1699(-57, 32768, var8 + 1, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method1699(-97, 8192, var8, var9);
                    this.method1699(-123, 512, var8 + 1, var9 + -1);
                }
                if (arg6 == 3) {
                    this.method1699(arg3 - 536871039, 32768, var8, var9);
                    this.method1699(arg3 ^ 0xDFFFFFBA, 2048, var8 - 1, var9 + -1);
                }
            }
            if (arg4 == 2) {
                if (arg6 == 0) {
                    this.method1699(arg3 - 536871001, 66560, var8, var9);
                    this.method1699(arg3 ^ 0xDFFFFFCF, 4096, var8 - 1, var9);
                    this.method1699(arg3 - 536870975, 16384, var8, var9 + 1);
                }
                if (arg6 == 1) {
                    this.method1699(-48, 5120, var8, var9);
                    this.method1699(arg3 - 536870946, 16384, var8, var9 + 1);
                    this.method1699(arg3 - 536871024, 65536, var8 + 1, var9);
                }
                if (arg6 == 2) {
                    this.method1699(-45, 20480, var8, var9);
                    this.method1699(arg3 ^ 0xDFFFFFBF, 65536, var8 + 1, var9);
                    this.method1699(-41, 1024, var8, var9 - 1);
                }
                if (arg6 == 3) {
                    this.method1699(-105, 81920, var8, var9);
                    this.method1699(-117, 1024, var8, var9 - 1);
                    this.method1699(-45, 4096, var8 - 1, var9);
                }
            }
        }
        if (arg0) {
            if (arg4 == 0) {
                if (arg6 == 0) {
                    this.method1699(-73, 536870912, var8, var9);
                    this.method1699(-68, 33554432, var8 - 1, var9);
                }
                if (arg6 == 1) {
                    this.method1699(-55, 8388608, var8, var9);
                    this.method1699(arg3 - 536871010, 134217728, var8, var9 + 1);
                }
                if (arg6 == 2) {
                    this.method1699(-36, 33554432, var8, var9);
                    this.method1699(-38, 536870912, var8 + 1, var9);
                }
                if (arg6 == 3) {
                    this.method1699(-32, 134217728, var8, var9);
                    this.method1699(arg3 - 536870945, 8388608, var8, var9 - 1);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg6 == 0) {
                    this.method1699(-94, 4194304, var8, var9);
                    this.method1699(-82, 67108864, var8 - 1, var9 + 1);
                }
                if (arg6 == 1) {
                    this.method1699(-56, 16777216, var8, var9);
                    this.method1699(arg3 ^ 0xDFFFFF8F, 268435456, var8 + 1, var9 - -1);
                }
                if (arg6 == 2) {
                    this.method1699(-125, 67108864, var8, var9);
                    this.method1699(arg3 - 536870975, 4194304, var8 + 1, var9 + -1);
                }
                if (arg6 == 3) {
                    this.method1699(-117, 268435456, var8, var9);
                    this.method1699(-104, 16777216, var8 - 1, var9 - 1);
                }
            }
            if (arg4 == 2) {
                if (arg6 == 0) {
                    this.method1699(-68, 545259520, var8, var9);
                    this.method1699(-99, 33554432, var8 - 1, var9);
                    this.method1699(-87, 134217728, var8, var9 + 1);
                }
                if (arg6 == 1) {
                    this.method1699(-123, 41943040, var8, var9);
                    this.method1699(-101, 134217728, var8, var9 + 1);
                    this.method1699(-120, 536870912, var8 + 1, var9);
                }
                if (arg6 == 2) {
                    this.method1699(arg3 - 536871008, 167772160, var8, var9);
                    this.method1699(-73, 536870912, var8 + 1, var9);
                    this.method1699(-76, 8388608, var8, var9 - 1);
                }
                if (arg6 == 3) {
                    this.method1699(-98, 671088640, var8, var9);
                    this.method1699(-85, 8388608, var8, var9 - 1);
                    this.method1699(-44, 33554432, var8 - 1, var9);
                }
            }
        }
        if (arg3 != 536870912) {
            field4295 = 56;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIIIIIII)Z")
    public final boolean method1715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4285++;
        if (arg6 > -79) {
            return false;
        }
        int var11 = arg3 + arg5;
        int var12 = arg0 + arg4;
        int var13 = arg1 + arg7;
        int var14 = arg2 + arg8;
        if (arg3 == var13 && (arg9 & 0x2) == 0) {
            int var15 = arg4 <= arg2 ? arg2 : arg4;
            int var16 = var12 >= var14 ? var14 : var12;
            while (var16 > var15) {
                if ((this.field4288[var13 - this.field4274 - 1][var15 - this.field4271] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg7 == var11 && (arg9 & 0x8) == 0) {
            int var17 = arg4 > arg2 ? arg4 : arg2;
            int var18 = var14 > var12 ? var12 : var14;
            while (var17 < var18) {
                if ((this.field4288[arg7 - this.field4274][var17 - this.field4271] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg4 == var14 && (arg9 & 0x1) == 0) {
            int var19 = arg7 < arg3 ? arg3 : arg7;
            int var20 = var13 > var11 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field4288[var19 - this.field4274][var14 - this.field4271 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg2 == var12 && (arg9 & 0x4) == 0) {
            int var21 = arg3 > arg7 ? arg3 : arg7;
            int var22 = var11 >= var13 ? var13 : var11;
            while (var21 < var22) {
                if ((this.field4288[var21 - this.field4274][arg2 - this.field4271] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
    public static void method1716(int arg0) {
        field4283 = null;
        if (arg0 != -1) {
            method1711(-114, null, 99, -80, -123, 4);
        }
        field4293 = null;
        field4291 = null;
    }
}
