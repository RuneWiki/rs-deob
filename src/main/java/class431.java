import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class431 extends class171 {

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    private int field6203 = 0;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "Ljk;")
    private class378 field6211 = new class378();

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "[I")
    public static int[] field6199 = new int[2];

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field6204;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field6206;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public static int field6207;

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
    public static int field6208;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public static int field6210;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "Lqj;")
    public static class296 field6200;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lsm;ZBIF)V", line = 3)
    public final void method1156(class156 arg0, boolean arg1, byte arg2, int arg3, float arg4) {
        ++field6201;
        super.field2438[super.field2445] = (byte) (arg1 ? arg3 + 40 : arg3 + 30);
        super.field2442[super.field2445] = arg0;
        super.field2433[super.field2445] = arg4;
        ++super.field2445;
        if (super.field2445 >= 5000) {
            super.field2445 = 0;
        }
        int var6 = -33 / ((arg2 - -19) / 50);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Luk;I)V", line = 20)
    public final void method1159(class142 arg0, int arg1) {
        if (arg1 == -20264) {
            super.field2438[super.field2445] = 20;
            ++field6205;
            super.field2442[super.field2445] = arg0;
            ++super.field2445;
            if (super.field2445 >= 5000) {
                super.field2445 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILuk;)V", line = 36)
    public final void method1155(int arg0, class142 arg1) {
        int var3 = 73 / ((arg0 - -32) / 61);
        ++field6213;
        --super.field2434;
        if (~super.field2434 > -1) {
            super.field2434 = 4999;
        }
        super.field2438[super.field2434] = 21;
        super.field2442[super.field2434] = arg1;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Z", line = 62)
    public static final boolean method2709(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class166.field2375; ++var3) {
            class33 var4 = class414.field6015[var3];
            if (var4.field523 == 1) {
                int var5 = var4.field522 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field508 * var5 >> 8) + var4.field510;
                    int var7 = (var4.field517 * var5 >> 8) + var4.field524;
                    int var8 = (var4.field506 * var5 >> 8) + var4.field525;
                    int var9 = (var4.field520 * var5 >> 8) + var4.field514;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field523 == 2) {
                int var10 = arg0 - var4.field522;
                if (var10 > 0) {
                    int var11 = (var4.field508 * var10 >> 8) + var4.field510;
                    int var12 = (var4.field517 * var10 >> 8) + var4.field524;
                    int var13 = (var4.field506 * var10 >> 8) + var4.field525;
                    int var14 = (var4.field520 * var10 >> 8) + var4.field514;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field523 == 3) {
                int var15 = var4.field510 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field513 * var15 >> 8) + var4.field522;
                    int var17 = (var4.field511 * var15 >> 8) + var4.field512;
                    int var18 = (var4.field506 * var15 >> 8) + var4.field525;
                    int var19 = (var4.field520 * var15 >> 8) + var4.field514;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field523 == 4) {
                int var20 = arg2 - var4.field510;
                if (var20 > 0) {
                    int var21 = (var4.field513 * var20 >> 8) + var4.field522;
                    int var22 = (var4.field511 * var20 >> 8) + var4.field512;
                    int var23 = (var4.field506 * var20 >> 8) + var4.field525;
                    int var24 = (var4.field520 * var20 >> 8) + var4.field514;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field523 == 5) {
                int var25 = arg1 - var4.field525;
                if (var25 > 0) {
                    int var26 = (var4.field513 * var25 >> 8) + var4.field522;
                    int var27 = (var4.field511 * var25 >> 8) + var4.field512;
                    int var28 = (var4.field508 * var25 >> 8) + var4.field510;
                    int var29 = (var4.field517 * var25 >> 8) + var4.field524;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V", line = 184)
    public final void method1152(byte arg0) {
        while (~super.field2445 != ~super.field2434) {
            this.method2712(false);
        }
        ++field6202;
        if (arg0 > -70) {
            this.method1156((class156) null, false, (byte) -120, -47, -0.95762587F);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([BB)[B", line = 199)
    public static final byte[] method2710(byte[] arg0, byte arg1) {
        if (arg1 != 88) {
            method2711((byte) -99);
        }
        ++field6207;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class150.method1025(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(B)V", line = 219)
    public static void method2711(byte arg0) {
        if (arg0 >= -95) {
            field6200 = null;
        }
        field6199 = null;
        field6200 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V", line = 232)
    public final void method1157(int arg0, byte arg1) {
        ++field6214;
        if (arg1 <= 18) {
            field6199 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V", line = 245)
    private final void method2712(boolean arg0) {
        ++field6208;
        if (arg0) {
            this.field6211 = null;
        }
        int var2 = super.field2434++;
        if (~super.field2434 <= -5001) {
            super.field2434 = 0;
        }
        this.field6203 = super.field2438[var2];
        Object var3 = super.field2442[var2];
        super.field2442[var2] = null;
        if (~this.field6203 == -22) {
            class341.method2186(this.field6211, (class142) var3);
        } else {
            if (~this.field6203 != -21) {
                if (~this.field6203 <= -31 && ~this.field6203 >= -34) {
                    class352.field4917.method1805(3000.0F, super.field2433[var2] * 1.5F);
                    ((class156) var3).method274(class451.field6574, class48.field738, class245.field3380, class3.field39, this.field6203 - 30 == 0);
                    return;
                }
                if (~this.field6203 <= -41 && ~this.field6203 >= -44) {
                    class352.field4917.method1805(3000.0F, super.field2433[var2] * 1.5F);
                    ((class156) var3).method274(class451.field6574, class48.field738, class245.field3380, class4.field43, ~(this.field6203 + -40) == -1);
                    return;
                }
                if (~this.field6203 == -23) {
                    class352.field4917.method1817(-1, 1583160, 40);
                    return;
                }
                if (~this.field6203 == -24) {
                    class352.field4917.method1741();
                    return;
                }
                if (~this.field6203 == -25) {
                    class352.field4917.method1745(0, (class107[]) null);
                    return;
                }
            } else {
                class142 var4 = (class142) var3;
                if (var4.field2031 != null) {
                    var4.field2031.method128(class352.field4917, true);
                }
                if (var4.field2044 != null) {
                    var4.field2044.method128(class352.field4917, true);
                }
                if (var4.field2052 != null) {
                    var4.field2052.method128(class352.field4917, !arg0);
                }
                if (var4.field2035 != null) {
                    var4.field2035.method128(class352.field4917, true);
                }
                if (var4.field2047 != null) {
                    var4.field2047.method128(class352.field4917, true);
                }
                for (class218 var5 = var4.field2043; var5 != null; var5 = var5.field2884) {
                    var5.field2882.method128(class352.field4917, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(Z)V", line = 336)
    public static final void method2713(boolean arg0) {
        ++field6212;
        class190 var1 = class71.field1101;
        synchronized (class71.field1101) {
            class71.field1101.method1243(1000);
            if (!arg0) {
                method2710((byte[]) null, (byte) 46);
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 352)
    public final void method1153(int arg0) {
        if (arg0 != -1) {
            field6199 = null;
        }
        ++field6210;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLuk;)V", line = 363)
    public final void method1162(byte arg0, class142 arg1) {
        int var3 = -80 % ((arg0 - 59) / 62);
        super.field2438[super.field2445] = 21;
        ++field6206;
        super.field2442[super.field2445] = arg1;
        ++super.field2445;
        if (super.field2445 >= 5000) {
            super.field2445 = 0;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V", line = 385)
    public final void method1161(int arg0, int arg1) {
        super.field2438[super.field2445] = (byte) arg1;
        ++field6209;
        if (arg0 != 0) {
            field6199 = null;
        }
        ++super.field2445;
        if (~super.field2445 <= -5001) {
            super.field2445 = 0;
        }
    }
}
