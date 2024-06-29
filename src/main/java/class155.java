import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class155 {

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field1983 = -2;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field1986 = -1;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public int field1981;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public int field1982;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public int field1985;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public int field1987;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "Lqp;")
    public static class586 field1984;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
    public static void method900(byte arg0) {
        if (arg0 != 76) {
            method902(null, false, (byte) -27);
        }
        field1984 = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(JJ)J")
    public static long method901(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lcd;ZB)V")
    public static final void method902(class86 arg0, boolean arg1, byte arg2) {
        field1988++;
        class229 var3 = arg0.method513(0);
        if (arg0.field1091 == 0) {
            arg0.field1096 = 0;
            class486.field7374 = 0;
            class343.field5015 = -1;
            return;
        }
        if (arg0.field1024 != -1 && arg0.field1079 == 0) {
            class224 var4 = class470.field7205.method3498(false, arg0.field1024);
            if (arg0.field1097 > 0 && var4.field3299 == 0) {
                arg0.field1096++;
                class486.field7374 = 0;
                class343.field5015 = -1;
                return;
            }
            if (arg0.field1097 <= 0 && var4.field3304 == 0) {
                arg0.field1096++;
                class343.field5015 = -1;
                class486.field7374 = 0;
                return;
            }
        }
        if (arg0.field1082 != -1 && class576.field8505 >= arg0.field1036) {
            class465 var5 = class138.field1821.method2251(arg0.field1082, false);
            if (var5.field6723 && var5.field6708 != -1) {
                class224 var6 = class470.field7205.method3498(false, var5.field6708);
                if (arg0.field1097 > 0 && var6.field3299 == 0) {
                    arg0.field1096++;
                    class343.field5015 = -1;
                    class486.field7374 = 0;
                    return;
                }
                if (arg0.field1097 <= 0 && var6.field3304 == 0) {
                    class486.field7374 = 0;
                    class343.field5015 = -1;
                    arg0.field1096++;
                    return;
                }
            }
        }
        if (arg0.field1082 != -1 && arg0.field1036 <= class576.field8505) {
            class465 var7 = class138.field1821.method2251(arg0.field1082, false);
            if (var7.field6723 && var7.field6708 != -1) {
                class224 var8 = class470.field7205.method3498(false, var7.field6708);
                if (arg0.field1097 > 0 && var8.field3299 == 0) {
                    class486.field7374 = 0;
                    arg0.field1096++;
                    class343.field5015 = -1;
                    return;
                }
                if (arg0.field1097 <= 0 && var8.field3304 == 0) {
                    class343.field5015 = -1;
                    arg0.field1096++;
                    class486.field7374 = 0;
                    return;
                }
            }
        }
        int var9 = arg0.field3464;
        int var10 = arg0.field3463;
        int var11 = arg0.field1090[arg0.field1091 - 1] * 128 + arg0.method514(arg2 + 1) * 64;
        int var12 = arg0.field1089[arg0.field1091 - 1] * 128 + (arg0.method514(arg2 + 1) * 64);
        if (var9 < var11) {
            if (var10 < var12) {
                arg0.method499(arg2 ^ 0xDF0, 10240);
            } else if (var12 < var10) {
                arg0.method499(-3569, 14336);
            } else {
                arg0.method499(-3569, 12288);
            }
        } else if (var11 >= var9) {
            if (var10 < var12) {
                arg0.method499(-3569, 8192);
            } else if (var10 > var12) {
                arg0.method499(-3569, 0);
            }
        } else if (var10 < var12) {
            arg0.method499(-3569, 6144);
        } else if (var10 > var12) {
            arg0.method499(-3569, 2048);
        } else {
            arg0.method499(-3569, 4096);
        }
        byte var13 = arg0.field1093[arg0.field1091 - 1];
        if (!arg1 && (var11 - var9) > 256 || var11 - var9 < -256 || var12 - var10 > 256 || var12 - var10 < -256) {
            arg0.field3463 = var12;
            arg0.field3464 = var11;
            arg0.method502(arg0.field1046, false, false);
            arg0.field1091--;
            class486.field7374 = 0;
            if (arg0.field1097 > 0) {
                arg0.field1097--;
            }
            class343.field5015 = -1;
            return;
        }
        int var14 = 4;
        boolean var15 = true;
        if (arg0 instanceof class383) {
            var15 = ((class383) arg0).field5601.field6291;
        }
        if (var15) {
            int var16 = arg0.field1046 - arg0.field1067.field3126;
            if (var16 != 0 && arg0.field1037 == -1 && arg0.field1059 != 0) {
                var14 = 2;
            }
            if (!arg1 && arg0.field1091 > 2) {
                var14 = 6;
            }
            if (!arg1 && arg0.field1091 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg1 && arg0.field1091 > 1) {
                var14 = 6;
            }
            if (!arg1 && arg0.field1091 > 2) {
                var14 = 8;
            }
        }
        if (arg0.field1096 > 0 && arg0.field1091 > 1) {
            var14 = 8;
            arg0.field1096--;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field3366 != -1) {
            int var17 = var14 << 7;
            if (arg0.field1091 == 1) {
                int var18 = arg0.field1094 * arg0.field1094;
                int var19 = (var11 < arg0.field3464 ? arg0.field3464 - var11 : -arg0.field3464 + var11) << 7;
                int var20 = (var12 < arg0.field3463 ? arg0.field3463 - var12 : var12 - arg0.field3463) << 7;
                int var21 = var20 >= var19 ? var20 : var19;
                int var22 = var3.field3366 * 2 * var21;
                if (var18 > var22) {
                    arg0.field1094 /= 2;
                } else if ((var18 / 2) > var21) {
                    arg0.field1094 -= var3.field3366;
                    if (arg0.field1094 < 0) {
                        arg0.field1094 = 0;
                    }
                } else if (var17 > arg0.field1094) {
                    arg0.field1094 += var3.field3366;
                    if (arg0.field1094 > var17) {
                        arg0.field1094 = var17;
                    }
                }
            } else if (var17 > arg0.field1094) {
                arg0.field1094 += var3.field3366;
                if (var17 < arg0.field1094) {
                    arg0.field1094 = var17;
                }
            } else if (arg0.field1094 > 0) {
                arg0.field1094 -= var3.field3366;
                if (arg0.field1094 < 0) {
                    arg0.field1094 = 0;
                }
            }
            var14 = arg0.field1094 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class486.field7374 = 0;
        if (var9 == var11 && var10 == var12) {
            class343.field5015 = -1;
        } else {
            if (var11 > var9) {
                arg0.field3464 += var14;
                class486.field7374 |= 0x4;
                if (arg0.field3464 > var11) {
                    arg0.field3464 = var11;
                }
            } else if (var11 < var9) {
                arg0.field3464 -= var14;
                class486.field7374 |= 0x8;
                if (arg0.field3464 < var11) {
                    arg0.field3464 = var11;
                }
            }
            if (var14 >= 8) {
                class343.field5015 = 2;
            } else {
                class343.field5015 = var13;
            }
            if (var10 < var12) {
                class486.field7374 |= 0x1;
                arg0.field3463 += var14;
                if (arg0.field3463 > var12) {
                    arg0.field3463 = var12;
                }
            } else if (var10 > var12) {
                arg0.field3463 -= var14;
                class486.field7374 |= 0x2;
                if (arg0.field3463 < var12) {
                    arg0.field3463 = var12;
                }
            }
        }
        if (arg0.field3464 == var11 && arg0.field3463 == var12) {
            if (arg0.field1097 > 0) {
                arg0.field1097--;
            }
            arg0.field1091--;
        }
        if (arg2 != -1) {
            method900((byte) 56);
        }
    }

    static {
        new class487("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field1990 = 0;
        field1989 = 0;
    }
}
