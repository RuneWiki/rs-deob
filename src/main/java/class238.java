import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class238 {

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    private int field4071;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    private int field4069;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "I")
    private int field4095;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "[[I")
    public int[][] field4075;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    private int field4083;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "[I")
    public static int[] field4068 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Lia;")
    private static class257 field4067 = class28.method234(81, "Location");

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field4063 = 0;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "[S")
    public static short[] field4077 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!q", name = "D", descriptor = "Lia;")
    public static class257 field4090 = class28.method234(-47, "<col=00ff00>");

    @OriginalMember(owner = "client!q", name = "H", descriptor = "I")
    public static int field4094 = -1;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "Lia;")
    public static class257 field4092 = field4067;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "Lia;")
    public static class257 field4100 = class28.method234(-30, "::noclip");

    @OriginalMember(owner = "client!q", name = "C", descriptor = "I")
    public static int field4089 = 0;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "Lia;")
    private static class257 field4091 = class28.method234(-50, "Unable to find ");

    @OriginalMember(owner = "client!q", name = "B", descriptor = "Lia;")
    public static class257 field4088 = field4091;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!q", name = "M", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Lmb;")
    public static class178 field4070;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lvb;")
    public static class226 field4062;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4065;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public final void method1552(int arg0) {
        field4101++;
        for (int var2 = arg0; var2 < this.field4071; var2++) {
            for (int var3 = 0; var3 < this.field4095; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field4071 - 5) <= var2 || var3 >= this.field4095 - 5) {
                    this.field4075[var2][var3] = 16777215;
                } else {
                    this.field4075[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
    public static int method1553(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BIIIZI)V")
    public final void method1554(byte arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg1 - this.field4069;
        int var8 = arg5 - this.field4083;
        field4078++;
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method1566(128, (byte) -87, var7, var8);
                this.method1566(8, (byte) -104, var7, var8 - 1);
            }
            if (arg2 == 1) {
                this.method1566(2, (byte) 99, var7, var8);
                this.method1566(32, (byte) -86, var7 + 1, var8);
            }
            if (arg2 == 2) {
                this.method1566(8, (byte) 25, var7, var8);
                this.method1566(128, (byte) 35, var7, var8 + 1);
            }
            if (arg2 == 3) {
                this.method1566(32, (byte) 69, var7, var8);
                this.method1566(2, (byte) 28, var7 - 1, var8);
            }
        }
        if (arg0 != 77) {
            return;
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method1566(1, (byte) 102, var7, var8);
                this.method1566(16, (byte) -117, var7 + 1, var8 + -1);
            }
            if (arg2 == 1) {
                this.method1566(4, (byte) -98, var7, var8);
                this.method1566(64, (byte) -125, var7 + 1, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1566(16, (byte) 52, var7, var8);
                this.method1566(1, (byte) -74, var7 - 1, var8 + 1);
            }
            if (arg2 == 3) {
                this.method1566(64, (byte) -104, var7, var8);
                this.method1566(4, (byte) 69, var7 - 1, var8 + -1);
            }
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method1566(130, (byte) -117, var7, var8);
                this.method1566(8, (byte) 79, var7, var8 - 1);
                this.method1566(32, (byte) 12, var7 + 1, var8);
            }
            if (arg2 == 1) {
                this.method1566(10, (byte) 26, var7, var8);
                this.method1566(32, (byte) 54, var7 + 1, var8);
                this.method1566(128, (byte) -79, var7, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1566(40, (byte) 69, var7, var8);
                this.method1566(128, (byte) 56, var7, var8 + 1);
                this.method1566(2, (byte) -117, var7 - 1, var8);
            }
            if (arg2 == 3) {
                this.method1566(160, (byte) -83, var7, var8);
                this.method1566(2, (byte) -124, var7 - 1, var8);
                this.method1566(8, (byte) -95, var7, var8 - 1);
            }
        }
        if (!arg4) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method1566(65536, (byte) 117, var7, var8);
                this.method1566(4096, (byte) -92, var7, var8 - 1);
            }
            if (arg2 == 1) {
                this.method1566(1024, (byte) 48, var7, var8);
                this.method1566(16384, (byte) -83, var7 + 1, var8);
            }
            if (arg2 == 2) {
                this.method1566(4096, (byte) 66, var7, var8);
                this.method1566(65536, (byte) 120, var7, var8 + 1);
            }
            if (arg2 == 3) {
                this.method1566(16384, (byte) 92, var7, var8);
                this.method1566(1024, (byte) 42, var7 - 1, var8);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method1566(512, (byte) 6, var7, var8);
                this.method1566(8192, (byte) -79, var7 + 1, var8 - 1);
            }
            if (arg2 == 1) {
                this.method1566(2048, (byte) -99, var7, var8);
                this.method1566(32768, (byte) -102, var7 + 1, var8 + 1);
            }
            if (arg2 == 2) {
                this.method1566(8192, (byte) -125, var7, var8);
                this.method1566(512, (byte) -103, var7 - 1, var8 - -1);
            }
            if (arg2 == 3) {
                this.method1566(32768, (byte) 86, var7, var8);
                this.method1566(2048, (byte) -81, var7 - 1, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method1566(66560, (byte) -83, var7, var8);
            this.method1566(4096, (byte) -102, var7, var8 - 1);
            this.method1566(16384, (byte) 86, var7 + 1, var8);
        }
        if (arg2 == 1) {
            this.method1566(5120, (byte) -121, var7, var8);
            this.method1566(16384, (byte) 54, var7 + 1, var8);
            this.method1566(65536, (byte) -127, var7, var8 + 1);
        }
        if (arg2 == 2) {
            this.method1566(20480, (byte) -113, var7, var8);
            this.method1566(65536, (byte) -99, var7, var8 + 1);
            this.method1566(1024, (byte) -109, var7 - 1, var8);
        }
        if (arg2 == 3) {
            this.method1566(81920, (byte) -113, var7, var8);
            this.method1566(1024, (byte) 27, var7 - 1, var8);
            this.method1566(4096, (byte) 47, var7, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIIIII)Z")
    private final boolean method1555(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg3 + arg8;
        int var12 = arg1 + arg4;
        if (arg2 <= 117) {
            field4090 = null;
        }
        field4076++;
        int var13 = arg0 + arg5;
        int var14 = arg6 + arg7;
        if (arg3 >= arg5 && var13 > arg3) {
            if (arg7 == var12 && (arg9 & 0x4) == 0) {
                int var15 = arg3;
                int var16 = var11 > var13 ? var13 : var11;
                while (var15 < var16) {
                    if ((this.field4075[var15 - this.field4083][var12 - this.field4069 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg4 == var14 && (arg9 & 0x1) == 0) {
                int var17 = arg3;
                int var18 = var13 >= var11 ? var11 : var13;
                while (var18 > var17) {
                    if ((this.field4075[var17 - this.field4083][arg4 - this.field4069] & 0x20) == 0) {
                        return true;
                    }
                    var17++;
                }
            }
        } else if (arg5 < var11 && var11 <= var13) {
            if (arg7 == var12 && (arg9 & 0x4) == 0) {
                for (int var19 = arg5; var19 < var11; var19++) {
                    if ((this.field4075[var19 - this.field4083][var12 - this.field4069 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg4 == var14 && (arg9 & 0x1) == 0) {
                for (int var20 = arg5; var20 < var11; var20++) {
                    if ((this.field4075[var20 - this.field4083][arg4 - this.field4069] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg4 >= arg7 && arg4 < var14) {
            if (arg5 == var11 && (arg9 & 0x8) == 0) {
                int var21 = arg4;
                int var22 = var12 <= var14 ? var12 : var14;
                while (var22 > var21) {
                    if ((this.field4075[var11 - this.field4083 - 1][var21 - this.field4069] & 0x8) == 0) {
                        return true;
                    }
                    var21++;
                }
            } else if (arg3 == var13 && (arg9 & 0x2) == 0) {
                int var23 = arg4;
                int var24 = var14 < var12 ? var14 : var12;
                while (var24 > var23) {
                    if ((this.field4075[arg3 - this.field4083][var23 - this.field4069] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg7 < var12 && var12 <= var14) {
            if (arg5 == var11 && (arg9 & 0x8) == 0) {
                for (int var25 = arg7; var25 < var12; var25++) {
                    if ((this.field4075[var11 - this.field4083 - 1][var25 - this.field4069] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg3 == var13 && (arg9 & 0x2) == 0) {
                for (int var26 = arg7; var26 < var12; var26++) {
                    if ((this.field4075[arg3 - this.field4083][var26 - this.field4069] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V")
    public final void method1556(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field4069;
        field4084++;
        int var5 = arg1 - this.field4083;
        if (arg2 == -1) {
            this.field4075[var5][var4] = class198.method1332(this.field4075[var5][var4], 262144);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIIII)Z")
    private final boolean method1557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4073++;
        if (arg3 >= (arg6 + arg5) || arg6 >= arg2 + arg3) {
            return false;
        } else if (arg8 < (arg0 + arg1) && arg4 + arg8 > arg1) {
            if (arg7 != -1) {
                field4067 = null;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIBIZ)V")
    public final void method1558(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5) {
        int var7 = arg2 - this.field4083;
        field4081++;
        int var8 = 256;
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg4 - this.field4069;
        if (arg3 >= -102) {
            return;
        }
        for (int var10 = var7; var10 < (var7 + arg1); var10++) {
            if (var10 >= 0 && this.field4071 > var10) {
                for (int var11 = var9; var11 < (arg0 + var9); var11++) {
                    if (var11 >= 0 && this.field4095 > var11) {
                        this.method1570(var11, var8, -122, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZIIIII)V")
    public final void method1559(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field4083;
        int var8 = arg5 - this.field4069;
        field4061++;
        if (arg3 != 18524) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method1570(var8, 128, arg3 - 18643, var7);
                this.method1570(var8, 8, arg3 - 18649, var7 + -1);
            }
            if (arg2 == 1) {
                this.method1570(var8, 2, -123, var7);
                this.method1570(var8 + 1, 32, -126, var7);
            }
            if (arg2 == 2) {
                this.method1570(var8, 8, arg3 - 18632, var7);
                this.method1570(var8, 128, arg3 - 18638, var7 + 1);
            }
            if (arg2 == 3) {
                this.method1570(var8, 32, arg3 - 18634, var7);
                this.method1570(var8 - 1, 2, arg3 - 18647, var7);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method1570(var8, 1, -108, var7);
                this.method1570(var8 + 1, 16, arg3 ^ 0xFFFFB7D3, var7 - 1);
            }
            if (arg2 == 1) {
                this.method1570(var8, 4, -112, var7);
                this.method1570(var8 + 1, 64, -117, var7 + 1);
            }
            if (arg2 == 2) {
                this.method1570(var8, 16, -108, var7);
                this.method1570(var8 - 1, 1, -119, var7 + 1);
            }
            if (arg2 == 3) {
                this.method1570(var8, 64, -120, var7);
                this.method1570(var8 - 1, 4, -110, var7 - 1);
            }
        }
        if (arg4 == 2) {
            if (arg2 == 0) {
                this.method1570(var8, 130, -128, var7);
                this.method1570(var8, 8, -124, var7 - 1);
                this.method1570(var8 + 1, 32, -119, var7);
            }
            if (arg2 == 1) {
                this.method1570(var8, 10, -123, var7);
                this.method1570(var8 + 1, 32, arg3 ^ 0xFFFFB7D2, var7);
                this.method1570(var8, 128, -113, var7 + 1);
            }
            if (arg2 == 2) {
                this.method1570(var8, 40, -116, var7);
                this.method1570(var8, 128, -109, var7 + 1);
                this.method1570(var8 - 1, 2, -114, var7);
            }
            if (arg2 == 3) {
                this.method1570(var8, 160, arg3 - 18640, var7);
                this.method1570(var8 - 1, 2, -118, var7);
                this.method1570(var8, 8, arg3 ^ 0xFFFFB7CD, var7 - 1);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg4 == 0) {
            if (arg2 == 0) {
                this.method1570(var8, 65536, arg3 ^ 0xFFFFB7DE, var7);
                this.method1570(var8, 4096, -115, var7 - 1);
            }
            if (arg2 == 1) {
                this.method1570(var8, 1024, -120, var7);
                this.method1570(var8 + 1, 16384, -127, var7);
            }
            if (arg2 == 2) {
                this.method1570(var8, 4096, -126, var7);
                this.method1570(var8, 65536, -125, var7 + 1);
            }
            if (arg2 == 3) {
                this.method1570(var8, 16384, -126, var7);
                this.method1570(var8 - 1, 1024, -126, var7);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg2 == 0) {
                this.method1570(var8, 512, -120, var7);
                this.method1570(var8 + 1, 8192, arg3 - 18637, var7 + -1);
            }
            if (arg2 == 1) {
                this.method1570(var8, 2048, arg3 - 18637, var7);
                this.method1570(var8 + 1, 32768, -120, var7 + 1);
            }
            if (arg2 == 2) {
                this.method1570(var8, 8192, arg3 - 18647, var7);
                this.method1570(var8 - 1, 512, -108, var7 + 1);
            }
            if (arg2 == 3) {
                this.method1570(var8, 32768, -118, var7);
                this.method1570(var8 - 1, 2048, arg3 - 18647, var7 - 1);
            }
        }
        if (arg4 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method1570(var8, 66560, -112, var7);
            this.method1570(var8, 4096, -111, var7 - 1);
            this.method1570(var8 + 1, 16384, -126, var7);
        }
        if (arg2 == 1) {
            this.method1570(var8, 5120, -108, var7);
            this.method1570(var8 + 1, 16384, -113, var7);
            this.method1570(var8, 65536, arg3 ^ 0xFFFFB7D9, var7 + 1);
        }
        if (arg2 == 2) {
            this.method1570(var8, 20480, -113, var7);
            this.method1570(var8, 65536, arg3 - 18638, var7 + 1);
            this.method1570(var8 - 1, 1024, -125, var7);
        }
        if (arg2 == 3) {
            this.method1570(var8, 81920, -118, var7);
            this.method1570(var8 - 1, 1024, -116, var7);
            this.method1570(var8, 4096, -120, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
    public static void method1560(int arg0) {
        field4068 = null;
        field4070 = null;
        if (arg0 >= -59) {
            method1567(35, 88, 115);
        }
        field4062 = null;
        field4100 = null;
        field4091 = null;
        field4088 = null;
        field4090 = null;
        field4065 = null;
        field4077 = null;
        field4092 = null;
        field4067 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIBI)Z")
    public final boolean method1561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field4074++;
        if (arg5 == 1) {
            if (arg2 == arg4 && arg0 == arg3) {
                return true;
            }
        } else if (arg2 <= arg4 && arg4 <= arg2 + arg5 - 1 && arg3 >= arg3 && arg5 + arg3 - 1 >= arg3) {
            return true;
        }
        int var9 = arg3 - this.field4069;
        int var10 = arg2 - this.field4083;
        int var11 = arg0 - this.field4069;
        if (arg6 < 92) {
            return true;
        }
        int var12 = arg4 - this.field4083;
        if (arg5 == 1) {
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if (var12 + 1 == var10 && var9 == var11 && (this.field4075[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field4075[var10][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if ((var12 - 1) == var10 && var9 == var11 && (this.field4075[var10][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field4075[var10][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var12 - 1 == var10 && var9 == var11 && (this.field4075[var10][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field4075[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if ((var12 + 1) == var10 && var9 == var11 && (this.field4075[var10][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field4075[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var10 == var12 && var9 + 1 == var11 && (this.field4075[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && var9 - 1 == var11 && (this.field4075[var10][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - 1) == var10 && var9 == var11 && (this.field4075[var10][var11] & 0x8) == 0) {
                    return true;
                }
                if ((var12 + 1) == var10 && var9 == var11 && (this.field4075[var10][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var10 + arg5 - 1;
            int var14 = arg5 + var11 - 1;
            if (arg1 == 6 || arg1 == 7) {
                if (arg1 == 7) {
                    arg7 = arg7 + 2 & 0x3;
                }
                if (arg7 == 0) {
                    if ((var12 + 1) == var10 && var9 >= var11 && var14 >= var9 && (this.field4075[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && (var9 - arg5) == var11 && (this.field4075[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 1) {
                    if (var12 - arg5 == var10 && var11 <= var9 && var9 <= var14 && (this.field4075[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var12 <= var13 && (var9 - arg5) == var11 && (this.field4075[var12][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg7 == 2) {
                    if (var12 - arg5 == var10 && var11 <= var9 && var14 >= var9 && (this.field4075[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 <= var12 && var13 >= var12 && var9 + 1 == var11 && (this.field4075[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg7 == 3) {
                    if (var12 + 1 == var10 && var9 >= var11 && var9 <= var14 && (this.field4075[var10][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 >= var10 && var12 <= var13 && var9 + 1 == var11 && (this.field4075[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg1 == 8) {
                if (var10 <= var12 && var13 >= var12 && var9 + 1 == var11 && (this.field4075[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var12 >= var10 && var12 <= var13 && (var9 - arg5) == var11 && (this.field4075[var12][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var12 - arg5) == var10 && var9 >= var11 && var9 <= var14 && (this.field4075[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if (var12 + 1 == var10 && var9 >= var11 && var14 >= var9 && (this.field4075[var10][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(IIIIIIIII)Z")
    public final boolean method1562(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4080++;
        if (arg5 >= -15) {
            return true;
        } else if (arg2 > 1) {
            return this.method1557(arg7, arg6, arg2, arg1, arg2, arg4, arg3, -1, arg0) ? true : this.method1555(arg4, arg2, 122, arg1, arg0, arg3, arg7, arg6, arg2, arg8);
        } else {
            int var10 = arg3 + arg4 - 1;
            int var11 = arg6 + arg7 - 1;
            if (arg3 <= arg1 && arg1 <= var10 && arg0 >= arg6 && arg0 <= var11) {
                return true;
            } else if (arg3 - 1 == arg1 && arg0 >= arg6 && arg0 <= var11 && (this.field4075[arg1 - this.field4083][arg0 - this.field4069] & 0x8) == 0 && (arg8 & 0x8) == 0) {
                return true;
            } else if ((var10 + 1) == arg1 && arg0 >= arg6 && arg0 <= var11 && (this.field4075[arg1 - this.field4083][arg0 - this.field4069] & 0x80) == 0 && (arg8 & 0x2) == 0) {
                return true;
            } else if ((arg6 - 1) == arg0 && arg3 <= arg1 && arg1 <= var10 && (this.field4075[arg1 - this.field4083][arg0 - this.field4069] & 0x2) == 0 && (arg8 & 0x4) == 0) {
                return true;
            } else {
                return (var11 + 1) == arg0 && arg1 >= arg3 && var10 >= arg1 && (this.field4075[arg1 - this.field4083][arg0 - this.field4069] & 0x20) == 0 && (arg8 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBI)V")
    public final void method1563(int arg0, byte arg1, int arg2) {
        field4087++;
        int var4 = arg0 - this.field4069;
        if (arg1 != -64) {
            field4090 = null;
        }
        int var5 = arg2 - this.field4083;
        this.field4075[var5][var4] = class198.method1332(this.field4075[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIZZ)V")
    public final void method1564(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        field4064++;
        int var8 = arg0 - this.field4069;
        int var9 = 256;
        int var10 = arg3 - this.field4083;
        if (arg5) {
            field4094 = -126;
        }
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg1;
            arg1 = arg2;
            arg2 = var11;
        }
        if (arg6) {
            var9 += 131072;
        }
        for (int var12 = var10; var12 < arg1 + var10; var12++) {
            if (var12 >= 0 && var12 < this.field4071) {
                for (int var13 = var8; var13 < arg2 + var8; var13++) {
                    if (var13 >= 0 && var13 < this.field4095) {
                        this.method1566(var9, (byte) 19, var13, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(IBI)V")
    public final void method1565(int arg0, byte arg1, int arg2) {
        int var4 = arg2 - this.field4069;
        field4096++;
        int var5 = arg0 - this.field4083;
        this.field4075[var5][var4] = class30.method252(this.field4075[var5][var4], -262145);
        if (arg1 > -42) {
            this.method1566(-37, (byte) 71, -55, 104);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBII)V")
    private final void method1566(int arg0, byte arg1, int arg2, int arg3) {
        field4072++;
        this.field4075[arg3][arg2] = class30.method252(this.field4075[arg3][arg2], ~arg0);
        int var5 = -127 / ((arg1 + 37) / 37);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(III)I")
    public static final int method1567(int arg0, int arg1, int arg2) {
        field4082++;
        class260 var3 = (class260) class174.field2965.method434((byte) -93, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            if (arg0 != 14909) {
                field4077 = null;
            }
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field4518.length; var5++) {
                if (var3.field4512[var5] == arg1) {
                    var4 += var3.field4518[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
    public static final void method1568(int arg0) {
        if (class27.field524 != null) {
            class111 var1 = class27.field524;
            synchronized (class27.field524) {
                class27.field524 = null;
            }
        }
        field4079++;
        if (arg0 != 19661064) {
            field4077 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V")
    public static final void method1569(int arg0) {
        if (arg0 != 65536) {
            field4089 = -43;
        }
        field4066++;
        class239.field4113.method1361(true);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)V")
    private final void method1570(int arg0, int arg1, int arg2, int arg3) {
        this.field4075[arg3][arg0] = class198.method1332(this.field4075[arg3][arg0], arg1);
        if (arg2 >= -107) {
            field4094 = -14;
        }
        field4085++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIBIIIII)Z")
    public final boolean method1571(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4093++;
        if (arg5 == 1) {
            if (arg0 == arg7 && arg1 == arg6) {
                return true;
            }
        } else if (arg7 >= arg0 && arg0 + arg5 - 1 >= arg7 && arg1 >= arg1 && (arg5 + arg1 - 1) >= arg1) {
            return true;
        }
        if (arg2 <= 65) {
            return false;
        }
        int var9 = arg7 - this.field4083;
        int var10 = arg1 - this.field4069;
        int var11 = arg0 - this.field4083;
        int var12 = arg6 - this.field4069;
        if (arg5 == 1) {
            if (arg3 == 0) {
                if (arg4 == 0) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field4075[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field4075[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var9 - 1 == var11 && var10 == var12 && (this.field4075[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field4075[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field4075[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field4075[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 == var11 && (var10 - 1) == var12) {
                        return true;
                    }
                    if (var9 - 1 == var11 && var10 == var12 && (this.field4075[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field4075[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg4 == 0) {
                    if (var9 - 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12 && (this.field4075[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field4075[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field4075[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field4075[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var9 - 1 == var11 && var10 == var12 && (this.field4075[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field4075[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var9 - 1) == var11 && var10 == var12) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field4075[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field4075[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var9 == var11 && var10 + 1 == var12 && (this.field4075[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && (var10 - 1) == var12 && (this.field4075[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var11 && var10 == var12 && (this.field4075[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var10 == var12 && (this.field4075[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg5 - 1;
            int var14 = arg5 + var12 - 1;
            if (arg3 == 0) {
                if (arg4 == 0) {
                    if (var9 - arg5 == var11 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var10 + 1 == var12 && (this.field4075[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var10 - arg5) == var12 && (this.field4075[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var9 >= var11 && var13 >= var9 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var9 - arg5) == var11 && var12 <= var10 && var14 >= var10 && (this.field4075[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 <= var10 && var14 >= var10 && (this.field4075[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var9 + 1) == var11 && var12 <= var10 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var10 + 1 == var12 && (this.field4075[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var10 - arg5 == var12 && (this.field4075[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var11 <= var9 && var9 <= var13 && var10 - arg5 == var12) {
                        return true;
                    }
                    if (var9 - arg5 == var11 && var10 >= var12 && var14 >= var10 && (this.field4075[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var12 <= var10 && var10 <= var14 && (this.field4075[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg3 == 2) {
                if (arg4 == 0) {
                    if (var9 - arg5 == var11 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var10 + 1 == var12) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 >= var12 && var10 <= var14 && (this.field4075[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var10 - arg5) == var12 && (this.field4075[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var9 - arg5) == var11 && var12 <= var10 && var14 >= var10 && (this.field4075[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var10 + 1) == var12) {
                        return true;
                    }
                    if ((var9 + 1) == var11 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var10 - arg5) == var12 && (this.field4075[var9][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var9 - arg5) == var11 && var10 >= var12 && var14 >= var10 && (this.field4075[var13][var10] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var10 + 1) == var12 && (this.field4075[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var12 <= var10 && var10 <= var14) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && (var10 - arg5) == var12) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var9 - arg5 == var11 && var10 >= var12 && var14 >= var10) {
                        return true;
                    }
                    if (var9 >= var11 && var13 >= var9 && var10 + 1 == var12 && (this.field4075[var9][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var9 + 1 == var11 && var10 >= var12 && var10 <= var14 && (this.field4075[var11][var10] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && (var10 - arg5) == var12) {
                        return true;
                    }
                }
            }
            if (arg3 == 9) {
                if (var9 >= var11 && var13 >= var9 && var10 + 1 == var12 && (this.field4075[var9][var12] & 0x12C0120) == 0) {
                    return true;
                }
                if (var11 <= var9 && var13 >= var9 && var10 - arg5 == var12 && (this.field4075[var9][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var9 - arg5 == var11 && var12 <= var10 && var14 >= var10 && (this.field4075[var13][var10] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 + 1 == var11 && var12 <= var10 && var14 >= var10 && (this.field4075[var11][var10] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(II)V")
    public class238(int arg0, int arg1) {
        this.field4071 = arg0;
        this.field4069 = 0;
        this.field4095 = arg1;
        this.field4075 = new int[this.field4071][this.field4095];
        this.field4083 = 0;
        this.method1552(0);
    }
}
