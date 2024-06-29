import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class597 extends class175 {

    @OriginalMember(owner = "client!ul", name = "G", descriptor = "Lmw;")
    public static class517 field8123 = new class517(68, 3);

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "Ljb;")
    public static class519 field8130 = new class519(110, -1);

    @OriginalMember(owner = "client!ul", name = "P", descriptor = "I")
    public static int field8132 = 0;

    @OriginalMember(owner = "client!ul", name = "R", descriptor = "[J")
    public static long[] field8134 = new long[10];

    @OriginalMember(owner = "client!ul", name = "E", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!ul", name = "F", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!ul", name = "H", descriptor = "I")
    public static int field8124;

    @OriginalMember(owner = "client!ul", name = "I", descriptor = "I")
    public static int field8125;

    @OriginalMember(owner = "client!ul", name = "J", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!ul", name = "K", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!ul", name = "M", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!ul", name = "O", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!ul", name = "Q", descriptor = "I")
    public static int field8133;

    @OriginalMember(owner = "client!ul", name = "L", descriptor = "[Lpn;")
    private class775[] field8128;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z[[I)V", line = 4)
    private final void method3341(boolean arg0, int[][] arg1) {
        ++field8124;
        int var3 = class598.field8136;
        int var4 = class561.field7687;
        class388.method2405(arg0, arg1);
        class723.method3996(0, class698.field9254, class412.field5896, (byte) 3, 0);
        if (this.field8128 != null) {
            for (int var5 = 0; this.field8128.length > var5; ++var5) {
                class775 var6 = this.field8128[var5];
                int var7 = var6.field10662;
                int var8 = var6.field10661;
                if (var7 >= 0) {
                    if (var8 < 0) {
                        var6.method109(-1, var4, var3);
                    } else {
                        var6.method110(var3, 512, var4);
                    }
                } else if (~var8 <= -1) {
                    var6.method111(var4, var3, 17793);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BIIII)V", line = 53)
    public static final void method3342(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8127;
        if (arg0 > -67) {
            method3345(true);
        }
        class778 var5 = class389.method2406(-124, (long) arg1 | (long) arg2 << 32, 18);
        var5.method4274(100);
        var5.field10690 = arg4;
        var5.field10692 = arg3;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V", line = 69)
    public static final void method3343(int arg0, int arg1) {
        class313.field4423 = -1;
        if (arg1 != 0) {
            field8133 = 74;
        }
        class213.field2800 = -1;
        class720.field9789 = arg0;
        ++field8121;
        class642.method3536(127);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILdt;Z)V", line = 84)
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                super.field2305 = ~arg1.method1731((byte) 64) == -2;
            }
        } else {
            this.field8128 = new class775[arg1.method1731((byte) 64)];
            for (int var4 = 0; this.field8128.length > var4; ++var4) {
                int var5 = arg1.method1731((byte) 64);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field8128[var4] = class757.method4153(-31399, arg1);
                            }
                        } else {
                            this.field8128[var4] = class515.method3007(arg1, (byte) 51);
                        }
                    } else {
                        this.field8128[var4] = class454.method2697(true, arg1);
                    }
                } else {
                    this.field8128[var4] = class534.method3098(false, arg1);
                }
            }
        }
        ++field8129;
        if (arg2) {
            this.method44(-23, (class254) null, true);
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V", line = 158)
    public class597() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)V", line = 163)
    public static final void method3344(byte arg0) {
        if (arg0 == -36) {
            class719.field9773.method1517(arg0 + 36);
            ++field8126;
            for (int var1 = 0; var1 < 32; ++var1) {
                class83.field1166[var1] = 0L;
            }
            for (int var2 = 0; ~var2 > -33; ++var2) {
                class384.field5584[var2] = 0L;
            }
            class477.field6696 = 0;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)V", line = 194)
    public static void method3345(boolean arg0) {
        field8123 = null;
        if (arg0) {
            field8134 = null;
        }
        field8134 = null;
        field8130 = null;
    }

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)[Lre;", line = 206)
    public static final class626[] method3346(int arg0) {
        if (class159.field2141 == null) {
            class626[] var1 = class307.method1984(class786.field10800, 19304);
            class626[] var2 = new class626[var1.length];
            int var3 = 0;
            int var4 = class125.field1721.field5182.method1840(43);
            label73: for (int var5 = 0; var5 < var1.length; ++var5) {
                class626 var9 = var1[var5];
                if ((~var9.field8484 >= -1 || ~var9.field8484 <= -25) && var9.field8479 >= 800 && var9.field8481 >= 600 && (~var4 != -3 || ~var9.field8479 >= -801 && ~var9.field8481 >= -601) && (~var4 != -2 || var9.field8479 <= 1024 && ~var9.field8481 >= -769)) {
                    for (int var10 = 0; var10 < var3; ++var10) {
                        class626 var11 = var2[var10];
                        if (~var9.field8479 == ~var11.field8479 && ~var9.field8481 == ~var11.field8481) {
                            if (var11.field8484 < var9.field8484) {
                                var2[var10] = var9;
                            }
                            continue label73;
                        }
                    }
                    var2[var3] = var9;
                    ++var3;
                }
            }
            class159.field2141 = new class626[var3];
            class421.method2533(var2, 0, class159.field2141, 0, var3);
            int[] var6 = new int[class159.field2141.length];
            for (int var7 = 0; var7 < class159.field2141.length; ++var7) {
                class626 var8 = class159.field2141[var7];
                var6[var7] = var8.field8481 * var8.field8479;
            }
            class623.method3440((byte) -38, class159.field2141, var6);
        }
        if (arg0 != 0) {
            return null;
        } else {
            ++field8122;
            return class159.field2141;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)[I", line = 293)
    public final int[] method47(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field8131;
            int[] var3 = super.field2310.method91(0, arg1);
            if (super.field2310.field169) {
                this.method3341(true, super.field2310.method93(22563));
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)[[I", line = 316)
    public final int[][] method238(int arg0, byte arg1) {
        ++field8125;
        int[][] var3 = super.field2316.method3602(arg0, (byte) -74);
        if (arg1 > -47) {
            method3343(-31, -124);
        }
        if (super.field2316.field8746) {
            int var4 = class598.field8136;
            int var5 = class561.field7687;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field2316.method3600((byte) 88);
            this.method3341(true, var6);
            for (int var8 = 0; var8 < class561.field7687; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class598.field8136; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class519.method3018(4080, var15 << 4);
                    var12[var14] = class519.method3018(65280, var15) >> 4;
                    var11[var14] = class519.method3018(4080, var15 >> 12);
                }
            }
        }
        return var3;
    }
}
