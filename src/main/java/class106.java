import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class106 {

    @OriginalMember(owner = "client!as", name = "m", descriptor = "Lho;")
    public static class103 field1430 = new class103(42, -1);

    @OriginalMember(owner = "client!as", name = "z", descriptor = "Lkh;")
    public static class13 field1443 = new class13(5000);

    @OriginalMember(owner = "client!as", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field1445 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!as", name = "D", descriptor = "Ljc;")
    public static class305 field1446 = new class305("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!as", name = "E", descriptor = "I")
    public static int field1447 = 0;

    @OriginalMember(owner = "client!as", name = "G", descriptor = "I")
    public static int field1448 = 1;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "I")
    public int field1435;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!as", name = "A", descriptor = "I")
    public int field1444;

    @OriginalMember(owner = "client!as", name = "H", descriptor = "Lcm;")
    public static class514 field1449;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "[[I")
    public int[][] field1421;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BII)V", line = 7)
    public final void method641(byte arg0, int arg1, int arg2) {
        field1429++;
        int var4 = arg2 - this.field1440;
        if (arg0 != -87) {
            this.method659(125, 112, -24);
        }
        int var5 = arg1 - this.field1444;
        this.field1421[var5][var4] = class95.method534(this.field1421[var5][var4], -2097153);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZII)V", line = 20)
    public final void method642(boolean arg0, int arg1, int arg2) {
        field1432++;
        if (arg0) {
            this.field1440 = -32;
        }
        int var4 = arg1 - this.field1440;
        int var5 = arg2 - this.field1444;
        this.field1421[var5][var4] = class219.method1381(this.field1421[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(III)Z", line = 38)
    public static final boolean method643(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field1430 = null;
        }
        field1442++;
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIIIII)Z", line = 53)
    public final boolean method644(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1436++;
        if (arg3 > 1) {
            return class415.method2541(arg4, arg7, arg3, arg0, arg6, arg3, arg2, true, arg1) ? true : this.method645(arg4, arg7, arg1, arg3, arg6, (byte) -114, arg3, arg5, arg2, arg0);
        }
        int var10 = arg2 + arg0 - 1;
        if (arg8 != 0) {
            return true;
        }
        int var11 = arg1 + arg6 - 1;
        if (arg7 >= arg2 && arg7 <= var10 && arg4 >= arg1 && arg4 <= var11) {
            return true;
        } else if (arg2 - 1 == arg7 && arg1 <= arg4 && arg4 <= var11 && (this.field1421[arg7 - this.field1444][arg4 - this.field1440] & 0x8) == 0 && (arg5 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg7 && arg4 >= arg1 && var11 >= arg4 && (this.field1421[arg7 - this.field1444][arg4 - this.field1440] & 0x80) == 0 && (arg5 & 0x2) == 0) {
            return true;
        } else if ((arg1 - 1) == arg4 && arg2 <= arg7 && arg7 <= var10 && (this.field1421[arg7 - this.field1444][arg4 - this.field1440] & 0x2) == 0 && (arg5 & 0x4) == 0) {
            return true;
        } else {
            return (var11 + 1) == arg4 && arg2 <= arg7 && var10 >= arg7 && (this.field1421[arg7 - this.field1444][arg4 - this.field1440] & 0x20) == 0 && (arg5 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIBIIII)Z", line = 99)
    public final boolean method645(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field1434++;
        int var11 = arg1 + arg6;
        if (arg5 > -24) {
            return false;
        }
        int var12 = arg0 + arg3;
        int var13 = arg8 + arg9;
        int var14 = arg2 + arg4;
        if (arg1 == var13 && (arg7 & 0x2) == 0) {
            int var15 = arg0 <= arg2 ? arg2 : arg0;
            int var16 = var12 < var14 ? var12 : var14;
            while (var16 > var15) {
                if ((this.field1421[var13 - this.field1444 - 1][var15 - this.field1440] & 0x8) == 0) {
                    return true;
                }
                var15++;
            }
        } else if (arg8 == var11 && (arg7 & 0x8) == 0) {
            int var17 = arg2 < arg0 ? arg0 : arg2;
            int var18 = var12 >= var14 ? var14 : var12;
            while (var18 > var17) {
                if ((this.field1421[arg8 - this.field1444][var17 - this.field1440] & 0x80) == 0) {
                    return true;
                }
                var17++;
            }
        } else if (arg0 == var14 && (arg7 & 0x1) == 0) {
            int var19 = arg8 < arg1 ? arg1 : arg8;
            int var20 = var13 > var11 ? var11 : var13;
            while (var20 > var19) {
                if ((this.field1421[var19 - this.field1444][var14 - this.field1440 - 1] & 0x2) == 0) {
                    return true;
                }
                var19++;
            }
        } else if (arg2 == var12 && (arg7 & 0x4) == 0) {
            int var21 = arg1 <= arg8 ? arg8 : arg1;
            int var22 = var13 > var11 ? var11 : var13;
            while (var21 < var22) {
                if ((this.field1421[var21 - this.field1444][arg2 - this.field1440] & 0x20) == 0) {
                    return true;
                }
                var21++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIZIIZ)V", line = 190)
    public final void method646(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6) {
        field1422++;
        int var8 = arg0 - this.field1444;
        int var9 = arg2 - this.field1440;
        if (arg4 == 0) {
            if (arg5 == 0) {
                this.method654(var8, 2883872, 128, var9);
                this.method654(var8 - 1, 2883872, 8, var9);
            }
            if (arg5 == 1) {
                this.method654(var8, arg1 + 2903492, 2, var9);
                this.method654(var8, 2883872, 32, var9 + 1);
            }
            if (arg5 == 2) {
                this.method654(var8, 2883872, 8, var9);
                this.method654(var8 + 1, arg1 ^ 0xFFD3B27C, 128, var9);
            }
            if (arg5 == 3) {
                this.method654(var8, 2883872, 32, var9);
                this.method654(var8, 2883872, 2, var9 - 1);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg5 == 0) {
                this.method654(var8, 2883872, 1, var9);
                this.method654(var8 - 1, 2883872, 16, var9 + 1);
            }
            if (arg5 == 1) {
                this.method654(var8, 2883872, 4, var9);
                this.method654(var8 + 1, arg1 + 2903492, 64, var9 + 1);
            }
            if (arg5 == 2) {
                this.method654(var8, arg1 + 2903492, 16, var9);
                this.method654(var8 + 1, 2883872, 1, var9 - 1);
            }
            if (arg5 == 3) {
                this.method654(var8, 2883872, 64, var9);
                this.method654(var8 - 1, 2883872, 4, var9 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                this.method654(var8, 2883872, 130, var9);
                this.method654(var8 - 1, 2883872, 8, var9);
                this.method654(var8, 2883872, 32, var9 + 1);
            }
            if (arg5 == 1) {
                this.method654(var8, arg1 ^ 0xFFD3B27C, 10, var9);
                this.method654(var8, 2883872, 32, var9 + 1);
                this.method654(var8 + 1, 2883872, 128, var9);
            }
            if (arg5 == 2) {
                this.method654(var8, 2883872, 40, var9);
                this.method654(var8 + 1, 2883872, 128, var9);
                this.method654(var8, 2883872, 2, var9 - 1);
            }
            if (arg5 == 3) {
                this.method654(var8, 2883872, 160, var9);
                this.method654(var8, arg1 ^ 0xFFD3B27C, 2, var9 - 1);
                this.method654(var8 - 1, 2883872, 8, var9);
            }
        }
        if (arg3) {
            if (arg4 == 0) {
                if (arg5 == 0) {
                    this.method654(var8, 2883872, 65536, var9);
                    this.method654(var8 - 1, 2883872, 4096, var9);
                }
                if (arg5 == 1) {
                    this.method654(var8, arg1 + 2903492, 1024, var9);
                    this.method654(var8, 2883872, 16384, var9 + 1);
                }
                if (arg5 == 2) {
                    this.method654(var8, 2883872, 4096, var9);
                    this.method654(var8 + 1, 2883872, 65536, var9);
                }
                if (arg5 == 3) {
                    this.method654(var8, arg1 + 2903492, 16384, var9);
                    this.method654(var8, 2883872, 1024, var9 - 1);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg5 == 0) {
                    this.method654(var8, 2883872, 512, var9);
                    this.method654(var8 - 1, 2883872, 8192, var9 + 1);
                }
                if (arg5 == 1) {
                    this.method654(var8, 2883872, 2048, var9);
                    this.method654(var8 + 1, 2883872, 32768, var9 + 1);
                }
                if (arg5 == 2) {
                    this.method654(var8, 2883872, 8192, var9);
                    this.method654(var8 + 1, arg1 ^ 0xFFD3B27C, 512, var9 - 1);
                }
                if (arg5 == 3) {
                    this.method654(var8, arg1 + 2903492, 32768, var9);
                    this.method654(var8 - 1, 2883872, 2048, var9 - 1);
                }
            }
            if (arg4 == 2) {
                if (arg5 == 0) {
                    this.method654(var8, 2883872, 66560, var9);
                    this.method654(var8 - 1, 2883872, 4096, var9);
                    this.method654(var8, 2883872, 16384, var9 + 1);
                }
                if (arg5 == 1) {
                    this.method654(var8, 2883872, 5120, var9);
                    this.method654(var8, arg1 + 2903492, 16384, var9 + 1);
                    this.method654(var8 + 1, 2883872, 65536, var9);
                }
                if (arg5 == 2) {
                    this.method654(var8, 2883872, 20480, var9);
                    this.method654(var8 + 1, 2883872, 65536, var9);
                    this.method654(var8, arg1 + 2903492, 1024, var9 - 1);
                }
                if (arg5 == 3) {
                    this.method654(var8, 2883872, 81920, var9);
                    this.method654(var8, 2883872, 1024, var9 - 1);
                    this.method654(var8 - 1, arg1 ^ 0xFFD3B27C, 4096, var9);
                }
            }
        }
        if (arg6) {
            if (arg4 == 0) {
                if (arg5 == 0) {
                    this.method654(var8, 2883872, 536870912, var9);
                    this.method654(var8 - 1, arg1 + 2903492, 33554432, var9);
                }
                if (arg5 == 1) {
                    this.method654(var8, arg1 + 2903492, 8388608, var9);
                    this.method654(var8, 2883872, 134217728, var9 + 1);
                }
                if (arg5 == 2) {
                    this.method654(var8, arg1 ^ 0xFFD3B27C, 33554432, var9);
                    this.method654(var8 + 1, arg1 + 2903492, 536870912, var9);
                }
                if (arg5 == 3) {
                    this.method654(var8, 2883872, 134217728, var9);
                    this.method654(var8, 2883872, 8388608, var9 - 1);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg5 == 0) {
                    this.method654(var8, arg1 ^ 0xFFD3B27C, 4194304, var9);
                    this.method654(var8 - 1, 2883872, 67108864, var9 + 1);
                }
                if (arg5 == 1) {
                    this.method654(var8, 2883872, 16777216, var9);
                    this.method654(var8 + 1, arg1 ^ 0xFFD3B27C, 268435456, var9 + 1);
                }
                if (arg5 == 2) {
                    this.method654(var8, 2883872, 67108864, var9);
                    this.method654(var8 + 1, 2883872, 4194304, var9 - 1);
                }
                if (arg5 == 3) {
                    this.method654(var8, 2883872, 268435456, var9);
                    this.method654(var8 - 1, 2883872, 16777216, var9 - 1);
                }
            }
            if (arg4 == 2) {
                if (arg5 == 0) {
                    this.method654(var8, 2883872, 545259520, var9);
                    this.method654(var8 - 1, arg1 ^ 0xFFD3B27C, 33554432, var9);
                    this.method654(var8, 2883872, 134217728, var9 + 1);
                }
                if (arg5 == 1) {
                    this.method654(var8, 2883872, 41943040, var9);
                    this.method654(var8, arg1 ^ 0xFFD3B27C, 134217728, var9 + 1);
                    this.method654(var8 + 1, arg1 ^ 0xFFD3B27C, 536870912, var9);
                }
                if (arg5 == 2) {
                    this.method654(var8, 2883872, 167772160, var9);
                    this.method654(var8 + 1, 2883872, 536870912, var9);
                    this.method654(var8, 2883872, 8388608, var9 - 1);
                }
                if (arg5 == 3) {
                    this.method654(var8, 2883872, 671088640, var9);
                    this.method654(var8, 2883872, 8388608, var9 - 1);
                    this.method654(var8 - 1, 2883872, 33554432, var9);
                }
            }
        }
        if (arg1 != -19620) {
            field1449 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(III)V", line = 495)
    public final void method647(int arg0, int arg1, int arg2) {
        if (arg0 != -14227) {
            this.method655(false, true, 29, -24, 15, -112, 49);
        }
        int var4 = arg2 - this.field1444;
        int var5 = arg1 - this.field1440;
        field1428++;
        this.field1421[var4][var5] = class219.method1381(this.field1421[var4][var5], 262144);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIB)V", line = 508)
    public static final void method648(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field1439++;
        int var6 = class406.method2491(class169.field2184, false, class386.field5620, arg2);
        int var7 = class406.method2491(class169.field2184, false, class386.field5620, arg1);
        int var8 = class406.method2491(class307.field4111, false, class91.field1086, arg4);
        int var9 = -66 / ((23 - arg5) / 57);
        int var10 = class406.method2491(class307.field4111, false, class91.field1086, arg0);
        for (int var11 = var6; var11 <= var7; var11++) {
            class476.method2907(var10, 118, arg3, class5.field54[var11], var8);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZB)Z", line = 536)
    public static final boolean method649(boolean arg0, byte arg1) {
        field1431++;
        boolean var2 = class343.field4596.method1142();
        if (arg1 > -109) {
            return false;
        } else if (arg0 == var2) {
            return true;
        } else {
            if (!arg0) {
                class343.field4596.method1147();
            } else if (!class343.field4596.method1193()) {
                arg0 = false;
            }
            if (var2 == arg0) {
                return false;
            } else {
                class319.field4256.field4685 = arg0;
                class319.field4256.method1743(class381.field5518, (byte) -99);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIIII)Z", line = 572)
    public final boolean method650(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1433++;
        if (arg2 != -10856) {
            field1448 = 38;
        }
        if (arg0 == 1) {
            if (arg3 == arg7 && arg5 == arg6) {
                return true;
            }
        } else if (arg3 >= arg7 && (arg0 + arg7 - 1) >= arg3 && arg6 >= arg6 && arg0 + arg6 - 1 >= arg6) {
            return true;
        }
        int var9 = arg6 - this.field1440;
        int var10 = arg7 - this.field1444;
        int var11 = arg5 - this.field1440;
        int var12 = arg3 - this.field1444;
        if (arg0 == 1) {
            if (arg4 == 0) {
                if (arg1 == 0) {
                    if ((var12 - 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field1421[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field1421[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field1421[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11 && (this.field1421[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 + 1 == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field1421[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field1421[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                    if (var12 - 1 == var10 && var9 == var11 && (this.field1421[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11 && (this.field1421[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg1 == 0) {
                    if ((var12 - 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field1421[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field1421[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field1421[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field1421[var10][var11] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 - 1 == var10 && var9 == var11 && (this.field1421[var10][var11] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field1421[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var12 - 1) == var10 && var9 == var11) {
                        return true;
                    }
                    if (var10 == var12 && var9 + 1 == var11 && (this.field1421[var10][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var9 == var11 && (this.field1421[var10][var11] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var10 == var12 && (var9 + 1) == var11 && (this.field1421[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var9 - 1 == var11 && (this.field1421[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var10 && var9 == var11 && (this.field1421[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 == var11 && (this.field1421[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var10 - 1;
            int var14 = var11 + arg0 - 1;
            if (arg4 == 0) {
                if (arg1 == 0) {
                    if ((var12 - arg0) == var10 && var9 >= var11 && var14 >= var9) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var9 + 1) == var11 && (this.field1421[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var9 - arg0 == var11 && (this.field1421[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var12 >= var10 && var13 >= var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if ((var12 - arg0) == var10 && var11 <= var9 && var9 <= var14 && (this.field1421[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var11 <= var9 && var14 >= var9 && (this.field1421[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 + 1 == var10 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && (var9 + 1) == var11 && (this.field1421[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var9 - arg0) == var11 && (this.field1421[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 <= var12 && var13 >= var12 && var9 - arg0 == var11) {
                        return true;
                    }
                    if ((var12 - arg0) == var10 && var11 <= var9 && var14 >= var9 && (this.field1421[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var11 <= var9 && var14 >= var9 && (this.field1421[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg4 == 2) {
                if (arg1 == 0) {
                    if ((var12 - arg0) == var10 && var11 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && (var9 + 1) == var11) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var11 <= var9 && var9 <= var14 && (this.field1421[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var9 - arg0) == var11 && (this.field1421[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var12 - arg0) == var10 && var11 <= var9 && var14 >= var9 && (this.field1421[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && var9 + 1 == var11) {
                        return true;
                    }
                    if (var12 + 1 == var10 && var11 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && (var9 - arg0) == var11 && (this.field1421[var12][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var12 - arg0 == var10 && var9 >= var11 && var9 <= var14 && (this.field1421[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && var9 + 1 == var11 && (this.field1421[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 >= var11 && var9 <= var14) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && (var9 - arg0) == var11) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var12 - arg0) == var10 && var9 >= var11 && var9 <= var14) {
                        return true;
                    }
                    if (var12 >= var10 && var13 >= var12 && (var9 + 1) == var11 && (this.field1421[var12][var11] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var12 + 1) == var10 && var9 >= var11 && var9 <= var14 && (this.field1421[var10][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && var9 - arg0 == var11) {
                        return true;
                    }
                }
            }
            if (arg4 == 9) {
                if (var10 <= var12 && var13 >= var12 && var9 + 1 == var11 && (this.field1421[var12][var11] & 0x2C0120) == 0) {
                    return true;
                }
                if (var12 >= var10 && var13 >= var12 && var9 - arg0 == var11 && (this.field1421[var12][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if ((var12 - arg0) == var10 && var11 <= var9 && var9 <= var14 && (this.field1421[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if (var12 + 1 == var10 && var11 <= var9 && var14 >= var9 && (this.field1421[var10][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(IIIIIIII)Z", line = 945)
    public final boolean method651(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1423++;
        if (arg2 == 1) {
            if (arg3 == arg7 && arg1 == arg4) {
                return true;
            }
        } else if (arg7 <= arg3 && arg3 <= (arg2 + arg7 - 1) && arg4 <= arg4 && arg4 <= arg4 + arg2 - 1) {
            return true;
        }
        int var9 = arg7 - this.field1444;
        int var10 = arg3 - this.field1444;
        int var11 = arg1 - this.field1440;
        int var12 = arg4 - this.field1440;
        if (arg6 != 25507) {
            this.field1444 = -80;
        }
        if (arg2 == 1) {
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if (var10 + 1 == var9 && var11 == var12 && (this.field1421[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 - 1) == var11 && (this.field1421[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if (var10 - 1 == var9 && var11 == var12 && (this.field1421[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 - 1 == var11 && (this.field1421[var9][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if ((var10 - 1) == var9 && var11 == var12 && (this.field1421[var9][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var10 && (var12 + 1) == var11 && (this.field1421[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if (var10 + 1 == var9 && var11 == var12 && (this.field1421[var9][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var10 && var12 + 1 == var11 && (this.field1421[var9][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var9 == var10 && (var12 + 1) == var11 && (this.field1421[var9][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var10 && var12 - 1 == var11 && (this.field1421[var9][var11] & 0x2) == 0) {
                    return true;
                }
                if (var10 - 1 == var9 && var11 == var12 && (this.field1421[var9][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var11 == var12 && (this.field1421[var9][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg2 + var9 - 1;
            int var14 = arg2 + var11 - 1;
            if (arg0 == 6 || arg0 == 7) {
                if (arg0 == 7) {
                    arg5 = arg5 + 2 & 0x3;
                }
                if (arg5 == 0) {
                    if (var10 + 1 == var9 && var12 >= var11 && var12 <= var14 && (this.field1421[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var10 <= var13 && (var12 - arg2) == var11 && (this.field1421[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 1) {
                    if ((var10 - arg2) == var9 && var11 <= var12 && var12 <= var14 && (this.field1421[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && (var12 - arg2) == var11 && (this.field1421[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg5 == 2) {
                    if (var10 - arg2 == var9 && var11 <= var12 && var14 >= var12 && (this.field1421[var13][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 <= var10 && var13 >= var10 && var12 + 1 == var11 && (this.field1421[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg5 == 3) {
                    if ((var10 + 1) == var9 && var12 >= var11 && var14 >= var12 && (this.field1421[var9][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var9 && var10 <= var13 && var12 + 1 == var11 && (this.field1421[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg0 == 8) {
                if (var9 <= var10 && var10 <= var13 && var12 + 1 == var11 && (this.field1421[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var9 <= var10 && var10 <= var13 && (var12 - arg2) == var11 && (this.field1421[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if (var10 - arg2 == var9 && var11 <= var12 && var12 <= var14 && (this.field1421[var13][var12] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var12 >= var11 && var14 >= var12 && (this.field1421[var9][var12] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)Lsd;", line = 1135)
    public static final class63 method652(int arg0, byte arg1) {
        if (arg1 > -4) {
            field1448 = -9;
        }
        field1426++;
        class63[] var2 = class12.method70((byte) 89);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field734 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V", line = 1161)
    public static void method653(int arg0) {
        field1446 = null;
        field1430 = null;
        if (arg0 != -13828) {
            method653(115);
        }
        field1445 = null;
        field1449 = null;
        field1443 = null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIII)V", line = 1178)
    private final void method654(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 2883872) {
            field1418++;
            this.field1421[arg0][arg3] = class219.method1381(this.field1421[arg0][arg3], arg2);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZZIIIII)V", line = 1190)
    public final void method655(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1437++;
        int var8 = arg4 - this.field1444;
        if (arg2 != -26230) {
            return;
        }
        int var9 = arg3 - this.field1440;
        if (arg5 == 0) {
            if (arg6 == 0) {
                this.method657(var8, (byte) 3, var9, 128);
                this.method657(var8 - 1, (byte) 3, var9, 8);
            }
            if (arg6 == 1) {
                this.method657(var8, (byte) 3, var9, 2);
                this.method657(var8, (byte) 3, var9 + 1, 32);
            }
            if (arg6 == 2) {
                this.method657(var8, (byte) 3, var9, 8);
                this.method657(var8 + 1, (byte) 3, var9, 128);
            }
            if (arg6 == 3) {
                this.method657(var8, (byte) 3, var9, 32);
                this.method657(var8, (byte) 3, var9 - 1, 2);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg6 == 0) {
                this.method657(var8, (byte) 3, var9, 1);
                this.method657(var8 - 1, (byte) 3, var9 + 1, 16);
            }
            if (arg6 == 1) {
                this.method657(var8, (byte) 3, var9, 4);
                this.method657(var8 + 1, (byte) 3, var9 + 1, 64);
            }
            if (arg6 == 2) {
                this.method657(var8, (byte) 3, var9, 16);
                this.method657(var8 + 1, (byte) 3, var9 - 1, 1);
            }
            if (arg6 == 3) {
                this.method657(var8, (byte) 3, var9, 64);
                this.method657(var8 - 1, (byte) 3, var9 - 1, 4);
            }
        }
        if (arg5 == 2) {
            if (arg6 == 0) {
                this.method657(var8, (byte) 3, var9, 130);
                this.method657(var8 - 1, (byte) 3, var9, 8);
                this.method657(var8, (byte) 3, var9 + 1, 32);
            }
            if (arg6 == 1) {
                this.method657(var8, (byte) 3, var9, 10);
                this.method657(var8, (byte) 3, var9 + 1, 32);
                this.method657(var8 + 1, (byte) 3, var9, 128);
            }
            if (arg6 == 2) {
                this.method657(var8, (byte) 3, var9, 40);
                this.method657(var8 + 1, (byte) 3, var9, 128);
                this.method657(var8, (byte) 3, var9 - 1, 2);
            }
            if (arg6 == 3) {
                this.method657(var8, (byte) 3, var9, 160);
                this.method657(var8, (byte) 3, var9 - 1, 2);
                this.method657(var8 - 1, (byte) 3, var9, 8);
            }
        }
        if (arg1) {
            if (arg5 == 0) {
                if (arg6 == 0) {
                    this.method657(var8, (byte) 3, var9, 65536);
                    this.method657(var8 - 1, (byte) 3, var9, 4096);
                }
                if (arg6 == 1) {
                    this.method657(var8, (byte) 3, var9, 1024);
                    this.method657(var8, (byte) 3, var9 + 1, 16384);
                }
                if (arg6 == 2) {
                    this.method657(var8, (byte) 3, var9, 4096);
                    this.method657(var8 + 1, (byte) 3, var9, 65536);
                }
                if (arg6 == 3) {
                    this.method657(var8, (byte) 3, var9, 16384);
                    this.method657(var8, (byte) 3, var9 - 1, 1024);
                }
            }
            if (arg5 == 1 || arg5 == 3) {
                if (arg6 == 0) {
                    this.method657(var8, (byte) 3, var9, 512);
                    this.method657(var8 - 1, (byte) 3, var9 + 1, 8192);
                }
                if (arg6 == 1) {
                    this.method657(var8, (byte) 3, var9, 2048);
                    this.method657(var8 + 1, (byte) 3, var9 + 1, 32768);
                }
                if (arg6 == 2) {
                    this.method657(var8, (byte) 3, var9, 8192);
                    this.method657(var8 + 1, (byte) 3, var9 - 1, 512);
                }
                if (arg6 == 3) {
                    this.method657(var8, (byte) 3, var9, 32768);
                    this.method657(var8 - 1, (byte) 3, var9 - 1, 2048);
                }
            }
            if (arg5 == 2) {
                if (arg6 == 0) {
                    this.method657(var8, (byte) 3, var9, 66560);
                    this.method657(var8 - 1, (byte) 3, var9, 4096);
                    this.method657(var8, (byte) 3, var9 + 1, 16384);
                }
                if (arg6 == 1) {
                    this.method657(var8, (byte) 3, var9, 5120);
                    this.method657(var8, (byte) 3, var9 + 1, 16384);
                    this.method657(var8 + 1, (byte) 3, var9, 65536);
                }
                if (arg6 == 2) {
                    this.method657(var8, (byte) 3, var9, 20480);
                    this.method657(var8 + 1, (byte) 3, var9, 65536);
                    this.method657(var8, (byte) 3, var9 - 1, 1024);
                }
                if (arg6 == 3) {
                    this.method657(var8, (byte) 3, var9, 81920);
                    this.method657(var8, (byte) 3, var9 - 1, 1024);
                    this.method657(var8 - 1, (byte) 3, var9, 4096);
                }
            }
        }
        if (!arg0) {
            return;
        }
        if (arg5 == 0) {
            if (arg6 == 0) {
                this.method657(var8, (byte) 3, var9, 536870912);
                this.method657(var8 - 1, (byte) 3, var9, 33554432);
            }
            if (arg6 == 1) {
                this.method657(var8, (byte) 3, var9, 8388608);
                this.method657(var8, (byte) 3, var9 + 1, 134217728);
            }
            if (arg6 == 2) {
                this.method657(var8, (byte) 3, var9, 33554432);
                this.method657(var8 + 1, (byte) 3, var9, 536870912);
            }
            if (arg6 == 3) {
                this.method657(var8, (byte) 3, var9, 134217728);
                this.method657(var8, (byte) 3, var9 - 1, 8388608);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg6 == 0) {
                this.method657(var8, (byte) 3, var9, 4194304);
                this.method657(var8 - 1, (byte) 3, var9 + 1, 67108864);
            }
            if (arg6 == 1) {
                this.method657(var8, (byte) 3, var9, 16777216);
                this.method657(var8 + 1, (byte) 3, var9 + 1, 268435456);
            }
            if (arg6 == 2) {
                this.method657(var8, (byte) 3, var9, 67108864);
                this.method657(var8 + 1, (byte) 3, var9 - 1, 4194304);
            }
            if (arg6 == 3) {
                this.method657(var8, (byte) 3, var9, 268435456);
                this.method657(var8 - 1, (byte) 3, var9 - 1, 16777216);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method657(var8, (byte) 3, var9, 545259520);
            this.method657(var8 - 1, (byte) 3, var9, 33554432);
            this.method657(var8, (byte) 3, var9 + 1, 134217728);
        }
        if (arg6 == 1) {
            this.method657(var8, (byte) 3, var9, 41943040);
            this.method657(var8, (byte) 3, var9 + 1, 134217728);
            this.method657(var8 + 1, (byte) 3, var9, 536870912);
        }
        if (arg6 == 2) {
            this.method657(var8, (byte) 3, var9, 167772160);
            this.method657(var8 + 1, (byte) 3, var9, 536870912);
            this.method657(var8, (byte) 3, var9 - 1, 8388608);
        }
        if (arg6 == 3) {
            this.method657(var8, (byte) 3, var9, 671088640);
            this.method657(var8, (byte) 3, var9 - 1, 8388608);
            this.method657(var8 - 1, (byte) 3, var9, 33554432);
            return;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIZIIIZ)V", line = 1503)
    public final void method656(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field1441++;
        int var8 = 256;
        if (arg6) {
            var8 |= 0x20000;
        }
        int var9 = arg5 - this.field1440;
        int var10 = arg4 - this.field1444;
        if (arg2) {
            var8 |= 0x40000000;
        }
        if (arg0 < 37) {
            this.method657(23, (byte) 93, 73, 18);
        }
        for (int var11 = var10; var11 < (var10 + arg3); var11++) {
            if (var11 >= 0 && this.field1420 > var11) {
                for (int var12 = var9; var12 < arg1 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field1435) {
                        this.method654(var11, 2883872, var8, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IBII)V", line = 1550)
    private final void method657(int arg0, byte arg1, int arg2, int arg3) {
        field1425++;
        this.field1421[arg0][arg2] = class95.method534(this.field1421[arg0][arg2], ~arg3);
        if (arg1 != 3) {
            this.field1435 = 92;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIILur;I)Lal;", line = 1563)
    public static final class67 method658(int arg0, int arg1, int arg2, int arg3, class377 arg4, int arg5) {
        field1419++;
        if (arg5 != 1) {
            return null;
        } else if (!arg4.field5397 && (!class119.method713(arg0, 83) || !class119.method713(arg1, 66))) {
            return arg4.field5374 ? new class67(arg4, 34037, arg3, arg2, arg0, arg1, true) : new class67(arg4, arg3, arg2, arg0, arg1, class111.method682(69, arg0), class111.method682(-127, arg1), true);
        } else {
            return new class67(arg4, 3553, arg3, arg2, arg0, arg1, true);
        }
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(III)V", line = 1582)
    public final void method659(int arg0, int arg1, int arg2) {
        field1424++;
        int var4 = arg2 - this.field1440;
        int var5 = arg1 - this.field1444;
        this.field1421[var5][var4] = class95.method534(this.field1421[var5][var4], -262145);
        if (arg0 >= -94) {
            field1449 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIZIIZII)V", line = 1598)
    public final void method660(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field1427++;
        int var9 = 256;
        if (arg2) {
            var9 |= 0x20000;
        }
        int var10 = arg4 - this.field1440;
        if (arg7 == 1 || arg7 == 3) {
            int var11 = arg0;
            arg0 = arg1;
            arg1 = var11;
        }
        if (arg5) {
            var9 |= 0x40000000;
        }
        int var12 = arg6 - this.field1444;
        for (int var13 = var12; var13 < (var12 + arg0); var13++) {
            if (var13 >= 0 && var13 < this.field1420) {
                for (int var14 = var10; var14 < arg1 + var10; var14++) {
                    if (var14 >= 0 && this.field1435 > var14) {
                        this.method657(var13, (byte) 3, var14, var9);
                    }
                }
            }
        }
        if (arg3 != -4) {
            this.method642(true, -67, -111);
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V", line = 1677)
    public final void method661(int arg0) {
        int var2 = 0;
        if (arg0 > -85) {
            this.field1421 = null;
        }
        while (this.field1420 > var2) {
            for (int var3 = 0; var3 < this.field1435; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field1420 - 5) <= var2 || (this.field1435 - 5) <= var3) {
                    this.field1421[var2][var3] = -1;
                } else {
                    this.field1421[var2][var3] = 2097152;
                }
            }
            var2++;
        }
        field1438++;
    }
}
