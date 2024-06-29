import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class52 {

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    private int field1468 = 0;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    private int field1450;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    private int field1471;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "[[I")
    public int[][] field1455;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1459 = 0;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field1464 = 0;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Z")
    public static boolean field1454 = false;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field1456 = 5063219;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    public static int field1474 = 10;

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
    public static volatile int field1478 = 0;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "Lrd;")
    private static class117 field1465 = class95.method812("button near the top of that page)3", (byte) 8);

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "Lrd;")
    public static class117 field1458 = field1465;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "Ljava/awt/Font;")
    public static Font field1461;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "[I")
    public static int[] field1476;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method561(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1457++;
        if (arg3 == arg6 && arg0 == arg5) {
            return true;
        }
        int var8 = arg0 - this.field1471;
        int var9 = arg5 - this.field1471;
        int var10 = arg6 - this.field1468;
        int var11 = arg3 - this.field1468;
        if (arg1 == 6 || arg1 == 7) {
            if (arg1 == 7) {
                arg2 = arg2 + 2 & 0x3;
            }
            if (arg2 == 0) {
                if (var10 + 1 == var11 && var8 == var9 && (this.field1455[var11][var8] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8 && (this.field1455[var11][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 1) {
                if (var10 - 1 == var11 && var8 == var9 && (this.field1455[var11][var8] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var8 && (this.field1455[var11][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg2 == 2) {
                if (var10 - 1 == var11 && var8 == var9 && (this.field1455[var11][var8] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8 && (this.field1455[var11][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg2 == 3) {
                if (var10 + 1 == var11 && var8 == var9 && (this.field1455[var11][var8] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 + 1 == var8 && (this.field1455[var11][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 8) {
            if (var10 == var11 && var9 + 1 == var8 && (this.field1455[var11][var8] & 0x20) == 0) {
                return true;
            }
            if (var10 == var11 && var9 - 1 == var8 && (this.field1455[var11][var8] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var11 && var8 == var9 && (this.field1455[var11][var8] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var11 && var8 == var9 && (this.field1455[var11][var8] & 0x80) == 0) {
                return true;
            }
        }
        if (arg4 >= -36) {
            this.method561(-27, 73, 23, 76, 10, 73, -102);
        }
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method562(int arg0) {
        field1476 = null;
        field1458 = null;
        field1461 = null;
        if (arg0 != -1) {
            method567(-107);
        }
        field1465 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)V")
    private final void method563(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -14420) {
            method564((byte) 46);
        }
        field1451++;
        this.field1455[arg2][arg0] = class84.method763(this.field1455[arg2][arg0], arg1);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static final void method564(byte arg0) {
        if (arg0 != -120) {
            field1459 = -70;
        }
        field1463++;
        if (class9.field197.toLowerCase().indexOf("microsoft") != -1) {
            class99.field2455[190] = 72;
            class99.field2455[187] = 27;
            class99.field2455[223] = 28;
            class99.field2455[192] = 58;
            class99.field2455[219] = 42;
            class99.field2455[189] = 26;
            class99.field2455[191] = 73;
            class99.field2455[221] = 43;
            class99.field2455[222] = 59;
            class99.field2455[220] = 74;
            class99.field2455[188] = 71;
            class99.field2455[186] = 57;
            return;
        }
        class99.field2455[46] = 72;
        if (class9.field196 == null) {
            class99.field2455[192] = 58;
            class99.field2455[222] = 59;
        } else {
            class99.field2455[520] = 59;
            class99.field2455[192] = 28;
            class99.field2455[222] = 58;
        }
        class99.field2455[45] = 26;
        class99.field2455[47] = 73;
        class99.field2455[93] = 43;
        class99.field2455[59] = 57;
        class99.field2455[44] = 71;
        class99.field2455[61] = 27;
        class99.field2455[91] = 42;
        class99.field2455[92] = 74;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIZ)V")
    public final void method565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var8 = arg0 - this.field1468;
        int var9 = arg5 - this.field1471;
        field1467++;
        if (arg4 > -55) {
            this.method563(111, 98, 94, -54);
        }
        int var10 = 256;
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg1;
            arg1 = arg3;
            arg3 = var11;
        }
        if (arg6) {
            var10 += 131072;
        }
        for (int var12 = var8; var12 < arg1 + var8; var12++) {
            if (var12 >= 0 && this.field1450 > var12) {
                for (int var13 = var9; var13 < arg3 + var9; var13++) {
                    if (var13 >= 0 && this.field1477 > var13) {
                        this.method563(var13, var10, var12, -14420);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZIZII)V")
    public final void method566(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg1) {
            field1476 = null;
        }
        field1452++;
        int var7 = arg0 - this.field1471;
        int var8 = arg2 - this.field1468;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method577(var7, 128, var8, -104);
                this.method577(var7, 8, var8 - 1, -128);
            }
            if (arg4 == 1) {
                this.method577(var7, 2, var8, -117);
                this.method577(var7 + 1, 32, var8, -122);
            }
            if (arg4 == 2) {
                this.method577(var7, 8, var8, -119);
                this.method577(var7, 128, var8 + 1, -122);
            }
            if (arg4 == 3) {
                this.method577(var7, 32, var8, -121);
                this.method577(var7 - 1, 2, var8, -128);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method577(var7, 1, var8, -103);
                this.method577(var7 + 1, 16, var8 - 1, -124);
            }
            if (arg4 == 1) {
                this.method577(var7, 4, var8, -110);
                this.method577(var7 + 1, 64, var8 + 1, -125);
            }
            if (arg4 == 2) {
                this.method577(var7, 16, var8, -115);
                this.method577(var7 - 1, 1, var8 + 1, -98);
            }
            if (arg4 == 3) {
                this.method577(var7, 64, var8, -103);
                this.method577(var7 - 1, 4, var8 - 1, -99);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method577(var7, 130, var8, -97);
                this.method577(var7, 8, var8 - 1, -127);
                this.method577(var7 + 1, 32, var8, -116);
            }
            if (arg4 == 1) {
                this.method577(var7, 10, var8, -121);
                this.method577(var7 + 1, 32, var8, -120);
                this.method577(var7, 128, var8 + 1, -119);
            }
            if (arg4 == 2) {
                this.method577(var7, 40, var8, -117);
                this.method577(var7, 128, var8 + 1, -120);
                this.method577(var7 - 1, 2, var8, -108);
            }
            if (arg4 == 3) {
                this.method577(var7, 160, var8, -114);
                this.method577(var7 - 1, 2, var8, -98);
                this.method577(var7, 8, var8 - 1, -118);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method577(var7, 65536, var8, -98);
                this.method577(var7, 4096, var8 - 1, -105);
            }
            if (arg4 == 1) {
                this.method577(var7, 1024, var8, -96);
                this.method577(var7 + 1, 16384, var8, -115);
            }
            if (arg4 == 2) {
                this.method577(var7, 4096, var8, -104);
                this.method577(var7, 65536, var8 + 1, -110);
            }
            if (arg4 == 3) {
                this.method577(var7, 16384, var8, -123);
                this.method577(var7 - 1, 1024, var8, -124);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method577(var7, 512, var8, -99);
                this.method577(var7 + 1, 8192, var8 - 1, -116);
            }
            if (arg4 == 1) {
                this.method577(var7, 2048, var8, -124);
                this.method577(var7 + 1, 32768, var8 + 1, -102);
            }
            if (arg4 == 2) {
                this.method577(var7, 8192, var8, -107);
                this.method577(var7 - 1, 512, var8 + 1, -121);
            }
            if (arg4 == 3) {
                this.method577(var7, 32768, var8, -98);
                this.method577(var7 - 1, 2048, var8 - 1, -105);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method577(var7, 66560, var8, -125);
            this.method577(var7, 4096, var8 - 1, -128);
            this.method577(var7 + 1, 16384, var8, -114);
        }
        if (arg4 == 1) {
            this.method577(var7, 5120, var8, -110);
            this.method577(var7 + 1, 16384, var8, -118);
            this.method577(var7, 65536, var8 + 1, -122);
        }
        if (arg4 == 2) {
            this.method577(var7, 20480, var8, -104);
            this.method577(var7, 65536, var8 + 1, -101);
            this.method577(var7 - 1, 1024, var8, -104);
        }
        if (arg4 == 3) {
            this.method577(var7, 81920, var8, -118);
            this.method577(var7 - 1, 1024, var8, -115);
            this.method577(var7, 4096, var8 - 1, -115);
            return;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Lcd;")
    public static final class19 method567(int arg0) {
        field1475++;
        class19 var1 = new class19(class43.field1219, class141.field3352, class66.field1868, class68.field1902, class68.field1920);
        class5.method36((byte) 95);
        if (arg0 != -29807) {
            field1456 = -39;
        }
        return var1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIZIII)V")
    public final void method568(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg1 - this.field1468;
        field1462++;
        int var9 = arg2 - this.field1471;
        int var10 = 256;
        if (arg5 != -26449) {
            return;
        }
        if (arg4 == 1 || arg4 == 3) {
            int var11 = arg0;
            arg0 = arg6;
            arg6 = var11;
        }
        if (arg3) {
            var10 += 131072;
        }
        for (int var12 = var8; var12 < var8 + arg0; var12++) {
            if (var12 >= 0 && var12 < this.field1450) {
                for (int var13 = var9; var13 < arg6 + var9; var13++) {
                    if (var13 >= 0 && this.field1477 > var13) {
                        this.method577(var13, var10, var12, -113);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIZBI)V")
    public final void method569(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5) {
        int var7 = -52 % ((arg4 - 39) / 40);
        field1469++;
        int var8 = arg0 - this.field1471;
        int var9 = arg1 - this.field1468;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method563(var8, 128, var9, -14420);
                this.method563(var8, 8, var9 - 1, -14420);
            }
            if (arg5 == 1) {
                this.method563(var8, 2, var9, -14420);
                this.method563(var8 + 1, 32, var9, -14420);
            }
            if (arg5 == 2) {
                this.method563(var8, 8, var9, -14420);
                this.method563(var8, 128, var9 + 1, -14420);
            }
            if (arg5 == 3) {
                this.method563(var8, 32, var9, -14420);
                this.method563(var8 - 1, 2, var9, -14420);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method563(var8, 1, var9, -14420);
                this.method563(var8 + 1, 16, var9 - 1, -14420);
            }
            if (arg5 == 1) {
                this.method563(var8, 4, var9, -14420);
                this.method563(var8 + 1, 64, var9 + 1, -14420);
            }
            if (arg5 == 2) {
                this.method563(var8, 16, var9, -14420);
                this.method563(var8 - 1, 1, var9 + 1, -14420);
            }
            if (arg5 == 3) {
                this.method563(var8, 64, var9, -14420);
                this.method563(var8 - 1, 4, var9 - 1, -14420);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method563(var8, 130, var9, -14420);
                this.method563(var8, 8, var9 - 1, -14420);
                this.method563(var8 + 1, 32, var9, -14420);
            }
            if (arg5 == 1) {
                this.method563(var8, 10, var9, -14420);
                this.method563(var8 + 1, 32, var9, -14420);
                this.method563(var8, 128, var9 + 1, -14420);
            }
            if (arg5 == 2) {
                this.method563(var8, 40, var9, -14420);
                this.method563(var8, 128, var9 + 1, -14420);
                this.method563(var8 - 1, 2, var9, -14420);
            }
            if (arg5 == 3) {
                this.method563(var8, 160, var9, -14420);
                this.method563(var8 - 1, 2, var9, -14420);
                this.method563(var8, 8, var9 - 1, -14420);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method563(var8, 65536, var9, -14420);
                this.method563(var8, 4096, var9 - 1, -14420);
            }
            if (arg5 == 1) {
                this.method563(var8, 1024, var9, -14420);
                this.method563(var8 + 1, 16384, var9, -14420);
            }
            if (arg5 == 2) {
                this.method563(var8, 4096, var9, -14420);
                this.method563(var8, 65536, var9 + 1, -14420);
            }
            if (arg5 == 3) {
                this.method563(var8, 16384, var9, -14420);
                this.method563(var8 - 1, 1024, var9, -14420);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method563(var8, 512, var9, -14420);
                this.method563(var8 + 1, 8192, var9 - 1, -14420);
            }
            if (arg5 == 1) {
                this.method563(var8, 2048, var9, -14420);
                this.method563(var8 + 1, 32768, var9 + 1, -14420);
            }
            if (arg5 == 2) {
                this.method563(var8, 8192, var9, -14420);
                this.method563(var8 - 1, 512, var9 + 1, -14420);
            }
            if (arg5 == 3) {
                this.method563(var8, 32768, var9, -14420);
                this.method563(var8 - 1, 2048, var9 - 1, -14420);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method563(var8, 66560, var9, -14420);
            this.method563(var8, 4096, var9 - 1, -14420);
            this.method563(var8 + 1, 16384, var9, -14420);
        }
        if (arg5 == 1) {
            this.method563(var8, 5120, var9, -14420);
            this.method563(var8 + 1, 16384, var9, -14420);
            this.method563(var8, 65536, var9 + 1, -14420);
        }
        if (arg5 == 2) {
            this.method563(var8, 20480, var9, -14420);
            this.method563(var8, 65536, var9 + 1, -14420);
            this.method563(var8 - 1, 1024, var9, -14420);
        }
        if (arg5 == 3) {
            this.method563(var8, 81920, var9, -14420);
            this.method563(var8 - 1, 1024, var9, -14420);
            this.method563(var8, 4096, var9 - 1, -14420);
            return;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BII)V")
    public final void method570(byte arg0, int arg1, int arg2) {
        field1466++;
        int var4 = arg1 - this.field1471;
        if (arg0 != -75) {
            method562(-90);
        }
        int var5 = arg2 - this.field1468;
        this.field1455[var5][var4] = class66.method660(this.field1455[var5][var4], 14680063);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public final void method571(byte arg0) {
        if (arg0 < 66) {
            field1474 = 85;
        }
        for (int var2 = 0; var2 < this.field1450; var2++) {
            for (int var3 = 0; var3 < this.field1477; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1450 - 1 == var2 || this.field1477 - 1 == var3) {
                    this.field1455[var2][var3] = 16777215;
                } else {
                    this.field1455[var2][var3] = 16777216;
                }
            }
        }
        field1473++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lrd;IILrd;)V")
    public static final void method572(class117 arg0, int arg1, int arg2, class117 arg3) {
        if (arg2 == 0 && class94.field2352 != -1) {
            class2.field46 = arg3;
            client.field624 = 0;
        }
        field1449++;
        if (class56.field1553 == arg1) {
            class18.field458 = true;
        }
        for (int var4 = 99; var4 > 0; var4--) {
            class119.field2919[var4] = class119.field2919[var4 - 1];
            class43.field1236[var4] = class43.field1236[var4 - 1];
            class128.field3107[var4] = class128.field3107[var4 - 1];
        }
        class119.field2919[0] = arg2;
        class43.field1236[0] = arg0;
        class128.field3107[0] = arg3;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
    public static final void method573(int arg0) {
        if (client.field624 == 1 && class66.field1873 >= 715 && class68.field1909 >= 453) {
            class72.field2003 = !class72.field2003;
            if (class72.field2003) {
                class142.method1132(20439);
            } else {
                class49.method548(class56.field1570, class22.field643, class71.field1980, 255, false, -106);
            }
            class117.method959((byte) -39);
        }
        field1470++;
        int var1 = 38 / ((74 - arg0) / 51);
        if (field1464 == 5) {
            return;
        }
        class90.method795(41);
        if (field1464 != 10) {
            return;
        }
        int var2 = class66.field1873 - 202;
        int var3 = client.field624;
        int var4 = class68.field1909 - 171;
        if (class116.field2824 == 0) {
            byte var5 = 100;
            byte var6 = 120;
            if (var3 == 1 && var2 >= var5 - 75 && var2 <= var5 + 75 && var4 >= var6 - 20 && var6 + 20 >= var4) {
                class73.field2051 = 0;
                class116.field2824 = 3;
            }
            short var7 = 260;
            if (var3 == 1 && var7 - 75 <= var2 && var2 <= var7 + 75 && var4 >= var6 - 20 && var6 + 20 >= var4) {
                class56.field1552 = class20.field560;
                class56.field1561 = class20.field578;
                class116.field2824 = 2;
                class56.field1566 = class24.field674;
                class73.field2051 = 0;
                return;
            }
        } else if (class116.field2824 == 2) {
            byte var10 = 60;
            byte var11 = 100;
            short var12 = 150;
            int var16 = var10 + 30;
            if (var3 == 1 && var4 >= var16 - 15 && var4 < var16) {
                class73.field2051 = 0;
            }
            var16 += 15;
            if (var3 == 1 && var4 >= var16 - 15 && var4 < var16) {
                class73.field2051 = 1;
            }
            var16 += 15;
            if (var3 == 1 && var2 >= var11 - 75 && var11 + 75 >= var2 && var4 >= var12 - 20 && var12 + 20 >= var4) {
                class56.field1575 = class56.field1575.method945(-124).method957(-8191);
                class14.method114(class20.field534, class49.field1382, class20.field554, 114);
                class85.method769(0, 20);
                return;
            }
            short var13 = 260;
            if (var3 == 1 && var2 >= var13 - 75 && var2 <= var13 + 75 && var12 - 20 <= var4 && var12 + 20 >= var4) {
                class116.field2824 = 0;
                class56.field1562 = class56.field1570;
                class56.field1575 = class56.field1570;
            }
            while (true) {
                boolean var14;
                label163: do {
                    while (class144.method1148(-29057)) {
                        var14 = false;
                        for (int var15 = 0; class137.field3280.method954(-61) > var15; var15++) {
                            if (class147.field3601 == class137.field3280.method953(var15, 2)) {
                                var14 = true;
                                break;
                            }
                        }
                        if (class73.field2051 != 0) {
                            continue label163;
                        }
                        if (class94.field2351 == 85 && class56.field1575.method954(-40) > 0) {
                            class56.field1575 = class56.field1575.method963(class56.field1575.method954(-117) - 1, 0, (byte) -127);
                        }
                        if (class94.field2351 == 84 || class94.field2351 == 80) {
                            class73.field2051 = 1;
                        }
                        if (var14 && class56.field1575.method954(118) < 12) {
                            class56.field1575 = class56.field1575.method961(class147.field3601, true);
                        }
                    }
                    return;
                } while (class73.field2051 != 1);
                if (class94.field2351 == 85 && class56.field1562.method954(69) > 0) {
                    class56.field1562 = class56.field1562.method963(class56.field1562.method954(-51) - 1, 0, (byte) -127);
                }
                if (class94.field2351 == 84 || class94.field2351 == 80) {
                    class73.field2051 = 0;
                }
                if (var14 && class56.field1562.method954(-89) < 20) {
                    class56.field1562 = class56.field1562.method961(class147.field3601, true);
                }
            }
        } else if (class116.field2824 == 3) {
            short var8 = 180;
            short var9 = 150;
            if (var3 == 1 && var2 >= var8 - 75 && var8 + 75 >= var2 && var4 >= var9 - 20 && var9 + 20 >= var4) {
                class116.field2824 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZII)V")
    public final void method574(boolean arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1471;
        int var5 = arg2 - this.field1468;
        field1472++;
        this.field1455[var5][var4] = class84.method763(this.field1455[var5][var4], 2097152);
        if (arg0) {
            method572(null, -68, -41, null);
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(II)V")
    public class52(int arg0, int arg1) {
        this.field1450 = arg0;
        this.field1471 = 0;
        this.field1477 = arg1;
        this.field1455 = new int[this.field1450][this.field1477];
        this.method571((byte) 94);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1453++;
        int var9 = arg2 + arg5 - 1;
        if (arg0 != 58) {
            return true;
        }
        int var10 = arg1 + arg3 - 1;
        if (arg4 >= arg5 && arg4 <= var9 && arg3 <= arg6 && arg6 <= var10) {
            return true;
        } else if (arg5 - 1 == arg4 && arg6 >= arg3 && var10 >= arg6 && (this.field1455[arg4 - this.field1468][arg6 - this.field1471] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg4 && arg3 <= arg6 && var10 >= arg6 && (this.field1455[arg4 - this.field1468][arg6 - this.field1471] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg6 && arg4 >= arg5 && arg4 <= var9 && (this.field1455[arg4 - this.field1468][arg6 - this.field1471] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg6 && arg4 >= arg5 && var9 >= arg4 && (this.field1455[arg4 - this.field1468][arg6 - this.field1471] & 0x20) == 0 && (arg7 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(IIIIIII)Z")
    public final boolean method576(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1448++;
        if (arg0 == arg6 && arg2 == arg5) {
            return true;
        }
        int var8 = arg0 - this.field1468;
        int var9 = arg6 - this.field1468;
        if (arg4 != 2) {
            return true;
        }
        int var10 = arg2 - this.field1471;
        int var11 = arg5 - this.field1471;
        if (arg3 == 0) {
            if (arg1 == 0) {
                if (var8 - 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field1455[var9][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field1455[var9][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var8 == var9 && var10 + 1 == var11) {
                    return true;
                }
                if (var8 - 1 == var9 && var10 == var11 && (this.field1455[var9][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11 && (this.field1455[var9][var11] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var8 + 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field1455[var9][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field1455[var9][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var8 == var9 && var10 - 1 == var11) {
                    return true;
                }
                if (var8 - 1 == var9 && var10 == var11 && (this.field1455[var9][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11 && (this.field1455[var9][var11] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg3 == 2) {
            if (arg1 == 0) {
                if (var8 - 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11 && (this.field1455[var9][var11] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field1455[var9][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var8 - 1 == var9 && var10 == var11 && (this.field1455[var9][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field1455[var9][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var8 - 1 == var9 && var10 == var11 && (this.field1455[var9][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field1455[var9][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var8 - 1 == var9 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field1455[var9][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 + 1 == var9 && var10 == var11 && (this.field1455[var9][var11] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11) {
                    return true;
                }
            }
        }
        if (arg3 == 9) {
            if (var8 == var9 && var10 + 1 == var11 && (this.field1455[var9][var11] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var10 - 1 == var11 && (this.field1455[var9][var11] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var9 && var10 == var11 && (this.field1455[var9][var11] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var9 && var10 == var11 && (this.field1455[var9][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(IIII)V")
    private final void method577(int arg0, int arg1, int arg2, int arg3) {
        field1460++;
        if (arg3 <= -95) {
            this.field1455[arg2][arg0] = class66.method660(this.field1455[arg2][arg0], 16777215 - arg1);
        }
    }
}
