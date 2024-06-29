import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class117 {

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Z")
    public boolean field2046 = false;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public int field2041 = -1;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public int field2044 = -1;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "Z")
    private boolean field2057 = false;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public int field2062 = 2;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public int field2048 = 5;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public int field2042 = -1;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public int field2065 = -1;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public int field2063 = 99;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public int field2058 = -1;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field2047 = 0;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "[Lke;")
    public static class256[] field2055 = new class256[8];

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "[I")
    public static int[] field2059 = new int[5];

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "Lvm;")
    public static class297 field2054 = new class297(64);

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "[I")
    public int[] field2040;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "[I")
    private int[] field2060;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "[I")
    public int[] field2064;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "[I")
    private int[] field2067;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "[[I")
    public int[][] field2061;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILra;I)V", line = 13)
    private final void method794(int arg0, class41 arg1, int arg2) {
        field2051++;
        if (arg0 != -26309) {
            return;
        }
        if (arg2 == 1) {
            int var4 = arg1.method346(arg0 ^ 0x66CB);
            this.field2064 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2064[var5] = arg1.method346(-16);
            }
            this.field2040 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2040[var6] = arg1.method346(class288.method2011(arg0, 26315));
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2040[var7] += arg1.method346(-16) << 16;
            }
        } else if (arg2 == 2) {
            this.field2044 = arg1.method346(arg0 ^ 0x66CB);
        } else if (arg2 == 3) {
            int var8 = arg1.method357(false);
            this.field2060 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2060[var9] = arg1.method357(false);
            }
            this.field2060[var8] = 9999999;
        } else if (arg2 == 4) {
            this.field2046 = true;
        } else if (arg2 == 5) {
            this.field2048 = arg1.method357(false);
        } else if (arg2 == 6) {
            this.field2042 = arg1.method346(-16);
        } else if (arg2 == 7) {
            this.field2065 = arg1.method346(-16);
        } else if (arg2 == 8) {
            this.field2063 = arg1.method357(false);
        } else if (arg2 == 9) {
            this.field2058 = arg1.method357(false);
        } else if (arg2 == 10) {
            this.field2041 = arg1.method357(false);
        } else if (arg2 == 11) {
            this.field2062 = arg1.method357(false);
        } else if (arg2 == 12) {
            int var10 = arg1.method357(false);
            this.field2067 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2067[var11] = arg1.method346(-16);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field2067[var12] += arg1.method346(class288.method2011(arg0, 26315)) << 16;
            }
        } else if (arg2 == 13) {
            int var13 = arg1.method346(-16);
            this.field2061 = new int[var13][];
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = arg1.method357(false);
                if (var15 > 0) {
                    this.field2061[var14] = new int[var15];
                    this.field2061[var14][0] = arg1.method349((byte) -113);
                    for (int var16 = 1; var16 < var15; var16++) {
                        this.field2061[var14][var16] = arg1.method346(class288.method2011(arg0, 26315));
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field2057 = true;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILha;)Lha;", line = 171)
    public final class26 method795(int arg0, int arg1, int arg2, class26 arg3) {
        int var5 = this.field2040[arg1];
        class172 var6 = class132.method901(-1, var5 >> 16);
        field2050++;
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method161(true, true);
        }
        int var8 = arg2 & 0x3;
        if (arg0 <= 98) {
            this.field2062 = 105;
        }
        class26 var9 = arg3.method161(!var6.method1249(var7, (byte) 76), !this.field2057);
        if (var8 == 1) {
            var9.method174();
        } else if (var8 == 2) {
            var9.method176();
        } else if (var8 == 3) {
            var9.method163();
        }
        var9.method159(var6, var7, this.field2057);
        if (var8 == 1) {
            var9.method163();
        } else if (var8 == 2) {
            var9.method176();
        } else if (var8 == 3) {
            var9.method174();
        }
        return var9;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLha;IILkd;)Lha;", line = 220)
    public final class26 method796(byte arg0, class26 arg1, int arg2, int arg3, class117 arg4) {
        int var6 = this.field2040[arg2];
        field2045++;
        class172 var7 = class132.method901(-1, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg4.method801(arg1, (byte) 53, arg3);
        }
        int var9 = arg4.field2040[arg3];
        class172 var10 = class132.method901(-1, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class26 var12 = arg1.method161(!var7.method1249(var8, (byte) 114), !this.field2057);
            var12.method159(var7, var8, this.field2057);
            return var12;
        }
        class26 var13 = arg1.method161(!var7.method1249(var8, (byte) 73) & !var10.method1249(var11, (byte) 127), !this.field2057 & !arg4.field2057);
        var13.method160(var7, var8, var10, var11, this.field2060, arg4.field2057 | this.field2057);
        if (arg0 > -10) {
            this.method794(-26, (class41) null, 69);
        }
        return var13;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lha;IB)Lha;", line = 262)
    public final class26 method797(class26 arg0, int arg1, byte arg2) {
        int var4 = this.field2040[arg1];
        if (arg2 != 39) {
            return (class26) null;
        }
        class172 var5 = class132.method901(-1, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        field2053++;
        if (var5 == null) {
            return arg0.method175(true, true);
        } else {
            class26 var7 = arg0.method175(!var5.method1249(var6, (byte) 46), !this.field2057);
            var7.method159(var5, var6, this.field2057);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILha;I)Lha;", line = 304)
    public final class26 method798(int arg0, class26 arg1, int arg2) {
        field2056++;
        int var4 = this.field2040[arg0];
        class172 var5 = class132.method901(arg2 - 10000000, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (arg2 != 9999999) {
            this.field2065 = -101;
        }
        if (var5 == null) {
            return arg1.method161(true, true);
        }
        class172 var7 = null;
        int var8 = 0;
        if (this.field2067 != null && this.field2067.length > arg0) {
            int var9 = this.field2067[arg0];
            var7 = class132.method901(-1, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class26 var11 = arg1.method161(!var5.method1249(var6, (byte) 102), !this.field2057);
            var11.method159(var5, var6, this.field2057);
            return var11;
        } else {
            class26 var10 = arg1.method161(!var5.method1249(var6, (byte) 66) & !var7.method1249(var8, (byte) 84), !this.field2057);
            var10.method159(var5, var6, this.field2057);
            var10.method159(var7, var8, this.field2057);
            return var10;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V", line = 350)
    public static void method799(byte arg0) {
        field2059 = null;
        field2055 = null;
        if (arg0 <= 5) {
            field2047 = -123;
        }
        field2054 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLra;)V", line = 366)
    public final void method800(byte arg0, class41 arg1) {
        while (true) {
            int var3 = arg1.method357(false);
            if (var3 == 0) {
                field2043++;
                if (arg0 != -89) {
                    this.field2057 = true;
                }
                return;
            }
            this.method794(-26309, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lha;BI)Lha;", line = 384)
    public final class26 method801(class26 arg0, byte arg1, int arg2) {
        int var4 = this.field2040[arg2];
        class172 var5 = class132.method901(-1, var4 >> 16);
        field2052++;
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method161(true, true);
        }
        if (arg1 < 44) {
            this.method802(false);
        }
        class26 var7 = arg0.method161(!var5.method1249(var6, (byte) 47), !this.field2057);
        var7.method159(var5, var6, this.field2057);
        return var7;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V", line = 405)
    public final void method802(boolean arg0) {
        if (this.field2041 == -1) {
            if (this.field2060 == null) {
                this.field2041 = 0;
            } else {
                this.field2041 = 2;
            }
        }
        field2066++;
        if (this.field2058 == -1) {
            if (this.field2060 == null) {
                this.field2058 = 0;
            } else {
                this.field2058 = 2;
            }
        }
        if (arg0) {
            this.method800((byte) 70, (class41) null);
        }
    }
}
