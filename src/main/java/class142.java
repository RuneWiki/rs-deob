import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class142 extends class16 {

    @OriginalMember(owner = "client!cl", name = "cb", descriptor = "I")
    private int field2121 = 0;

    @OriginalMember(owner = "client!cl", name = "ib", descriptor = "I")
    private int field2127 = 0;

    @OriginalMember(owner = "client!cl", name = "lb", descriptor = "I")
    private int field2130 = 0;

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2111 = "wave:";

    @OriginalMember(owner = "client!cl", name = "ab", descriptor = "I")
    public static int field2119 = 0;

    @OriginalMember(owner = "client!cl", name = "kb", descriptor = "Z")
    public static boolean field2129 = false;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "I")
    private int field2109;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
    private int field2112;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "I")
    private int field2116;

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "I")
    private int field2117;

    @OriginalMember(owner = "client!cl", name = "Z", descriptor = "I")
    private int field2118;

    @OriginalMember(owner = "client!cl", name = "bb", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!cl", name = "db", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!cl", name = "eb", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!cl", name = "fb", descriptor = "I")
    private int field2124;

    @OriginalMember(owner = "client!cl", name = "gb", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!cl", name = "hb", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!cl", name = "mb", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!cl", name = "jb", descriptor = "Lea;")
    public static class217 field2128;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(ZI)V", line = 5)
    public static final void method981(boolean arg0, int arg1) {
        if (arg0) {
            method981(true, 122);
        }
        class272.field4327 = arg1;
        field2110++;
        class232.field3713 = 20;
        class198.field3246 = 3;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)[[I", line = 26)
    public final int[][] method54(int arg0, byte arg1) {
        int var3 = 109 / ((arg1 - 40) / 41);
        int[][] var4 = this.field197.method715(true, arg0);
        if (this.field197.field1548) {
            int[][] var5 = this.method111(0, (byte) 122, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class276.field4376; var12++) {
                this.method983(var7[var12], false, var6[var12], var8[var12]);
                this.field2109 += this.field2121;
                this.field2117 += this.field2130;
                while (this.field2109 < 0) {
                    this.field2109 += 4096;
                }
                this.field2118 += this.field2127;
                if (this.field2118 < 0) {
                    this.field2118 = 0;
                }
                if (this.field2118 > 4096) {
                    this.field2118 = 4096;
                }
                if (this.field2117 < 0) {
                    this.field2117 = 0;
                }
                while (this.field2109 > 4096) {
                    this.field2109 -= 4096;
                }
                if (this.field2117 > 4096) {
                    this.field2117 = 4096;
                }
                this.method982(this.field2109, (byte) -42, this.field2117, this.field2118);
                var9[var12] = this.field2116;
                var10[var12] = this.field2112;
                var11[var12] = this.field2124;
            }
        }
        field2126++;
        return var4;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBII)V", line = 96)
    private final void method982(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -42) {
            this.field2109 = -48;
        }
        int var5 = arg2 <= 2048 ? (arg3 + 4096) * arg2 >> 12 : arg2 + arg3 - (arg2 * arg3 >> 12);
        field2120++;
        if (var5 <= 0) {
            this.field2116 = this.field2112 = this.field2124 = arg2;
            return;
        }
        int var6 = arg0 * 6;
        int var7 = arg2 + arg2 - var5;
        int var8 = var6 >> 12;
        int var9 = (var5 - var7 << 12) / var5;
        int var11 = var9 * var5 >> 12;
        int var12 = var6 - (var8 << 12);
        int var13 = var11 * var12 >> 12;
        int var14 = var7 + var13;
        int var15 = var5 - var13;
        if (var8 == 0) {
            this.field2116 = var5;
            this.field2112 = var14;
            this.field2124 = var7;
        } else if (var8 == 1) {
            this.field2124 = var7;
            this.field2112 = var5;
            this.field2116 = var15;
        } else if (var8 == 2) {
            this.field2116 = var7;
            this.field2112 = var5;
            this.field2124 = var14;
        } else if (var8 == 3) {
            this.field2124 = var5;
            this.field2112 = var15;
            this.field2116 = var7;
        } else if (var8 == 4) {
            this.field2112 = var7;
            this.field2124 = var5;
            this.field2116 = var14;
        } else if (var8 == 5) {
            this.field2112 = var7;
            this.field2124 = var15;
            this.field2116 = var5;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLim;I)V", line = 213)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2121 = arg1.method1389(123);
        } else if (arg2 == 1) {
            this.field2127 = (arg1.method1377(true) << 12) / 100;
        } else if (arg2 == 2) {
            this.field2130 = (arg1.method1377(true) << 12) / 100;
        }
        if (arg0 != -7) {
            method981(false, 28);
        }
        field2113++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZII)V", line = 254)
    private final void method983(int arg0, boolean arg1, int arg2, int arg3) {
        field2123++;
        int var5 = arg2 <= arg0 ? arg0 : arg2;
        int var6 = arg2 >= arg0 ? arg0 : arg2;
        int var7 = var5 >= arg3 ? var5 : arg3;
        if (arg1) {
            this.method983(123, true, 98, -128);
        }
        int var8 = arg3 >= var6 ? var6 : arg3;
        int var9 = var7 - var8;
        this.field2117 = (var7 + var8) / 2;
        if (var9 > 0) {
            int var10 = (var7 - arg2 << 12) / var9;
            int var11 = (var7 - arg3 << 12) / var9;
            int var12 = (var7 - arg0 << 12) / var9;
            if (arg2 == var7) {
                this.field2109 = arg0 == var8 ? var11 + 20480 : -var12 + 4096;
            } else if (arg0 == var7) {
                this.field2109 = arg3 == var8 ? var10 + 4096 : -var11 + 12288;
            } else {
                this.field2109 = arg2 == var8 ? var12 + 12288 : -var10 + 20480;
            }
            this.field2109 /= 6;
        } else {
            this.field2109 = 0;
        }
        if (this.field2117 > 0 && this.field2117 < 4096) {
            this.field2118 = (var9 << 12) / (this.field2117 > 2048 ? 8192 - (this.field2117 * 2) : this.field2117 * 2);
        } else {
            this.field2118 = 0;
        }
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(B)V", line = 309)
    public static final void method984(byte arg0) {
        field2115++;
        if (arg0 <= 18) {
            method984((byte) 105);
        }
        class312.field4849.method1615(87);
        class302.field4719.method1615(56);
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(B)V", line = 330)
    public static void method985(byte arg0) {
        field2128 = null;
        field2111 = null;
        if (arg0 != -66) {
            field2129 = true;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(CZ)Z", line = 351)
    public static final boolean method986(char arg0, boolean arg1) {
        field2131++;
        if (arg1) {
            field2119 = 29;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V", line = 361)
    public class142() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZ)V", line = 369)
    public static final void method987(int arg0, boolean arg1) {
        field2125++;
        class324.field5065.method1625(arg0, (byte) 20);
        if (arg1) {
            method985((byte) 52);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILim;)V", line = 380)
    public static final void method988(int arg0, class192 arg1) {
        field2114++;
        while (true) {
            while (arg1.field3129 < arg1.field3128.length) {
                int var2 = 0;
                int var3 = 0;
                boolean var4 = false;
                if (arg1.method1399(-1172389784) == 1) {
                    var4 = true;
                    var2 = arg1.method1399(arg0 ^ 0xBA1EF696);
                    var3 = arg1.method1399(-1172389784);
                }
                int var5 = arg1.method1399(-1172389784);
                int var6 = arg1.method1399(arg0 - 1172403862);
                int var7 = var5 * 64 - class287.field4528;
                int var8 = class161.field2636 + class331.field5158 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < class240.field3815 && var8 < class331.field5158) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var4 || var11 >= (var2 * 8) && (var2 * 8 + 8) > var11 && var12 >= var3 * 8 && var12 < (var3 * 8 + 8)) {
                                byte var13 = arg1.method1377(true);
                                if (var13 != 0) {
                                    if (class145.field2163[var9][var10] == null) {
                                        class145.field2163[var9][var10] = new byte[4096];
                                    }
                                    class145.field2163[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1377(true);
                                    if (class41.field578[var9][var10] == null) {
                                        class41.field578[var9][var10] = new byte[4096];
                                    }
                                    class41.field578[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var4 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1377(true);
                        if (var16 != 0) {
                            arg1.field3129++;
                        }
                    }
                }
            }
            if (arg0 != 14078) {
                field2129 = true;
            }
            return;
        }
    }
}
