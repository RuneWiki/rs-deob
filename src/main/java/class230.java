import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class230 extends class318 {

    @OriginalMember(owner = "client!qm", name = "S", descriptor = "I")
    private int field4025 = 0;

    @OriginalMember(owner = "client!qm", name = "R", descriptor = "Lcd;")
    private class69 field4024 = new class69(16);

    @OriginalMember(owner = "client!qm", name = "X", descriptor = "I")
    private int field4030 = 0;

    @OriginalMember(owner = "client!qm", name = "Y", descriptor = "Ldg;")
    private class317 field4031 = new class317();

    @OriginalMember(owner = "client!qm", name = "ab", descriptor = "J")
    private long field4033 = 0L;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "I")
    private int field4004;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "Lda;")
    private class120 field4003;

    @OriginalMember(owner = "client!qm", name = "V", descriptor = "Z")
    private boolean field4028;

    @OriginalMember(owner = "client!qm", name = "U", descriptor = "Ldg;")
    private class317 field4027;

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "I")
    private int field4017;

    @OriginalMember(owner = "client!qm", name = "H", descriptor = "Lda;")
    private class120 field4015;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "Ltj;")
    private class177 field4002;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "Lua;")
    private class90 field3996;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "I")
    private int field4005;

    @OriginalMember(owner = "client!qm", name = "Z", descriptor = "Z")
    private boolean field4032;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "Lee;")
    private class278 field4000;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "Lud;")
    public static class279 field4010 = class130.method1024(")4a=", 255);

    @OriginalMember(owner = "client!qm", name = "O", descriptor = "I")
    public static int field4021 = 0;

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "Lud;")
    public static class279 field4011 = class130.method1024("runes", 255);

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!qm", name = "E", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!qm", name = "I", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!qm", name = "K", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!qm", name = "L", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!qm", name = "P", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!qm", name = "Q", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!qm", name = "T", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!qm", name = "M", descriptor = "Lwe;")
    private class51 field4020;

    @OriginalMember(owner = "client!qm", name = "W", descriptor = "Z")
    private boolean field4029;

    @OriginalMember(owner = "client!qm", name = "G", descriptor = "[B")
    private byte[] field4014;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V", line = 4)
    public final void method1654(int arg0) {
        field4023++;
        if (this.field4003 != null && arg0 == 14405) {
            this.field4029 = true;
            if (this.field4027 == null) {
                this.field4027 = new class317();
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Lwe;", line = 27)
    public final class51 method1655(int arg0) {
        field4013++;
        if (this.field4020 != null) {
            return this.field4020;
        }
        if (this.field4000 == null) {
            if (this.field4002.method1377(106)) {
                return null;
            }
            this.field4000 = this.field4002.method1385(this.field4004, true, -1436181648, 255, (byte) 0);
        }
        if (this.field4000.field4920) {
            return null;
        }
        byte[] var2 = this.field4000.method873(-4958);
        if (this.field4000 instanceof class164) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4020 = new class51(var2, this.field4005);
                if (this.field4020.field1052 != this.field4017) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var6) {
                this.field4020 = null;
                if (this.field4002.method1377(94)) {
                    this.field4000 = null;
                } else {
                    this.field4000 = this.field4002.method1385(this.field4004, true, -1436181648, 255, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4020 = new class51(var2, this.field4005);
            } catch (RuntimeException var7) {
                this.field4002.method1374((byte) -86);
                this.field4020 = null;
                if (this.field4002.method1377(77)) {
                    this.field4000 = null;
                } else {
                    this.field4000 = this.field4002.method1385(this.field4004, true, -1436181648, 255, (byte) 0);
                }
                return null;
            }
            if (this.field4015 != null) {
                this.field3996.method777(5182, var2, this.field4015, this.field4004);
            }
        }
        int var5 = 71 % ((arg0 + 48) / 44);
        this.field4000 = null;
        if (this.field4003 != null) {
            this.field4025 = 0;
            this.field4014 = new byte[this.field4020.field1046];
        }
        return this.field4020;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZZ)V", line = 125)
    public static final void method1656(boolean arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field3997++;
        if (arg0 != class48.field974) {
            class48.field974 = arg0;
            class134.method1052((byte) -127);
        }
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)I", line = 142)
    public final int method1657(int arg0) {
        field4006++;
        if (this.field4020 == null) {
            return 0;
        } else if (arg0 > -17) {
            return 72;
        } else if (this.field4028) {
            class314 var2 = this.field4027.method2248(106);
            return var2 == null ? 0 : (int) var2.field5539;
        } else {
            return this.field4020.field1061;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)I", line = 169)
    public final int method1658(boolean arg0) {
        field4019++;
        if (arg0) {
            this.method1670(25, 17, (byte) -79);
        }
        return this.field4020 == null ? 0 : this.field4020.field1061;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(Z)V", line = 185)
    public static void method1659(boolean arg0) {
        if (arg0) {
            method1663(94, 80);
        }
        field4010 = null;
        field4011 = null;
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)I", line = 197)
    public final int method1660(int arg0) {
        field4022++;
        return arg0 <= 59 ? 78 : this.field4025;
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(Z)I", line = 219)
    public final int method1661(boolean arg0) {
        if (arg0) {
            field4011 = (class279) null;
        }
        field4001++;
        if (this.method1655(-112) == null) {
            return this.field4000 == null ? 0 : this.field4000.method869(true);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V", line = 243)
    public final void method1662(byte arg0) {
        field4026++;
        if (this.field4027 != null) {
            if (this.method1655(44) == null) {
                return;
            }
            if (this.field4028) {
                boolean var6 = true;
                for (class314 var7 = this.field4027.method2248(-23); var7 != null; var7 = this.field4027.method2240(1138)) {
                    int var8 = (int) var7.field5539;
                    if (this.field4014[var8] == 0) {
                        this.method1670(var8, 1, (byte) -95);
                    }
                    if (this.field4014[var8] == 0) {
                        var6 = false;
                    } else {
                        var7.method2221(true);
                    }
                }
                while (this.field4030 < this.field4020.field1050.length) {
                    if (this.field4020.field1050[this.field4030] == 0) {
                        this.field4030++;
                    } else {
                        if (this.field3996.field1706 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field4014[this.field4030] == 0) {
                            this.method1670(this.field4030, 1, (byte) -78);
                        }
                        if (this.field4014[this.field4030] == 0) {
                            class314 var9 = new class314();
                            var6 = false;
                            var9.field5539 = (long) this.field4030;
                            this.field4027.method2246(true, var9);
                        }
                        this.field4030++;
                    }
                }
                if (var6) {
                    this.field4030 = 0;
                    this.field4028 = false;
                }
            } else if (this.field4029) {
                boolean var2 = true;
                for (class314 var3 = this.field4027.method2248(-46); var3 != null; var3 = this.field4027.method2240(1138)) {
                    int var4 = (int) var3.field5539;
                    if (this.field4014[var4] != 1) {
                        this.method1670(var4, 2, (byte) -62);
                    }
                    if (this.field4014[var4] == 1) {
                        var3.method2221(true);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field4020.field1050.length > this.field4030) {
                    if (this.field4020.field1050[this.field4030] == 0) {
                        this.field4030++;
                    } else {
                        if (this.field4002.method1387(false)) {
                            var2 = false;
                            break;
                        }
                        if (this.field4014[this.field4030] != 1) {
                            this.method1670(this.field4030, 2, (byte) -25);
                        }
                        if (this.field4014[this.field4030] != 1) {
                            var2 = false;
                            class314 var5 = new class314();
                            var5.field5539 = (long) this.field4030;
                            this.field4027.method2246(true, var5);
                        }
                        this.field4030++;
                    }
                }
                if (var2) {
                    this.field4029 = false;
                    this.field4030 = 0;
                }
            } else {
                this.field4027 = null;
            }
        }
        int var10 = 89 / ((-arg0 - 75) / 44);
        if (!this.field4032 || class127.method1015(21504) < this.field4033) {
            return;
        }
        for (class278 var11 = (class278) this.field4024.method609(-26368); var11 != null; var11 = (class278) this.field4024.method604(2)) {
            if (!var11.field4920) {
                if (var11.field4910) {
                    if (!var11.field4914) {
                        throw new RuntimeException();
                    }
                    var11.method2221(true);
                } else {
                    var11.field4910 = true;
                }
            }
        }
        this.field4033 = class127.method1015(21504) + 1000L;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)Z", line = 420)
    public static final boolean method1663(int arg0, int arg1) {
        field3999++;
        int var2 = -110 % ((arg1 - 61) / 33);
        byte var3 = 0;
        byte var4 = 0;
        if (class126.field2338 == null) {
            if (class97.field1824 || class155.field2805 == null) {
                class126.field2338 = new class66(512, 512);
            } else {
                class126.field2338 = (class66) class155.field2805;
            }
            int[] var5 = class126.field2338.field1323;
            int var6 = var5.length;
            for (int var7 = 0; var7 < var6; var7++) {
                var5[var7] = 1;
            }
            for (int var8 = var4 + 1; var8 < 104 - var4 - 1; var8++) {
                int var9 = ((var4 + 103 - var8) * 4 * 512) + 24628;
                for (int var10 = var3 + 1; var10 < 104 - var3 - 1; var10++) {
                    if ((class257.field4573[arg0][var10][var8] & 0x18) == 0) {
                        class11.method78(var5, var9, 512, arg0, var10, var8);
                    }
                    if (arg0 < 3 && (class257.field4573[arg0 + 1][var10][var8] & 0x8) != 0) {
                        class11.method78(var5, var9, 512, arg0 + 1, var10, var8);
                    }
                    var9 += 4;
                }
            }
            class45.field954 = 0;
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    long var13 = class266.method1907(class287.field5134, var3 + var11, var4 + var12);
                    if (var13 != 0L) {
                        class264 var15 = class252.method1808(Integer.MAX_VALUE & (int) (var13 >>> 32), (byte) 4);
                        int var16 = var15.field4722;
                        if (var15.field4760 != null) {
                            for (int var17 = 0; var17 < var15.field4760.length; var17++) {
                                if (var15.field4760[var17] != -1) {
                                    class264 var18 = class252.method1808(var15.field4760[var17], (byte) 4);
                                    if (var18.field4722 >= 0) {
                                        var16 = var18.field4722;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var16 >= 0) {
                            int var19 = var4 + var12;
                            int var20 = var3 + var11;
                            if (var16 != 22 && var16 != 29 && var16 != 34 && var16 != 36 && var16 != 46 && var16 != 47 && var16 != 48) {
                                int[][] var21 = class90.field1702[class287.field5134].field2215;
                                for (int var22 = 0; var22 < 10; var22++) {
                                    int var23 = (int) (Math.random() * 4.0D);
                                    if (var23 == 0 && var20 > 0 && var20 > var11 - 3 && (var21[var20 - 1][var19] & 0x12C0108) == 0) {
                                        var20--;
                                    }
                                    if (var23 == 1 && var20 < 103 && (var11 + 3) > var20 && (var21[var20 + 1][var19] & 0x12C0180) == 0) {
                                        var20++;
                                    }
                                    if (var23 == 2 && var19 > 0 && var12 - 3 < var19 && (var21[var20][var19 - 1] & 0x12C0102) == 0) {
                                        var19--;
                                    }
                                    if (var23 == 3 && var19 < 103 && (var12 + 3) > var19 && (var21[var20][var19 + 1] & 0x12C0120) == 0) {
                                        var19++;
                                    }
                                }
                            }
                            class130.field2378[class45.field954] = var15.field4727;
                            class306.field5435[class45.field954] = var20 - var3;
                            class52.field1100[class45.field954] = var19 - var4;
                            class45.field954++;
                        }
                    }
                }
            }
        }
        class126.field2338.method590();
        int var24 = 228 - (-((int) (Math.random() * 20.0D)) - ((int) (Math.random() * 20.0D) + 238 - 10 << 8) - ((int) (Math.random() * 20.0D) + 228 << 16));
        int var25 = (((int) (Math.random() * 20.0D)) + 238) - 10 << 16;
        for (int var26 = 1; var26 < 103; var26++) {
            for (int var27 = 1; var27 < 103; var27++) {
                if ((class257.field4573[arg0][var3 + var27][var4 + var26] & 0x18) == 0 && !class152.method1204(var24, arg0, var26, var3, var25, var27, 42, var4)) {
                    if (class97.field1824) {
                        class146.field2637 = null;
                    } else {
                        class250.field4455.method562(32);
                    }
                    return false;
                }
                if (arg0 < 3 && (class257.field4573[arg0 + 1][var3 + var27][var4 + var26] & 0x8) != 0 && !class152.method1204(var24, arg0 + 1, var26, var3, var25, var27, 54, var4)) {
                    if (class97.field1824) {
                        class146.field2637 = null;
                    } else {
                        class250.field4455.method562(32);
                    }
                    return false;
                }
            }
        }
        if (class97.field1824) {
            int[] var28 = class126.field2338.field1323;
            int var29 = var28.length;
            for (int var30 = 0; var30 < var29; var30++) {
                if (var28[var30] == 0) {
                    var28[var30] = 1;
                }
            }
            class155.field2805 = new class203(class126.field2338);
        } else {
            class155.field2805 = class126.field2338;
        }
        if (class97.field1824) {
            class146.field2637 = null;
        } else {
            class250.field4455.method562(32);
        }
        class126.field2338 = null;
        return true;
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(Z)V", line = 650)
    public static final void method1664(boolean arg0) {
        class129.method1021();
        field4018++;
        class134.field2444 = new class147[7];
        class134.field2444[1] = new class186();
        class134.field2444[2] = new class10();
        class134.field2444[3] = new class114();
        if (!arg0) {
            field4021 = -4;
        }
        class134.field2444[4] = new class296();
        class134.field2444[5] = new class145();
        class134.field2444[6] = new class300();
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZ)V", line = 670)
    public final void method1665(int arg0, boolean arg1) {
        field3995++;
        if (this.field4003 == null || arg1) {
            return;
        }
        for (class314 var3 = this.field4031.method2248(125); var3 != null; var3 = this.field4031.method2240(1138)) {
            if (((long) arg0) == var3.field5539) {
                return;
            }
        }
        class314 var4 = new class314();
        var4.field5539 = (long) arg0;
        this.field4031.method2246(true, var4);
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(BI)Lgd;", line = 702)
    public static final class307 method1666(byte arg0, int arg1) {
        field3993++;
        class307 var2 = (class307) class204.field3627.method1767((byte) -37, (long) arg1);
        if (arg0 != -19) {
            field4010 = (class279) null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class265.field4775.method1192(0, 1, arg1 & 0x7FFF);
        } else {
            var3 = class94.field1767.method1192(0, 1, arg1);
        }
        class307 var4 = new class307();
        if (var3 != null) {
            var4.method2191(new class53(var3), 0);
        }
        if (arg1 >= 32768) {
            var4.method2190(32768);
        }
        class204.field3627.method1771(arg0 + 92, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)I", line = 750)
    public final int method1667(int arg0, int arg1) {
        if (arg0 < 3) {
            method1663(-88, 6);
        }
        field3994++;
        class278 var3 = (class278) this.field4024.method610((long) arg1, -1);
        return var3 == null ? 0 : var3.method869(true);
    }

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)V", line = 767)
    public final void method1668(int arg0) {
        int var2 = 125 % ((arg0 - 37) / 49);
        field4009++;
        if (this.field4027 == null || this.method1655(-93) == null) {
            return;
        }
        for (class314 var3 = this.field4031.method2248(119); var3 != null; var3 = this.field4031.method2240(1138)) {
            int var4 = (int) var3.field5539;
            if (var4 < 0 || var4 >= this.field4020.field1046 || this.field4020.field1050[var4] == 0) {
                var3.method2221(true);
            } else {
                if (this.field4014[var4] == 0) {
                    this.method1670(var4, 1, (byte) -126);
                }
                if (this.field4014[var4] == -1) {
                    this.method1670(var4, 2, (byte) -82);
                }
                if (this.field4014[var4] == 1) {
                    var3.method2221(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI)[B", line = 816)
    public final byte[] method1669(byte arg0, int arg1) {
        field4007++;
        class278 var3 = this.method1670(arg1, 0, (byte) -83);
        if (var3 == null) {
            return null;
        } else if (arg0 == 127) {
            byte[] var4 = var3.method873(-4958);
            var3.method2221(true);
            return var4;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(ILda;Lda;Ltj;Lua;IIZ)V", line = 1083)
    public class230(int arg0, class120 arg1, class120 arg2, class177 arg3, class90 arg4, int arg5, int arg6, boolean arg7) {
        this.field4004 = arg0;
        this.field4003 = arg1;
        if (this.field4003 == null) {
            this.field4028 = false;
        } else {
            this.field4028 = true;
            this.field4027 = new class317();
        }
        this.field4017 = arg6;
        this.field4015 = arg2;
        this.field4002 = arg3;
        this.field3996 = arg4;
        this.field4005 = arg5;
        this.field4032 = arg7;
        if (this.field4015 != null) {
            this.field4000 = this.field3996.method773(this.field4015, 2, this.field4004);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIB)Lee;", line = 855)
    private final class278 method1670(int arg0, int arg1, byte arg2) {
        field3998++;
        class278 var4 = (class278) this.field4024.method610((long) arg0, -1);
        if (var4 != null && arg1 == 0 && !var4.field4914 && var4.field4920) {
            var4.method2221(true);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field4003 == null || this.field4014[arg0] == -1) {
                    if (this.field4002.method1377(80)) {
                        return null;
                    }
                    var4 = this.field4002.method1385(arg0, true, -1436181648, this.field4004, (byte) 2);
                } else {
                    var4 = this.field3996.method773(this.field4003, 2, arg0);
                }
            } else if (arg1 == 1) {
                if (this.field4003 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3996.method775((byte) -76, this.field4003, arg0);
            } else if (arg1 == 2) {
                if (this.field4003 == null) {
                    throw new RuntimeException();
                }
                if (this.field4014[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4002.method1387(false)) {
                    return null;
                }
                var4 = this.field4002.method1385(arg0, false, -1436181648, this.field4004, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field4024.method612(false, var4, (long) arg0);
        }
        if (var4.field4920) {
            return null;
        }
        byte[] var5 = var4.method873(-4958);
        if (arg2 > -19) {
            this.method1661(true);
        }
        if (!var4 instanceof class164) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class238.field4182.reset();
                class238.field4182.update(var5, 0, var5.length - 2);
                int var6 = (int) class238.field4182.getValue();
                if (this.field4020.field1060[arg0] != var6) {
                    throw new RuntimeException();
                }
                this.field4002.field3201 = 0;
                this.field4002.field3204 = 0;
            } catch (RuntimeException var14) {
                this.field4002.method1374((byte) -86);
                var4.method2221(true);
                if (var4.field4914 && !this.field4002.method1377(101)) {
                    class103 var8 = this.field4002.method1385(arg0, true, -1436181648, this.field4004, (byte) 2);
                    this.field4024.method612(false, var8, (long) arg0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4020.field1053[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field4020.field1053[arg0];
            if (this.field4003 != null) {
                this.field3996.method777(5182, var5, this.field4003, arg0);
                if (this.field4014[arg0] != 1) {
                    this.field4025++;
                    this.field4014[arg0] = 1;
                }
            }
            if (!var4.field4914) {
                var4.method2221(true);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class238.field4182.reset();
            class238.field4182.update(var5, 0, var5.length - 2);
            int var9 = (int) class238.field4182.getValue();
            if (this.field4020.field1060[arg0] != var9) {
                throw new RuntimeException();
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4020.field1053[arg0] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field4014[arg0] != 1) {
                if (this.field4014[arg0] != 0) {
                }
                this.field4025++;
                this.field4014[arg0] = 1;
            }
            if (!var4.field4914) {
                var4.method2221(true);
            }
            return var4;
        } catch (Exception var13) {
            this.field4014[arg0] = -1;
            var4.method2221(true);
            if (var4.field4914 && !this.field4002.method1377(106)) {
                class103 var12 = this.field4002.method1385(arg0, true, -1436181648, this.field4004, (byte) 2);
                this.field4024.method612(false, var12, (long) arg0);
            }
            return null;
        }
    }
}
