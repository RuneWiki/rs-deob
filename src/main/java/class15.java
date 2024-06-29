import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class15 {

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "Z")
    public boolean field152 = false;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
    public int field155 = -1;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public int field147 = 99;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public int field154 = -1;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public int field151 = -1;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "Z")
    public boolean field163 = false;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public int field153 = 5;

    @OriginalMember(owner = "client!qr", name = "y", descriptor = "Z")
    public boolean field170 = false;

    @OriginalMember(owner = "client!qr", name = "C", descriptor = "I")
    public int field174 = -1;

    @OriginalMember(owner = "client!qr", name = "u", descriptor = "I")
    public int field166 = 2;

    @OriginalMember(owner = "client!qr", name = "x", descriptor = "Z")
    public boolean field169 = false;

    @OriginalMember(owner = "client!qr", name = "B", descriptor = "I")
    public int field173 = -1;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "[I")
    public static int[] field161 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public int field148;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!qr", name = "v", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!qr", name = "w", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!qr", name = "A", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "[I")
    public int[] field150;

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "[I")
    private int[] field162;

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "[I")
    public int[] field164;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "[Z")
    public boolean[] field160;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "[[I")
    public int[][] field156;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V", line = 10)
    public static void method97(boolean arg0) {
        field161 = null;
        if (arg0) {
            field161 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "()V", line = 23)
    public static final void method98() {
        for (int var0 = 0; var0 < class401.field5966; var0++) {
            class361 var1 = class143.field1881[var0];
            class107.method741(var1);
            class143.field1881[var0] = null;
        }
        class401.field5966 = 0;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)V", line = 43)
    public static final void method99(int arg0, int arg1) {
        if (arg0 <= -109) {
            class282.field4140 = arg1;
            field172++;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIBLqc;I)Lqc;", line = 65)
    public final class95 method100(int arg0, int arg1, int arg2, byte arg3, class95 arg4, int arg5) {
        field146++;
        int var7 = this.field164[arg5];
        int var8 = -45 % ((arg3 - 1) / 48);
        int var9 = this.field150[arg5];
        class236 var10 = class376.method2496((byte) -119, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            return arg4.method628((byte) 1, arg2, true);
        }
        class236 var12 = null;
        if ((this.field170 || class408.field6114) && arg0 != -1 && arg0 < this.field150.length) {
            int var13 = this.field150[arg0];
            var12 = class376.method2496((byte) -119, var13 >> 16);
            arg0 = var13 & 0xFFFF;
        }
        class236 var14 = null;
        class236 var15 = null;
        int var16 = 0;
        int var17 = 0;
        if (this.field162 != null) {
            if (arg5 < this.field162.length) {
                var16 = this.field162[arg5];
                if (var16 != 65535) {
                    var14 = class376.method2496((byte) -119, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
            if ((this.field170 || class408.field6114) && arg0 != -1 && this.field162.length > arg0) {
                var17 = this.field162[arg0];
                if (var17 != 65535) {
                    var15 = class376.method2496((byte) -119, var17 >> 16);
                    var17 &= 0xFFFF;
                }
            }
        }
        if (this.field152) {
            arg2 |= 0x200;
        }
        if (var10.method1440(65280, var11)) {
            arg2 |= 0x80;
        }
        if (var10.method1443((byte) 0, var11)) {
            arg2 |= 0x100;
        }
        if (var14 != null) {
            if (var14.method1440(65280, var16)) {
                arg2 |= 0x80;
            }
            if (var14.method1443((byte) 0, var16)) {
                arg2 |= 0x100;
            }
        }
        if (var12 != null) {
            if (var12.method1440(65280, arg0)) {
                arg2 |= 0x80;
            }
            if (var12.method1443((byte) 0, arg0)) {
                arg2 |= 0x100;
            }
        }
        if (var15 != null) {
            if (var15.method1440(65280, var17)) {
                arg2 |= 0x80;
            }
            if (var15.method1443((byte) 0, var17)) {
                arg2 |= 0x100;
            }
        }
        int var18 = arg2 | 0x20;
        class95 var19 = arg4.method628((byte) 1, var18, true);
        var19.method611(arg0, 0, var7, 0, arg1 - 1, var12, this.field152, var10, var11);
        if (var14 != null) {
            var19.method611(var17, 0, var7, 0, arg1 - 1, var15, this.field152, var14, var16);
        }
        return var19;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZII)I", line = 192)
    public final int method101(int arg0, boolean arg1, int arg2, int arg3) {
        field159++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field150[arg3];
        class236 var8 = null;
        class236 var9 = class376.method2496((byte) -119, var7 >> 16);
        if (arg0 != 1) {
            return -96;
        }
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field170 || class408.field6114) && arg2 != -1 && this.field150.length > arg2) {
            int var11 = this.field150[arg2];
            var8 = class376.method2496((byte) -119, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field152) {
            var5 |= 0x200;
        }
        if (var9.method1440(65280, var10)) {
            var5 |= 0x80;
        }
        if (var9.method1443((byte) 0, var10)) {
            var5 |= 0x100;
        }
        if (var8 != null) {
            if (var8.method1440(65280, var6)) {
                var5 |= 0x80;
            }
            if (var8.method1443((byte) 0, var6)) {
                var5 |= 0x100;
            }
        }
        if (this.field162 != null && arg1) {
            if (arg3 < this.field162.length) {
                int var12 = this.field162[arg3];
                if (var12 != 65535) {
                    class236 var13 = class376.method2496((byte) -119, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method1440(65280, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method1443((byte) 0, var14)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field170 || class408.field6114) && arg2 != -1 && this.field162.length > arg2) {
                int var15 = this.field162[arg2];
                if (var15 != 65535) {
                    class236 var16 = class376.method2496((byte) -119, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method1440(65280, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method1443((byte) 0, var17)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIBIILqc;B)Lqc;", line = 303)
    public final class95 method102(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class95 arg6, byte arg7) {
        field149++;
        int var9 = this.field164[arg1];
        int var10 = this.field150[arg1];
        class236 var11 = class376.method2496((byte) -119, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg6.method628((byte) 1, arg2, true);
        }
        if (arg7 >= -80) {
            method108(-29, 34);
        }
        class236 var13 = null;
        if ((this.field170 || class408.field6114) && arg0 != -1 && arg0 < this.field150.length) {
            int var14 = this.field150[arg0];
            var13 = class376.method2496((byte) -119, var14 >> 16);
            arg0 = var14 & 0xFFFF;
        }
        if (this.field152) {
            arg2 |= 0x200;
        }
        if (var11.method1440(65280, var12)) {
            arg2 |= 0x80;
        }
        if (var11.method1443((byte) 0, var12)) {
            arg2 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method1440(65280, arg0)) {
                arg2 |= 0x80;
            }
            if (var13.method1443((byte) 0, arg0)) {
                arg2 |= 0x100;
            }
        }
        int var15 = arg2 | 0x20;
        class95 var16 = arg6.method628(arg3, var15, true);
        var16.method611(arg0, arg5, var9, 0, arg4 - 1, var13, this.field152, var11, var12);
        return var16;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)V", line = 358)
    public static final void method103(int arg0, int arg1, int arg2) {
        if ((class76.field1027 < class76.field1026)) {
            class76.field1027 = (float) ((double) class76.field1027 / 30.0D + (double) class76.field1027);
            if (class76.field1027 > class76.field1026) {
                class76.field1027 = class76.field1026;
            }
            class363.method2383(124);
            class76.field1030 = (int) class76.field1027 >> 1;
            class76.field1029 = class57.method389(class76.field1030, -1);
        } else if (class76.field1027 > class76.field1026) {
            class76.field1027 = (float) ((double) class76.field1027 - (double) class76.field1027 / 30.0D);
            if (class76.field1026 > class76.field1027) {
                class76.field1027 = class76.field1026;
            }
            class363.method2383(127);
            class76.field1030 = (int) class76.field1027 >> 1;
            class76.field1029 = class57.method389(class76.field1030, -1);
        }
        field167++;
        if (class291.field4211 != -1 && class115.field1564 != -1) {
            int var3 = class291.field4211 - class169.field2222;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class115.field1564 - class133.field1778;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class169.field2222 += var3;
            if (var3 == 0 && var4 == 0) {
                class291.field4211 = -1;
                class115.field1564 = -1;
            }
            class133.field1778 += var4;
            class363.method2383(126);
        }
        if (arg1 < 61) {
            field161 = null;
        }
        if (class292.field4230 > 0) {
            class395.field5935--;
            if (class395.field5935 == 0) {
                class395.field5935 = 100;
                class292.field4230--;
            }
        } else {
            class263.field3834 = -1;
            class423.field6297 = -1;
        }
        if (!class60.field867 || class106.field1425 == null) {
            return;
        }
        for (class368 var5 = (class368) class106.field1425.method2649(0); var5 != null; var5 = (class368) class106.field1425.method2656(0)) {
            class80 var6 = class27.method248(var5.field5473.field6231, (byte) 1);
            if (class19.field329 == 0 && var5.method2429(-111, arg0, arg2)) {
                if (var6.field1102 != null) {
                    if (var6.field1102[4] != null) {
                        class169.method1048(-1, (long) var5.field5473.field6231, var6.field1102[4], -1, var6.field1119, var6.field1099, 0, 1004);
                    }
                    if (var6.field1102[3] != null) {
                        class169.method1048(-1, (long) var5.field5473.field6231, var6.field1102[3], -1, var6.field1119, var6.field1099, 0, 1003);
                    }
                    if (var6.field1102[2] != null) {
                        class169.method1048(-1, (long) var5.field5473.field6231, var6.field1102[2], -1, var6.field1119, var6.field1099, 0, 1010);
                    }
                    if (var6.field1102[1] != null) {
                        class169.method1048(-1, (long) var5.field5473.field6231, var6.field1102[1], -1, var6.field1119, var6.field1099, 0, 1002);
                    }
                    if (var6.field1102[0] != null) {
                        class169.method1048(-1, (long) var5.field5473.field6231, var6.field1102[0], -1, var6.field1119, var6.field1099, 0, 1007);
                    }
                }
                if (!var5.field5473.field6222) {
                    var5.field5473.field6222 = true;
                    class365.method2390(15, var5.field5473.field6231, var6.field1119);
                }
                if (var5.field5473.field6222) {
                    class365.method2390(17, var5.field5473.field6231, var6.field1119);
                }
            } else if (var5.field5473.field6222) {
                var5.field5473.field6222 = false;
                class365.method2390(16, var5.field5473.field6231, var6.field1119);
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILil;)V", line = 515)
    public final void method104(int arg0, class265 arg1) {
        field157++;
        while (true) {
            int var3 = arg1.method1697(108);
            if (var3 == 0) {
                if (arg0 == 256) {
                    return;
                } else {
                    method98();
                    return;
                }
            }
            this.method107(arg1, 108, var3);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 538)
    public static final int method105(String arg0, byte arg1) {
        field165++;
        return arg1 == 20 ? class152.method991(arg0, -8470, true, 10) : 21;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V", line = 560)
    public final void method106(int arg0) {
        if (this.field151 == -1) {
            if (this.field160 == null) {
                this.field151 = 0;
            } else {
                this.field151 = 2;
            }
        }
        if (this.field173 == -1) {
            if (this.field160 == null) {
                this.field173 = 0;
            } else {
                this.field173 = 2;
            }
        }
        field168++;
        if (arg0 < 76) {
            this.field169 = true;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lil;II)V", line = 588)
    private final void method107(class265 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            int var4 = arg0.method1685(8104);
            this.field164 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field164[var5] = arg0.method1685(8104);
            }
            this.field150 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field150[var6] = arg0.method1685(8104);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field150[var7] += arg0.method1685(8104) << 16;
            }
        } else if (arg2 == 2) {
            this.field174 = arg0.method1685(8104);
        } else if (arg2 == 3) {
            this.field160 = new boolean[256];
            int var15 = arg0.method1697(104);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field160[arg0.method1697(-77)] = true;
            }
        } else if (arg2 == 4) {
            this.field163 = true;
        } else if (arg2 == 5) {
            this.field153 = arg0.method1697(-100);
        } else if (arg2 == 6) {
            this.field155 = arg0.method1685(8104);
        } else if (arg2 == 7) {
            this.field154 = arg0.method1685(8104);
        } else if (arg2 == 8) {
            this.field147 = arg0.method1697(73);
        } else if (arg2 == 9) {
            this.field151 = arg0.method1697(93);
        } else if (arg2 == 10) {
            this.field173 = arg0.method1697(65);
        } else if (arg2 == 11) {
            this.field166 = arg0.method1697(84);
        } else if (arg2 == 12) {
            int var8 = arg0.method1697(-94);
            this.field162 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field162[var9] = arg0.method1685(8104);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field162[var10] += arg0.method1685(8104) << 16;
            }
        } else if (arg2 == 13) {
            int var11 = arg0.method1685(8104);
            this.field156 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg0.method1697(-116);
                if (var13 > 0) {
                    this.field156[var12] = new int[var13];
                    this.field156[var12][0] = arg0.method1691(false);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field156[var12][var14] = arg0.method1685(8104);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field152 = true;
        } else if (arg2 == 15) {
            this.field170 = true;
        } else if (arg2 == 16) {
            this.field169 = true;
        }
        field158++;
        if (arg1 < 99) {
            this.method106(48);
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)Lof;", line = 757)
    public static final class421 method108(int arg0, int arg1) {
        field171++;
        class421 var2 = (class421) class69.field958.method2319(arg0 ^ 0xFFFFFEF4, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class333.field4911.method1472(class6.method48((byte) 41, arg1), class403.method2614(arg1, 0), 0);
        class421 var4 = new class421();
        if (arg0 != 256) {
            return null;
        }
        if (var3 != null) {
            var4.method2713(new class265(var3), -11607);
        }
        class69.field958.method2318(var4, false, (long) arg1);
        return var4;
    }
}
