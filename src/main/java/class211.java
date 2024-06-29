import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class211 {

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "[I")
    private int[] field3055;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "[I")
    private int[] field3052;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "[B")
    private byte[] field3048;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "[I")
    public static int[] field3058 = new int[50];

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "[I")
    public static int[] field3054 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "Lik;")
    public static class17 field3056 = new class17(8);

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public static int field3062 = 0;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "B")
    public static byte field3060;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([BII[BII)I", line = 7)
    public final int method1477(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field3053++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg1 + arg4;
        int var8 = 0;
        int var9 = 47 % ((arg5 - 36) / 50);
        int var10 = arg2;
        while (true) {
            byte var11 = arg0[var10];
            if (var11 < 0) {
                var8 = this.field3055[var8];
            } else {
                var8++;
            }
            int var12;
            if ((var12 = this.field3055[var8]) < 0) {
                arg3[arg1++] = (byte) (~var12);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3055[var8];
            }
            int var13;
            if ((var13 = this.field3055[var8]) < 0) {
                arg3[arg1++] = (byte) (~var13);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3055[var8];
            }
            int var14;
            if ((var14 = this.field3055[var8]) < 0) {
                arg3[arg1++] = (byte) (~var14);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3055[var8];
            }
            int var15;
            if ((var15 = this.field3055[var8]) < 0) {
                arg3[arg1++] = (byte) (~var15);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3055[var8];
            }
            int var16;
            if ((var16 = this.field3055[var8]) < 0) {
                arg3[arg1++] = (byte) (~var16);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3055[var8];
            }
            int var17;
            if ((var17 = this.field3055[var8]) < 0) {
                arg3[arg1++] = (byte) (~var17);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3055[var8];
            }
            int var18;
            if ((var18 = this.field3055[var8]) < 0) {
                arg3[arg1++] = (byte) (~var18);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3055[var8];
            }
            int var19;
            if ((var19 = this.field3055[var8]) < 0) {
                arg3[arg1++] = (byte) (~var19);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            var10++;
        }
        return var10 + 1 - arg2;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V", line = 157)
    public static final void method1478(byte arg0) {
        if (arg0 != -67) {
            method1482(-121);
        }
        field3046++;
        class157.field2165.method2240(8);
        int var1 = class157.field2165.method2242(1, -14970);
        if (var1 == 0) {
            return;
        }
        int var2 = class157.field2165.method2242(2, arg0 ^ 0x3A3B);
        if (var2 == 0) {
            class270.field4027[class252.field3614++] = 2047;
        } else if (var2 == 1) {
            int var11 = class157.field2165.method2242(3, arg0 ^ 0x3A3B);
            class173.field2356.method1758(var11, 1, 120);
            int var12 = class157.field2165.method2242(1, -14970);
            if (var12 == 1) {
                class270.field4027[class252.field3614++] = 2047;
            }
        } else if (var2 == 2) {
            if (class157.field2165.method2242(1, -14970) == 1) {
                int var8 = class157.field2165.method2242(3, -14970);
                class173.field2356.method1758(var8, 2, 125);
                int var9 = class157.field2165.method2242(3, arg0 - 14903);
                class173.field2356.method1758(var9, 2, 112);
            } else {
                int var7 = class157.field2165.method2242(3, -14970);
                class173.field2356.method1758(var7, 0, 105);
            }
            int var10 = class157.field2165.method2242(1, -14970);
            if (var10 == 1) {
                class270.field4027[class252.field3614++] = 2047;
            }
        } else if (var2 == 3) {
            class251.field3603 = class157.field2165.method2242(2, arg0 - 14903);
            int var3 = class157.field2165.method2242(1, -14970);
            if (var3 == 1) {
                class270.field4027[class252.field3614++] = 2047;
            }
            int var4 = class157.field2165.method2242(7, -14970);
            int var5 = class157.field2165.method2242(7, arg0 - 14903);
            int var6 = class157.field2165.method2242(1, -14970);
            class173.field2356.method1645(var5, var4, var6 == 1, -42);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V", line = 249)
    public static final void method1479(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class306.field4592[var1] = false;
        }
        class196.field2749 = -1;
        class343.field5168 = 5;
        class171.field2338 = 0;
        int var2 = 27 / ((arg0 - 61) / 50);
        class31.field379 = -1;
        class175.field2379 = 0;
        field3047++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([BI[BZII)I", line = 273)
    public final int method1480(byte[] arg0, int arg1, byte[] arg2, boolean arg3, int arg4, int arg5) {
        if (arg3) {
            return 39;
        }
        int var7 = 0;
        int var8 = arg1 + arg4;
        int var9 = arg5 << 3;
        field3057++;
        while (var8 > arg4) {
            int var10 = arg2[arg4] & 0xFF;
            int var11 = this.field3052[var10];
            byte var12 = this.field3048[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var7 = class190.method1334(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg0[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg0[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg0[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg0[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        return (var9 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lcg;I)V", line = 348)
    public static final void method1481(class316 arg0, int arg1) {
        if (arg1 < 25) {
            return;
        }
        field3051++;
        while (true) {
            while (arg0.field4777 < arg0.field4798.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method2219(16448) == 1) {
                    var4 = arg0.method2219(16448);
                    var2 = true;
                    var3 = arg0.method2219(16448);
                }
                int var5 = arg0.method2219(16448);
                int var6 = arg0.method2219(16448);
                int var7 = class56.field765 - ((var6 * 64) + 1 - class42.field481);
                int var8 = var5 * 64 - class174.field2374;
                if (var8 >= 0 && (var7 - 63) >= 0 && (var8 + 63) < class20.field258 && class56.field765 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var4 * 8) <= var11 && var4 * 8 + 8 > var11 && var12 >= (var3 * 8) && (var3 * 8 + 8) > var12) {
                                int var13 = arg0.method2219(16448);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method2219(16448);
                                        if (class271.field4053[var9][var10] == null) {
                                            class271.field4053[var9][var10] = new byte[4096];
                                        }
                                        class271.field4053[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method2210((byte) -5);
                                        if (class21.field279[var9][var10] == null) {
                                            class21.field279[var9][var10] = new int[4096];
                                        }
                                        class21.field279[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method2210((byte) -5);
                                        if (class21.field266[var9][var10] == null) {
                                            class21.field266[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class302 var17 = class153.method1106(var16, (byte) -94);
                                        if (var17.field4519 != null) {
                                            var17 = var17.method2066((byte) -84);
                                            if (var17 == null || var17.field4529 == -1) {
                                                continue;
                                            }
                                        }
                                        class21.field266[var9][var10][(63 - var12 << 6) + var11] = var17.field4549 + 1;
                                        class30 var18 = new class30();
                                        var18.field369 = var7;
                                        var18.field365 = var17.field4529;
                                        var18.field367 = var8;
                                        class204.field2931.method1339((byte) -121, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method2219(16448);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field4777++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field4777 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field4777 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V", line = 498)
    public static void method1482(int arg0) {
        if (arg0 != -21230) {
            method1483(-32, -122);
        }
        field3056 = null;
        field3058 = null;
        field3054 = null;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "([B)V", line = 509)
    public class211(byte[] arg0) {
        int var2 = arg0.length;
        this.field3055 = new int[8];
        int[] var3 = new int[33];
        this.field3052 = new int[var2];
        this.field3048 = arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3052[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class190.method1334(var12, var11);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field3055[var14] == 0) {
                            this.field3055[var14] = var4;
                        }
                        var14 = this.field3055[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field3055.length <= var14) {
                        int[] var18 = new int[this.field3055.length * 2];
                        for (int var19 = 0; var19 < this.field3055.length; var19++) {
                            var18[var19] = this.field3055[var19];
                        }
                        this.field3055 = var18;
                    }
                }
                this.field3055[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V", line = 635)
    public static final void method1483(int arg0, int arg1) {
        field3059++;
        class23.field295.method720(arg1, 1088);
        class326.field4926.method720(arg1, arg0 ^ 0xFFFFB764);
        class143.field1950.method720(arg1, arg0 ^ 0xFFFFB764);
        class44.field534.method720(arg1, 1088);
        if (arg0 != -19676) {
            field3056 = (class17) null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)I", line = 655)
    public static final int method1484(int arg0, int arg1) {
        field3050++;
        return arg1 == -16255 ? arg0 & 0x3FF : 2;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IC)Z", line = 666)
    public static final boolean method1485(int arg0, char arg1) {
        field3061++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            int var2 = 0;
            char[] var3 = class304.field4570;
            while (var2 < var3.length) {
                char var4 = var3[var2];
                if (arg1 == var4) {
                    return true;
                }
                var2++;
            }
        }
        if (arg0 != 1) {
            field3056 = (class17) null;
        }
        return false;
    }
}
